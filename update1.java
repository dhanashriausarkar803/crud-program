package databaseconnection;
import java.sql.*;
public class update1 {
	public static void main(String args[]) {
		String no="2";
		String newname="kajal";
		String dob="6-7-2001";
		String doj="5-3-2022";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sampledb","root","dhanashri@1234");
			Statement stmt=con.createStatement();
			String q1="update student set Student_name=' "+newname+" 'where Student_no = ' "+no+ " ' and Student_dob= ' "+dob+ " ' ";
			int x=stmt.executeUpdate(q1);
			if(x>0)
				System.out.println(" successfully updated");
			else
				System.out.println("error occured");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
