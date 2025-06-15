package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_connect {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1243");
		
		Statement smt = con.createStatement();
		smt.executeUpdate("create table emp(eno INT PRIMARY KEY, ename VARCHAR(20) NOT NULL, esal DOUBLE)");
		
		System.out.println("Table created successfully");
		con.close();

	}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
