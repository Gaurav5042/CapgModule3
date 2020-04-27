package com.capg.exceptions_rest.entity;

public class Emp {

	private int eid;
	
	private String ename;

	
	public Emp(){}

	public int getEid() {
		return eid;
	}

	public void seeId(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}




	@Override
	public String toString() {
		return "Employee Details \n  id = " + eid + ", Name = " + ename   ;
	}
	

}
