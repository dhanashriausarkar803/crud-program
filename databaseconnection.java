package databaseconnection;
import java.sql.*;

public class databaseconnection {
	public static void main(String args[]) {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sampledb","root","dhanashri@1234");
		if(con!=null) 
			System.out.println("connected");
			else
				System.out.println("not connected");
		
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}
