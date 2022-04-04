package databaseconnection;

import java.sql.*;

public class insertrecordexample {
	public static void main(String args[]) {
		String no="3";
		String name=" kajal";
		String dob="10-6-2002";
		String doj="2-5-2022";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sampledb","root","dhanashri@1234");
			Statement stmt=con.createStatement();
			String q1=" insert into student values(' "+no+ " ', ' " +name+ " ' , ' " +dob+ " ', ' " +doj+ " ')";
			int x=stmt.executeUpdate(q1);
			if(x>0)
				System.out.println("successfully inserted");
			else
				System.out.println("insert failed");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
