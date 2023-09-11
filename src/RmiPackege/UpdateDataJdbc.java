package RmiPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/SMS", "root", "Tigray@436012");
		 System.out.println(" conguratulization  database connected successfully");
		Statement stmt=connection.createStatement();
		String sqlUpdate="update teacher set Fname='kide' where id=4369";
		stmt.executeUpdate(sqlUpdate);
		System.out.println("the name is updated");
		
		connection.close();		
		
		 

	}

}
