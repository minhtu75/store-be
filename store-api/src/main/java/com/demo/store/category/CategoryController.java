package com.demo.store.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.store.common.Result;
import com.demo.store.entity.Category;

@RestController
@RequestMapping("category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Result<Object> create(CategoryRequest categoryRequest) {
		Category category = new Category(categoryRequest);
		categoryService.create(category);
		Result<Object> result = new Result<>();
		result.success(null);
		return result;
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Result<CategoryResponse> getAll() {
		return null;
		
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Result<CategoryResponse> getDetail(long id) {
		return null;
	}
	
}
