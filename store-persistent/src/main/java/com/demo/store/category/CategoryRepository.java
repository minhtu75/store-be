package com.demo.store.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.store.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
