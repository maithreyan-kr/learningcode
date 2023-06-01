package DaoInterface;

import java.util.List;

import employee.Employee;

public interface EmployeeDao 
{
	public int save(Employee emp);
	
	public List<Employee> getEmployeewithId();
	
	public List<Employee> getAllEmployees();
    
	public int delete(Employee emp);
	
	public int update(Employee emp);
	
	public void cleanup();
}
