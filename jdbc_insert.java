package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class jdbc_insert {
	
	public void insertEmployee(int eno, String ename, double esal) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1243");
			
			PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?)");
			psmt.setInt(1, eno);
            psmt.setString(2, ename);
            psmt.setDouble(3, esal);
            psmt.executeUpdate();
            System.out.println("Employee inserted successfully!");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	 public static void main(String[] args) {
		
		    jdbc_insert obj = new jdbc_insert();

	        obj.insertEmployee(1,"Alize",60000);
	        obj.insertEmployee(2,"Ananya",45000);
	        obj.insertEmployee(3,"Shruti",34000);
	        obj.insertEmployee(4,"Akruti",88000);
	        obj.insertEmployee(5,"Shradha",34000);
		
	}

}
