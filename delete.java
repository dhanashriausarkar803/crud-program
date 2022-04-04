package databaseconnection;

import java.sql.*;

public class delete {
public static void main(String args[]) {
	String no="1";
	String name="dhanashri";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sampledb","root","dhanashri@1234");
		Statement stmt=con.createStatement();
		String q1=" delete from student where Student_no= ' "+no+" ' ";
		int x=stmt.executeUpdate(q1);
		if(x>0)
		
			System.out.println(" successfully deleted");
			else
				System.out.println("error occured");
			con.close();
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
