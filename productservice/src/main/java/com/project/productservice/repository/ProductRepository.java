package com.project.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.productservice.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
