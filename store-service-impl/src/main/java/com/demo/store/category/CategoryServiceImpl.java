package com.demo.store.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.demo.store.common.AbstractService;
import com.demo.store.entity.Category;

@Service
public class CategoryServiceImpl extends AbstractService<Category> implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	protected PagingAndSortingRepository<Category, Long> getDao() {
		// TODO Auto-generated method stub
		return categoryRepository;
	}

}
