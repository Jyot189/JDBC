package in.ac.adit.main;
import in.ac.adit.EmployeeDAO;
import in.ac.adit.model.Employee;

public class Main {
	public static void main(String args[]) {
		EmployeeDAO employeedao=new EmployeeDAO();
		Employee employee=new Employee();
//		employeedao.delete();
//		//employeedao.create();
//		if(employeedao.update()!=0) {
//			System.out.println("employee update");
//		}else {
//			System.out.println("employee is not update");
//		}
//		//employeedao.update();
//		//employeedao.get();
//		employeedao.getAll();
		employee.setId(47);
		employee.setEmail("jyot@gmail.com");
		employee.setPassword(475358);
		employeedao.create(employee);
		
	}
}
