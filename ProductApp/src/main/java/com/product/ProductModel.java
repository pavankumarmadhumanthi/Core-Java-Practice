package com.product;

public class ProductModel {
	private int productid;
	private String productname;
	private int productprice;
	private int productQuantity;
	
	public ProductModel(int productid, String productname, int productprice, int productQuantity) {
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productQuantity = productQuantity;
	}

	public ProductModel() {
		// TODO Auto-generated constructor stub
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	

}
