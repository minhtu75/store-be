package com.demo.store.category;

import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.store.entity.Category;

public interface CategoryService {
	
	public Category findOne(final long id);
	
	public List<Category> findAll();
	
	public Page<Category> findPaginated(final int page, final int size);
	
	public Category create(final Category entity);
	
	public Category update(final Category entity);
	
	public void delete(final Category entity);
	
	public void deleteById(final long entityId);
}
