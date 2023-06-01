package employee;

public class Employee 
{
  private int id;
  private String name;
  private String experience;
  private Integer salary;
  
  public Employee() {
	  
  }
  
public Employee(int id, String name, String experience, Integer salary)
{
	this.id = id;
	this.name = name;
	this.experience = experience;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", experience=" + experience + ", salary=" + salary + "]";
}
  
}
