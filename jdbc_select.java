package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_select {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1243");
			
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from emp");
			
			while(rs.next()) {
				
				int eno = rs.getInt(1);
				String ename = rs.getString(2);
				double esal = rs.getDouble(3);
				
			System.out.println("EMP NO : " + eno);
			System.out.println("EMP NAME : "+ ename);
			System.out.println("EMP SALARY : "+ esal);
			System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
