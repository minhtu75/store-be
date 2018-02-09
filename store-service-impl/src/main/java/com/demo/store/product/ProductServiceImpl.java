package com.demo.store.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.demo.store.common.AbstractService;
import com.demo.store.entity.Product;
import com.demo.store.product.repository.ProductRepository;
import com.model.store.product.ProductResponse;

@Service
public class ProductServiceImpl extends AbstractService<Product> implements ProducService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<ProductResponse> getAllProduct() {
		List<Product> products = productRepository.findAll();
		List<ProductResponse> response = new ArrayList<>();
		toResponse(products, response);
		return response;
	}

	private List<ProductResponse> toResponse(List<Product> products, List<ProductResponse> response) {
		for(Product product : products) {
			ProductResponse productResponse = new ProductResponse();
			BeanUtils.copyProperties(product, productResponse);
			response.add(productResponse);
		}
		return response;
	}

	@Override
	protected PagingAndSortingRepository<Product, Long> getDao() {
		// TODO Auto-generated method stub
		return productRepository;
	}
}
