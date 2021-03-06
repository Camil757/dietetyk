package com.example.dietetyk.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByProductName(String productName);
	List<Product> findAllByOrderByIdAsc();
}
