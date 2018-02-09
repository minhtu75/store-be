package com.demo.store.product;

import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.store.entity.Product;
import com.model.store.product.ProductResponse;

public interface ProducService {

	public List<ProductResponse> getAllProduct();
	
	public Product findOne(final long id);
	
	public List<Product> findAll();
	
	public Page<Product> findPaginated(final int page, final int size);
	
	public Product create(final Product entity);
	
	public Product update(final Product entity);
	
	public void delete(final Product entity);
	
	public void deleteById(final long entityId);
}
