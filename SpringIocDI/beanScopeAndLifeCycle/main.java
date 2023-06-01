package beanScopeAndLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student std= (Student)context.getBean("student");//student-SCOPE_PROTOTYPE
		
		std.setSubject("Maths");
		std.details();
		
		Student std1= (Student)context.getBean("student");
		std1.details();
		
         Teacher tech= (Teacher)context.getBean("teacher");//Teacher-SCOPE_SINGLETON
         
         tech.setSubject("Computer");
		 tech.details();
		 
		 Teacher tech1= (Teacher)context.getBean("teacher");
		 tech1.details();
		 
		((ClassPathXmlApplicationContext)context).registerShutdownHook();

	}

}
