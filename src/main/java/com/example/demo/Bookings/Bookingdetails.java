package com.example.demo.Bookings;

import java.util.Date;

public class Bookingdetails {
	
String FromDestination;
String ToDestination;
String Price;
String date;
int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public String getFromDestination() {
	return FromDestination;
}
public void setFromDestination(String fromDestination) {
	FromDestination = fromDestination;
}
public String getToDestination() {
	return ToDestination;
}
public void setToDestination(String toDestination) {
	ToDestination = toDestination;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Bookingdetails [FromDestination=" + FromDestination + ", ToDestination=" + ToDestination + ", Price="
			+ Price + ", date=" + date + "]";
}

}

