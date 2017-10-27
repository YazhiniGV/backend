package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component 
@Table(name = "User")

public class User {
	
	@Id
	@GeneratedValue
	
private int userId;
private String name;
private String email;
private String password;
private String addresss;
private int phnno;
private int zipcode;
private int roll;
private Boolean enabled;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddresss() {
	return addresss;
}
public void setAddresss(String addresss) {
	this.addresss = addresss;
}
public int getPhnno() {
	return phnno;
}
public void setPhnno(int phnno) {
	this.phnno = phnno;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public Boolean getEnabled() {
	return enabled;
}
public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}

}