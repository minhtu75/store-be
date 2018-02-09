package com.demo.store.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.store.entity.Product;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProducService productService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Product> getAll() {
		return productService.findAll();
	}
	
}
