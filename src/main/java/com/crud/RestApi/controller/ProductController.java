package com.crud.RestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.RestApi.entity.Product;
import com.crud.RestApi.service.productService;

@RestController
public class ProductController {

	@Autowired
	private productService service;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return  service.saveProducts(products);
	}
	@GetMapping("/products")
	public List<Product> findAllProduct()
	{
		return service.getProduct();
	}
	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id)
	{
		return service.getById(id);
	}
	@GetMapping("/productByName/{name}")
	public Product findProductByName(@PathVariable String Name)
	{
		return service.getByName(Name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
}
