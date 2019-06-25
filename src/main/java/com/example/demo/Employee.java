package com.example.demo;

public class Employee {

	private String eid;
	private String name;
	private String gender;
	
	public Employee() {
		
	}
	
	public Employee(String eid, String name, String gender) {
		super();
		this.eid = eid;
		this.name = name;
		this.gender = gender;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
