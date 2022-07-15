package com.capebranding.entity;

public class Product {

	private Integer productId;
	private String name;
	private Integer productprice;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getProductprice() {
		return productprice;
	}

	public void setProductprice(Integer productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", productprice=" + productprice + "]";
	}

}
