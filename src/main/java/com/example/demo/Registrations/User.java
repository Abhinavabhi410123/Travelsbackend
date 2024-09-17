package com.example.demo.Registrations;

public class User {
String fName;
String lName;
String email;
long phone;
String password;
String cPass;
String gender;
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getcPass() {
	return cPass;
}
public void setcPass(String cPass) {
	this.cPass = cPass;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "User [fName=" + fName + ", lName=" + lName + ", email=" + email + ", phone=" + phone + ", password="
			+ password + ", cPass=" + cPass + ", gender=" + gender + "]";
}
}
