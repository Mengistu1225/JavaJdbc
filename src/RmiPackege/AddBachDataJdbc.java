package RmiPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBachDataJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3306/SMS", "root", "Tigray@436012");
		 //System.out.println(" conguratulization  database connected successfully");
		 Statement stmt=connection.createStatement();
		 String sql2="insert into teacher values('4361','eyob','tesfay','27')";	 
		 String sql3="insert into teacher values('4362','ethay','mola','28')";	 
		 String sql4="insert into teacher values('4363','haftamu','shano','26')";	 
		 String sql5="insert into teacher values('4364','haftu','nigus','43')";	 
		 String sql6="insert into teacher values('4365','tesfay','mahari','89')";	 
		 String sql7="insert into teacher values('4366','meselu','kasa','56')";	 
		 String sql8="insert into teacher values('4367','mogos','kelali','06')";	 
		 String sql9="insert into teacher values('4368','yrga','tesfay','96')";	 
		 String sql10="insert into teacher values('4369','yonas','mahari','76')";	
		 
		 stmt.addBatch(sql2);
		 stmt.addBatch(sql3);
		 stmt.addBatch(sql4);
		 stmt.addBatch(sql5);
		 stmt.addBatch(sql6);
		 stmt.addBatch(sql7);
		 stmt.addBatch(sql8);
		 stmt.addBatch(sql9);
		 stmt.addBatch(sql10);
		 
		 stmt.executeBatch();
		 System.out.println("all data are added successfully");
		 connection.close();		 

	}

}
