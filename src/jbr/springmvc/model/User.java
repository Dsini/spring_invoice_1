package jbr.springmvc.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.*;
@Entity
@Table(name="USERS")
public class User {
	
	  private String username;
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String email;
	  //private String address;
	  private int phone;
	  @Id
		 @GeneratedValue
		    @Column(name="USERNAME")
	  public String getUsername() {
	  return username;
	  }
	  public void setUsername(String username) {
	  this.username = username;
	  }
	  @Column(name="PASSWORD")
	  public String getPassword() {
	  return password;
	  }
	  public void setPassword(String password) {
	  this.password = password;
	  }
	  @Column(name="FIRSTNAME")
	  public String getFirstname() {
	  return firstname;
	  }
	  public void setFirstname(String firstname) {
	  this.firstname = firstname;
	  }
	  @Column(name="LASTNAME")
	  public String getLastname() {
	  return lastname;
	  }
	  public void setLastname(String lastname) {
	  this.lastname = lastname;
	  }
	  @Column(name="EMAIL")
	  public String getEmail() {
	  return email;
	  }
	  public void setEmail(String email) {
	  this.email = email;
	  }
	  @Column(name="PHONE")
	  public int getPhone() {
	  return phone;
	  }
	  public void setPhone(int phone) {
	  this.phone = phone;
	  }
	}