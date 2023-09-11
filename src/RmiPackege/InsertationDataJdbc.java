package RmiPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertationDataJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/SMS", "root", "Tigray@436012");
		 //System.out.println(" conguratulization  database connected successfully");
		 Statement stmt=connection.createStatement();
		 String sql1="insert into teacher values('4360','Mengistu','Araya','26')";	 
		 stmt.executeUpdate(sql1);
		 System.out.println("insertion successfully");
		 connection.close();

	}

}
