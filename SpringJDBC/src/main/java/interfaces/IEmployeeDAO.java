package interfaces;

import java.sql.SQLException;
import java.util.List;

import Classes.EmployeePOJO;

public interface IEmployeeDAO {
   public void addEmployee(EmployeePOJO emp)  ;
		
	
	//public void getEmployee(int id) ;
		   
	   
	public List<EmployeePOJO> getAllEmployee()  ;
	
	public void updateSalary(int id ,int salary);
	public void deleteEmployee(int id) ;


	//public void getEmployee(int id);


	public EmployeePOJO getEmployee(int id);


//	public EmployeePOJO getEmployee(int id);
}
