package Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeePOJO {
  private int id;
  private String name;
  private String department;
  private int salary;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public EmployeePOJO(int id, String name,  int salary,String department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.salary = salary;
}
public EmployeePOJO() {
	super();
	// TODO Auto-generated constructor stub
}
 
  
}
