package in.ac.adit.studentdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	final static String URL="jdbc:mysql://localhost:3306/student_db";
	final static String USERNAME="root";
	final static String USERPASSWORD="";
	
	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection(URL,USERNAME,USERPASSWORD);
			Statement statement=connection.createStatement();
			//statement.execute("INSERT INTO STUDENT VALUES(2,'ddd','gfg','dfyg@GMAIL.COM')");
			ResultSet resultset=statement.executeQuery("select * from student");
			while(resultset.next()) {
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println(resultset.getString(4));
			}
			System.out.println("connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
