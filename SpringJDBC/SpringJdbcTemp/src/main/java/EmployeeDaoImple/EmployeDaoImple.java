package EmployeeDaoImple;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DaoInterface.EmployeeDao;
import employee.Employee;

@Repository("empdao")
public class EmployeDaoImple implements EmployeeDao 
{
	
	private JdbcTemplate jdbctemplate;

	@Autowired
	public void setDatasource(DataSource datasource) 
	{
		this.jdbctemplate= new JdbcTemplate(datasource);
		
	}

	public int save(Employee e) 
	{
		String sql="insert into employee values( '"+e.getId()+"','"+e.getName()+"','"+e.getExperience()+"','"+e.getSalary()+"')";  
		return jdbctemplate.update(sql);
	}

	public List<Employee> getEmployeewithId() 
	{
		String sql="select *from employee where id=1";
		return jdbctemplate.query(sql, new ResultExtractor());
	}

	public List<Employee> getAllEmployees() 
	{
		String sql="select *from employee";
		return 	jdbctemplate.query(sql,new RowMappers());
	}

	public int delete(Employee emp) {
		String query="delete from employee where id='"+emp.getId()+"' ";  
	    return jdbctemplate.update(query);  
	}

	public int update(Employee e) {
		String query="update employee set salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
			    return jdbctemplate.update(query); 
	}

	public void cleanup() {
		String sql="truncate table employee";
		jdbctemplate.execute(sql);
		
	}

}
