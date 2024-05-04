package com.example.catalogue.service;

import com.example.catalogue.model.Product;

import java.util.List;

public interface ProductService {
	List<Product> getAllProducts();

	Product getProductById(String id);

	Product addProduct(Product product);

	Product updateProduct(String id, Product product);

	void deleteProduct(String id);

}