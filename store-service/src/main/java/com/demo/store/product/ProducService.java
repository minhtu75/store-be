package com.demo.store.product;

import java.util.List;

import com.demo.store.entity.Product;
import com.model.store.product.ProductResponse;

public interface ProducService {

	public List<ProductResponse> getAllProduct();
	
	public Product findOne(final long id);
	
	public List<Product> findAll();
}
