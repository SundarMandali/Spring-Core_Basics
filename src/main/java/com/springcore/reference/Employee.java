package com.springcore.reference;



public class Employee {
private String empname;
private Address address;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(String empname, Address address) {
	super();
	this.empname = empname;
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [empname=" + empname + ", address=" + address + "]";
}

}
