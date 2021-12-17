package com.ajaylovescoding.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ajaylovescoding.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstname;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastname;
	
	@NotNull(message="is required")
	@Max(value=10,message="must be less than or equal to 10")
	@Min(value=0,message="must be greater than or equal to 0")
	private Integer freePasses;
	
	@CourseCode(value={"TOPS","LUV"},message="must start with TOPS or LUV")                      //we do not need to write value and message 
	private String courseCode;       //for this annotation , since we have already 
	                                 //set defaults for these in our annotation file
	                                 //CourseCode.java
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	 
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
	
}
