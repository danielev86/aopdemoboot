package com.danielev86.aopdemoboot.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danielev86.aopdemoboot.provider.bean.ProductDTO;
import com.danielev86.aopdemoboot.service.IProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDTO> getAllProducts(){
		return productService.getAllProducts();
	}

}
