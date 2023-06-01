package EmployeeDaoImple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import employee.Employee;

public class ResultExtractor implements ResultSetExtractor<List<Employee>>
{

	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		List<Employee> list= new ArrayList<Employee>();
		while(rs.next())
		{
			Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setExperience(rs.getString(3));
			e.setSalary(rs.getInt(4));
			list.add(e);
		}
		return list;
	}

}
