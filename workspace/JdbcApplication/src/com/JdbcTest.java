package com;
import java.sql.*;
import java.util.Scanner;
public class JdbcTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		try {
			// singleton : only one object must be created...
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		// type 2, type 3 or type 4
		//URL = jdbc:mysql://192.1.12.96:3306/mydb
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infi_batch1", "root", "root@123");
	System.out.println("Database connected");
	Statement stmt = con.createStatement();
	

	
	// insert query 
//	int res = stmt.executeUpdate("insert into emp values(3,'ramesh',16000)");
//	if(res>0) {
//		System.out.println("Record inserted");
//	}
	
//	// update query 
//		int res = stmt.executeUpdate("update emp set salary = 25000 where id = 1");
//		if(res>0) {
//			System.out.println("Record updated");
//		}else {
//			System.out.println("Record not present");
//		}
	
//	// delete query 
//			int res = stmt.executeUpdate("delete from emp where id =3");
//			if(res>0) {
//				System.out.println("Record deleted");
//			}else {
//				System.out.println("Record not present");
//			}
	
	// retrieve query 
	
//	ResultSet rs = stmt.executeQuery("select * from emp");
//	while(rs.next()) {
//		System.out.println(" id is "+rs.getInt(1)+" name is "+rs.getString(2)+" salary is "+rs.getFloat(3));
//	}

	// insert query using prepared statement 
	PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
	System.out.println("Enter the id");
	int id = sc.nextInt();
		pstmt.setInt(1, id);
	System.out.println("Enter the name");
	String name = sc.next();
		pstmt.setString(2, name);
	System.out.println("Enter the salary");
	float salary = sc.nextFloat();
		pstmt.setFloat(3, salary);
	int res = pstmt.executeUpdate();
	if(res>0) {
		System.out.println("Record inserted successfully...");
	}
	
//	// delete query using prepared statement 
//		PreparedStatement pstmt = con.prepareStatement("delete from emp where id =?");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		pstmt.setInt(1, id);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record deleted successfully...");
//		}else {
//			System.out.println("Record not present");
//		}
	
//	// update query using prepared statement 
//			PreparedStatement pstmt = con.prepareStatement("update emp set salary = ? where id = ?");
//			System.out.println("Enter the id");
//			int id = sc.nextInt();
//			pstmt.setInt(2, id);
//			System.out.println("Enter the salary");
//			float salary = sc.nextFloat();
//			pstmt.setFloat(1, salary);
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record updated successfully...");
//			}else {
//				System.out.println("Record not present");
//			}
	// inserting multiple records 
	String firstRec = "insert into emp values(4,'Lokesh',15000)";
	String secondRec = "insert into emp values(5,'Raju',18000)";
	String thirdRec = "insert into emp values(6,'Ravi',20000)";
	
	stmt.addBatch(firstRec);
	stmt.addBatch(secondRec);
	stmt.addBatch(thirdRec);
	
	int result[] = stmt.executeBatch();
	if(result.length>0) {
		System.out.println("Record inserted...");
	}
	
	} catch (Exception e) {
		System.out.println(e.toString());
	}

	}

}
