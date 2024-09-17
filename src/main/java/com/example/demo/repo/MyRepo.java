package com.example.demo.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Bookings.Bookingdetails;
import com.example.demo.Registrations.User;

@Repository
public class MyRepo {
	
	public User insert(User user) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hello";
		Connection con=DriverManager.getConnection(url,"root","root");
		
		String query="insert into hello.users(fname,lname,email,phone,pwd,cpwd,gender) value(?,?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, user.getfName());
		pst.setString (2,user.getlName());
		pst.setString (3,user.getEmail());
		pst.setLong (4,user.getPhone());
		pst.setString (5,user.getPassword());
		pst.setString(6, user.getcPass());;
		pst.setString (7,user.getGender());
		
		if(pst.executeUpdate()>0)
			return user;
		return null;
	}
public Bookingdetails insertbooking(Bookingdetails bd) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hello";
		Connection con=DriverManager.getConnection(url,"root","root");
		
		String query="insert into hello.bookingtable(fromDestination,toDestination,price,date) value(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, bd.getFromDestination());
		pst.setString (2,bd.getToDestination());
		pst.setString (3,bd.getPrice());
		pst.setString (4,bd.getDate());
		
		
		if(pst.executeUpdate()>0)
			return bd;
		return null;
	}
public List<Bookingdetails> getDetails() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/hello";
	Connection con=DriverManager.getConnection(url,"root","root");
	List<Bookingdetails> list = new ArrayList<Bookingdetails>();
	String query="Select DISTINCT * from hello.bookingtable";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	while(rs.next()) {
		Bookingdetails bd = new Bookingdetails();
		bd.setId(rs.getInt(1));
		bd.setFromDestination(rs.getString(2));
		bd.setToDestination(rs.getString(3));
		bd.setPrice(rs.getString(4));
		bd.setDate(rs.getString(5));
		list.add(bd);
	}
	return list;
}
public String updatebooking(Bookingdetails bd) throws ClassNotFoundException, SQLException {
	System.out.println(bd);
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/hello";
	Connection con=DriverManager.getConnection(url,"root","root");
	
	String query="Update hello.bookingtable set fromDestination=?, toDestination=? where id=? ";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1, bd.getFromDestination());
	pst.setString (2,bd.getToDestination());
	pst.setInt (3,bd.getId());
	if(pst.executeUpdate()>0) {
		return "Updated Sucesfully";
	}
	else
	return "update not sucessfull";
}
public String deleteBooking(int id) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/hello";
	Connection con=DriverManager.getConnection(url,"root","root");
	
	String query="Delete from  hello.bookingtable  where id=?";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1, id);
	if(pst.executeUpdate()>0) {
		return "record deleted sucessfully";
	}
	else
	return "could not delete record";
}
}
