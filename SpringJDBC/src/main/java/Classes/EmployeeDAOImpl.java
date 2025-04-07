package Classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import interfaces.IEmployeeDAO;
@Component
public class EmployeeDAOImpl implements IEmployeeDAO{
   private JdbcTemplate jdbctemplate;
   private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
   
   
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
	return namedParameterJdbcTemplate;
}
	@Autowired
public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
	this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
}
	public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}
  @Autowired
public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}

	public void addEmployee(EmployeePOJO emp) {
		// TODO Auto-generated method stub
		int id = emp.getId();
		   String name =emp.getName();
		   String department =emp.getDepartment();
		   int salary =emp.getSalary();
		String sql ="insert into Employee1(id,name,salary,department) values(?,?,?,?)";
		 int n = jdbctemplate.update(sql,id,name,salary,department);
		
		if(n>0) {
			System.out.println("addEmployee");	
		}else {
			System.out.println("Employee not added");	
		}
	}

	public EmployeePOJO getEmployee(int id ) {
		// TODO Auto-generated method stub
		System.out.println("getEmployee");
		String query ="select * from employee1 where id =:id";
	  Map<String ,Object> hs = new HashMap();
	  hs.put("id", id);
	  
		RowMapper<EmployeePOJO> rowMapper=   new Rowmap();
		System.out.println("hi vishwa");
		EmployeePOJO emp1 = namedParameterJdbcTemplate.queryForObject(query,hs, rowMapper);
		return emp1;
		
	}

	public List<EmployeePOJO> getAllEmployee() {
		// TODO Auto-generated method stub
		
		String query ="select * from employee1 ";
		RowMapper<EmployeePOJO> rowMapper=   new Rowmap();
		jdbctemplate.query(query,rowMapper);
		System.out.println("getAllEmployee");
		return null;
	}

	public void updateSalary(int id, int salary) {
		// TODO Auto-generated method stub
		String sql ="update employee1 set salary =? where id =?";
		int n = jdbctemplate.update(sql,salary,id);
		if(n>0) {
			System.out.println("updateSalary");	
		}else {
			System.out.println(" not updated");	
		}
		//System.out.println("");
		
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql ="delete from employee1 where id =?";
		int n = jdbctemplate.update(sql, id);
		System.out.println("deleteEmployee");
		if(n>0) {
			System.out.println("deleteEmployee");	
		}else {
			System.out.println(" not deleted");	
		}
		
	}

}
