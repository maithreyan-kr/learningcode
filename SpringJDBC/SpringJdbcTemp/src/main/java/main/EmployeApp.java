package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import EmployeeDaoImple.EmployeDaoImple;
import employee.Employee;



public class EmployeApp 
{
	
	public static void main(String[] args)

	{
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("bean-cp.xml");
		 
		 //creating bean object
		 EmployeDaoImple dao=(EmployeDaoImple)ctx.getBean("empdao");
		 
		 //save the data
		 int status= dao.save(new Employee(1,"Raja","six",70000));
		 System.out.println(status+" value updated");
		 //Select where id=1
		 System.out.println("Employee with id=1");
		 List<Employee> list1 = dao.getEmployeewithId();
		 for(Employee e:list1)  
		        System.out.println(e);  
		//Employee List
		 System.out.println("List of all Employees");
		 List<Employee> list2=dao.getAllEmployees();
		 for(Employee e1:list2)  
		        System.out.println(e1); 
		 
		//delete
		 Employee e=new Employee(); 
		    e.setId(4); 
		    int status1=dao.delete(e); 
		    System.out.println(status1+" record deleted with id "+e.getId());
		    
		  //update
		    Employee e1= new Employee();
		    e1.setId(1);
		    e1.setSalary(80000);
		    int status3=dao.update(e1);
		    System.out.println(status3+" record updated with id "+e1.getId());
		    
		  //Employee List after all operation
			 System.out.println("List of all Employees after all operation");
			 List<Employee> list3=dao.getAllEmployees();
			 for(Employee e3:list3)  
			        System.out.println(e3); 
		    
		    //truncare
		   // dao.cleanup();
			 
			
			 ((ClassPathXmlApplicationContext)ctx).close();
		 
	}
	

}
