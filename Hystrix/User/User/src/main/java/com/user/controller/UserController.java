package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.user.bean.UserAccount;
import com.user.service.UserService;

@RestController
public class UserController 
{
	 @Autowired
	  private UserService userService;
	  
	  @GetMapping("/user/{id}")
	  public List<UserAccount> showEmployees(@PathVariable("id") String id) 
	  {     
	    List<UserAccount> accounts = userService.showEmployees(id);
	    // displaying accounts
	    for(UserAccount acct : accounts) {
	      System.out.println(acct.getEmpId());
	      System.out.println(acct.getAccountId());
	      System.out.println(acct.getBranch());
	    }
	    return accounts;          
	  }
	 
	 
	  
	  

}
