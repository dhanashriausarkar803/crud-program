package databaseconnection;
import java.sql.*;
public class select {
	public static void main(String args[]) {
		String no="1";
		String name="dhanashri";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sampledb","root","dhanashri@1234");
			Statement stmt=con.createStatement();
			String q1="select * from student"; 
			ResultSet rs=stmt.executeQuery(q1);
			if(rs.next())
			{
				System.out.println(" no: "+rs.getString(1));
				System.out.println(" name: "+rs.getString(2));
				System.out.println(" dob: "+rs.getString(3));
				System.out.println(" no: "+rs.getString(4));
			}
			else
			{
				System.out.println("no such student table registred");
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
