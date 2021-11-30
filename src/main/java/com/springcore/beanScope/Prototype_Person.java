package com.springcore.beanScope;


//@Component("p1")
//@Scope("prototype")
public class Prototype_Person {
	
//	@Value("23")
	private int pid;
//	@Value("Rahul")
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Prototype_Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Prototype_Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Prototype_Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
