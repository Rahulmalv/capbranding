package com.capebranding.entity;

public class Vendor {

	private Integer VendorId;
	private String address;
	private String name;
	private Long contactNo;

	public Integer getVendorId() {
		return VendorId;
	}

	public void setVendorId(Integer vendorId) {
		VendorId = vendorId;
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
		return "Vendor [VendorId=" + VendorId + ", address=" + address + ", name=" + name + ", contactNo=" + contactNo
				+ "]";
	}

}
