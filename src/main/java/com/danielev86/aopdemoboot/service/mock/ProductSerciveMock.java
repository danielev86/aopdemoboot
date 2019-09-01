package com.danielev86.aopdemoboot.service.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.danielev86.aopdemoboot.provider.bean.ProductDTO;

@Component
public class ProductSerciveMock {

	public List<ProductDTO> getAllProducts(){
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		
		ProductDTO productOne = new ProductDTO();
		productOne.setProductIdentifier("p1");
		productOne.setProductName("Avengers Endgame");
		productOne.setProducType("Blu Ray");
		productOne.setQtaAvailable(new BigDecimal(20));
		productOne.setPrice(new BigDecimal("12.00"));
		
		ProductDTO productTwo = new ProductDTO();
		productTwo.setProductIdentifier("p2");
		productTwo.setProductName("Avengers Infinity War");
		productTwo.setProducType("Blu Ray");
		productTwo.setQtaAvailable(new BigDecimal(20));
		productTwo.setPrice(new BigDecimal("10.59"));
		
		products.add(productOne);
		products.add(productTwo);
		
		return products;
	}
	
}
