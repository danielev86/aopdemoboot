package com.danielev86.aopdemoboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielev86.aopdemoboot.annotation.LogServiceAnnotation;
import com.danielev86.aopdemoboot.provider.bean.ProductDTO;
import com.danielev86.aopdemoboot.service.IProductService;
import com.danielev86.aopdemoboot.service.mock.ProductSerciveMock;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductSerciveMock productServiceMock;
	
	public List<ProductDTO> getAllProducts(){
		return productServiceMock.getAllProducts();
	}
	
}
