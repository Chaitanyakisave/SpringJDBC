package Classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import interfaces.IEmployeeDAO;
@Component
public class EmployeeService {
	private IEmployeeDAO emp1;
	private EmployeePOJO empjo;
   @Autowired
	public EmployeeService(EmployeeDAOImpl emp1,EmployeePOJO empjo) {
		super();
		this.emp1 = emp1;
		this.empjo =empjo;
	}
   

	public IEmployeeDAO getEmp1() {
	return emp1;
}


public void setEmp1(IEmployeeDAO emp1) {
	this.emp1 = emp1;
}


public EmployeePOJO getEmpjo() {
	return empjo;
}


public void setEmpjo(EmployeePOJO empjo) {
	this.empjo = empjo;
}


	public EmployeeService() {
	super();
	// TODO Auto-generated constructor stub
}


	public void addEmployee(int id ,String name,int salary,String department) {
		EmployeePOJO emp = new EmployeePOJO(id ,name,salary,department);
		// TODO Auto-generated method stub
		emp1.addEmployee(emp);
		
		
	}

	public void getEmployee(int id ) {
		// TODO Auto-generated method stub
     	  EmployeePOJO emp2 =(EmployeePOJO) emp1.getEmployee(id);
		 System.out.println(emp2.getDepartment());
		 System.out.println(emp2.getId());
		 System.out.println(emp2.getName());
		 System.out.println(emp2.getSalary());
	}

	public List<EmployeePOJO> getAllEmployee() {
		// TODO Auto-generated method stub
		emp1.getAllEmployee();
		return null;
	}

	public void updateSalary(int id, int salary) {
		// TODO Auto-generated method stub
		emp1.updateSalary(id, salary);
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		emp1.deleteEmployee(id);
	}

}
