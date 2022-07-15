package com.capebranding.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Integer productId;
	private Employee employee;
	private Vendor vendor;
	private List<Product> product = new ArrayList<>();

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [productId=" + productId + ", employee=" + employee + ", vendor=" + vendor + ", product="
				+ product + "]";
	}

}
