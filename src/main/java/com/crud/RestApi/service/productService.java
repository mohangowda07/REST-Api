package com.crud.RestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.RestApi.entity.Product;
import com.crud.RestApi.repository.productRepository;

@Service
public class productService {
	@Autowired
	private productRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}

	public List<Product> getProduct() {
		return repository.findAll();
	}

	public Product getById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Product getByName(String name) {
		return repository.findByName(name);
	}

	public String deleteProduct(int id) {
		return "product deleted Sucessfully";
	}

	public Product updateProduct(Product product) {
		Product existingproduct = repository.findById(product.getId()).orElse(null);
		existingproduct.setName(product.getName());
		existingproduct.setPrice(product.getPrice());
		existingproduct.setQuantity(product.getQuantity());
		return repository.save(existingproduct);
	}

}
