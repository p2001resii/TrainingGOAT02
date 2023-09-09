package com.JdbcpraticeSpring.JdbcPraticedemo;

public class Student {
	private int rollno;
	private String Name;
	private String Address;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
	
	

}
