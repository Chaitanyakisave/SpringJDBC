package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Rowmap implements  RowMapper<EmployeePOJO>{

	public EmployeePOJO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeePOJO emp = new EmployeePOJO();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getInt("salary"));
		emp.setDepartment(rs.getString("department"));
		
		// TODO Auto-generated method stub
		return emp;
	}

}
