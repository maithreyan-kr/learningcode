package beanScopeAndLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student implements Details{
	private String name;
	private String grade;
	private String subject;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Init method in student class executing...");
	}
	
	

	public void details()
	{
		System.out.println("Student [name=" + name + ", grade=" + grade + ", subject=" + subject + "]");	
		
	} 
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method in student class executing...");
	}


}
