package com.demo.store.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.store.common.Result;
import com.demo.store.entity.Product;
import com.demo.store.product.ProductResponse;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProducService productService;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Result<ProductResponse> getAll() {
		Result<ProductResponse> result = new Result<>();
		result.setValue(Product.toLisResponse(productService.findAll()));
		result.setCode(Result.CODE_SUCCESS);
		result.setMessage(Result.MSG_SUCCESS);
		result.setTotal(result.getValue().size());
		return result;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Result<Boolean> create(@RequestBody Product product){
		productService.create(product);
		Result<Boolean> result = new Result<>();
		result.setCode(Result.CODE_SUCCESS);
		result.setMessage(Result.MSG_SUCCESS);
		return result;
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Result<ProductResponse> getDetail(@PathVariable("id") long id) {
		Product product = productService.findOne(id);
		Result<ProductResponse> result = new Result<>();
		
		if(product != null) {
			List<ProductResponse> list = new ArrayList<>();
			list.add(product.toResponse());
			result.success(list);
			return result;
		}
		result.fail();
		return result;
	}
	
}
