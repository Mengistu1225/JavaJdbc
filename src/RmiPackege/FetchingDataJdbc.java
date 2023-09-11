package RmiPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingDataJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/SMS", "root", "Tigray@436012");
		 //System.out.println(" conguratulization  database connected successfully");
		Statement stmt=connection.createStatement();
		String query="select * from teacher";
		ResultSet rs=stmt.executeQuery(query);
		System.out.println("ID \t First name \t Last name \t Age");
		while (rs.next()) {
			System.out.println(rs.getInt("id")+"\t"+rs.getString("Fname")+"\t"+rs.getString("Lname")+"\t"+rs.getInt("age"));	
		}
		connection.close();		
		
		

	}

}
