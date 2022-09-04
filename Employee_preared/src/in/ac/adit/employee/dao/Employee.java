package in.ac.adit.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	final static String URL="jdbc:mysql://localhost:3306/employeepreared_db";
	final static String USERNAME="root";
	final static String USERPASSWORD="";
	private Connection connection=null;
    private PreparedStatement pstmt=null;
	
	public Employee() {
		try {
			connection=DriverManager.getConnection(URL,USERNAME,USERPASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean create() {
		try {
			pstmt = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?)");
			pstmt.setLong(1,104);
			pstmt.setString(2, "JDmk");
			pstmt.setString(3, "jmDVDVk@gmail.com");
			pstmt.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean update() {
		try {
			pstmt = connection.prepareStatement("update employee set email=? where id=?");
			pstmt.setString(1, "jyokmt@gmail.com");
			pstmt.setLong(2,103);
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean delete() {
		try {
			pstmt = connection.prepareStatement("delete from employee where id=?");
			pstmt.setLong(1, 104);
			pstmt.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public void get() {
		try {
			pstmt =connection.prepareStatement("select * from employee where id=?");
			pstmt.setLong(1, 101);
			ResultSet resultset=pstmt.executeQuery();
			if(resultset.next()) {
				System.out.println("id is:"+resultset.getInt(1));
				System.out.println("name is:"+resultset.getString(2));
				System.out.println("email is"+resultset.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAll() {
		try {
			pstmt =connection.prepareStatement("select * from employee");
			ResultSet resultset=pstmt.executeQuery();
			while(resultset.next()) {
				System.out.println("id is:"+resultset.getInt(1));
				System.out.println("name is:"+resultset.getString(2));
				System.out.println("email is"+resultset.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
