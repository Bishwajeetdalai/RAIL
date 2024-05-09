package com.bishwa.Controller;

public class Student {
private String email;
private String password;
private String address;
private String address2;
private String city;
private String zip;
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the address2
 */
public String getAddress2() {
	return address2;
}
/**
 * @param address2 the address2 to set
 */
public void setAddress2(String address2) {
	this.address2 = address2;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return "Student [email=" + email + ", password=" + password + ", address=" + address + ", address2=" + address2
			+ ", city=" + city + ", zip=" + zip + "]";
}


}
