package EmployeeDaoImple;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employee.Employee;

public class RowMappers implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e1 = new Employee();
		e1.setId(rs.getInt(1));
		e1.setName(rs.getString(2));
		e1.setExperience(rs.getString(3));
		e1.setSalary(rs.getInt(4));
		return e1;
	}

}
