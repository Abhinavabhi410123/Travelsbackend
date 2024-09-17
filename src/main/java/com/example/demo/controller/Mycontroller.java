package com.example.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bookings.Bookingdetails;
import com.example.demo.Registrations.User;
import com.example.demo.repo.MyRepo;


@CrossOrigin("http://localhost:4200")
@RestController
public class Mycontroller {
	
	@Autowired
	MyRepo repo;
	Bookingdetails bd;
	
	@PostMapping("/insert")
	public User insert(@RequestBody User user) throws ClassNotFoundException, SQLException
	{
		return repo.insert(user);
	}
	@PostMapping("/insertbooking")
	public Bookingdetails insertbooking(@RequestBody Bookingdetails bd) throws ClassNotFoundException, SQLException
	{
		return repo.insertbooking(bd);
	}
	@GetMapping("/getdetails")
	public List<Bookingdetails> getTable() throws ClassNotFoundException, SQLException
	{
		return repo.getDetails();
	}
	@PutMapping("/updatedetails")
	public String getTable(@RequestBody Bookingdetails bd) throws ClassNotFoundException, SQLException
	{
		return repo.updatebooking(bd);
	}
	@DeleteMapping("/deletebooking/{id}")
	@CrossOrigin("http://localhost:4200")
	public String deleteBooking(@PathVariable int id) throws ClassNotFoundException, SQLException
	{
		return repo.deleteBooking(id);
	}
	
}
