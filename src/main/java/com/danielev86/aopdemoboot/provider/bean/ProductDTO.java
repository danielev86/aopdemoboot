package com.danielev86.aopdemoboot.provider.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String productIdentifier;
	
	private String productName;
	
	private String producType;
	
	private BigDecimal price;
	
	private BigDecimal qtaAvailable;
	
	private BigDecimal qtaBought;

	public String getProductIdentifier() {
		return productIdentifier;
	}

	public void setProductIdentifier(String productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProducType() {
		return producType;
	}

	public void setProducType(String producType) {
		this.producType = producType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQtaAvailable() {
		return qtaAvailable;
	}

	public void setQtaAvailable(BigDecimal qtaAvailable) {
		this.qtaAvailable = qtaAvailable;
	}

	public BigDecimal getQtaBought() {
		return qtaBought;
	}

	public void setQtaBought(BigDecimal qtaBought) {
		this.qtaBought = qtaBought;
	}
	
}
