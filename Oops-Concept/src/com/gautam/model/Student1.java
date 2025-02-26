package com.gautam.model;

public class Student1 {

	private final int stuId;
	private final String stuName;
	private final String course;

	private final Address1 address;

	public Student1(int stuId, String stuName, String course, Address1 address) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.course = course;
		this.address = address;
	}

	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public String getCourse() {
		return course;
	}

//	public Address getAddress() throws CloneNotSupportedException {
//		return (Address)address.clone();
//		//return new Address(address.getBuildingName(), address.getCity(), address.getState());
//	}
	
	public Address1 getAddress( ) {
		return new Address1(address);
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", course=" + course + ", address=" + address + "]";
	}

}
