package com.danielev86.aopdemoboot.provider.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderIdentifier;
	
	private Date orderedDate;
	
	private BigDecimal orderTotal;
	
	private CustomerDTO customer;
	
	private List<ProductDTO> orderedProducts;

	public String getOrderIdentifier() {
		return orderIdentifier;
	}

	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public List<ProductDTO> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<ProductDTO> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	
}
