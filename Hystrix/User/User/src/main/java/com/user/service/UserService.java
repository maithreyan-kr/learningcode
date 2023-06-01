package com.user.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.user.bean.UserAccount;
import com.user.repository.Userrepository;

@Service
public class UserService 
{
	@Autowired
	  private RestTemplate restTemplate;
	@Autowired
	 private Userrepository userrepo;
	
	@HystrixCommand(fallbackMethod ="fallbackmethod")
	  public List<UserAccount> showEmployees(@PathVariable("id") String id) 
	{
	    System.out.println(id);
	   
	    List<UserAccount> accounts = restTemplate.exchange(
	    	    "http://ACCOUNT/accounts/{empId}", HttpMethod.GET, null, new
	    	    ParameterizedTypeReference<List<UserAccount>>(){}, id).getBody();
	    System.out.println("main method");
	    userrepo.saveAll(accounts);
	    return accounts;

	  }
	
	 public List<UserAccount>fallbackmethod(@PathVariable("id") String id) 
	  {
		 System.out.println("fall back method");
		  UserAccount acc=new UserAccount();
		  acc.setAccountId(id);
		  acc.setBranch("no Branch");
		  acc.setEmpId("no EmployeeId");
		  UserAccount acc1=new UserAccount();
		  acc1.setAccountId(id);
		  acc1.setBranch("no Branch");
		  acc1.setEmpId("no EmployeeId");
		   List<UserAccount> accounts=new ArrayList<>();
		   accounts.add(acc);
		   accounts.add(acc1);
		   return accounts;
	  }

}
