package com.demo.store.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.store.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
