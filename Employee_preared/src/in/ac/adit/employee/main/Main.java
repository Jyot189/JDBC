package in.ac.adit.employee.main;
import in.ac.adit.employee.dao.Employee;

public class Main {
	public static void main(String args[]) {
		Employee employee=new Employee();
		//employee.create();
		employee.update();
		//employee.delete();
		employee.get();
		employee.getAll();
	}
}
