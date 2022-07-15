package com.capebranding.entity;

public class Employee {

	private Integer employeeId;
	private String address;
	private String name;
	private Long contactNo;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", address=" + address + ", name=" + name + ", contactNo="
				+ contactNo + "]";
	}

}
