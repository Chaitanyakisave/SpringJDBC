package Main.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Classes.EmployeeDAOImpl;
import Classes.EmployeeService;
import Classes.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
     //   ApplicationContext context = new ClassPathXmlApplicationContext("Configure.xml");
        EmployeeService emp1 =(EmployeeService) context.getBean("employeeService");
       // EmployeeService emp1 =(EmployeeService) context.getBean("emps");
        
            
            
            emp1.addEmployee(4,"hem",150,"E&TC");
              emp1.getEmployee(1);
            
            emp1.updateSalary(4, 250);
            emp1.deleteEmployee(4);
            emp1.getAllEmployee();
            System.out.println( "Hello World!" );
       
            
    }
}
