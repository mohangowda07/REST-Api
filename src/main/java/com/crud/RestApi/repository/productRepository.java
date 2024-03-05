package com.crud.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.RestApi.entity.Product;

public interface productRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);

}
