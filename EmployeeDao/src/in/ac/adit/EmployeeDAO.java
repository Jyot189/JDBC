package in.ac.adit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.ac.adit.model.Employee;

public class EmployeeDAO {
	final static String URL="jdbc:mysql://localhost:3306/employee_db";
	final static String USERNAME="root";
	final static String USERPASSWORD="";
	private Connection connection=null;
	private Statement statement=null;
	
	public EmployeeDAO() {
		try {
			connection=DriverManager.getConnection(URL,USERNAME,USERPASSWORD);
			statement =connection.createStatement();
			System.out.println("DB connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean create(Employee employee) {
		try {
			//statement.execute("INSERT INTO EMPLOYEE (name,email,password) VALUES('jm','jm@gmail.com',584758)");
			statement.execute("INSERT INTO EMPLOYEE (name,email,password) VALUES('"+employee.getId()+"','"+employee.getEmail()+"','"+employee.getPassword()+"')");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public int update() {
		try {
			int ans=statement.executeUpdate("update employee set name='jkm' where id=5");
			System.out.println(ans);
			return ans;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete() {
		try {
			int ans=statement.executeUpdate("delete from employee where id=6");
			System.out.println(ans);
			return ans;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public void get() {
		try {
			ResultSet resultset=statement.executeQuery("select * from employee where id=2");
			if(resultset.next()) {
				System.out.println("id is:"+resultset.getInt(1));
				System.out.println("name is:"+resultset.getString(2));
				System.out.println("email is:"+resultset.getString(3));
				System.out.println("password is:"+resultset.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAll() {
		try {
			ResultSet resultset=statement.executeQuery("select * from employee");
			while(resultset.next()) {
				System.out.println("id is:"+resultset.getInt(1));
				System.out.println("name is:"+resultset.getString(2));
				System.out.println("email is:"+resultset.getString(3));
				System.out.println("password is:"+resultset.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
