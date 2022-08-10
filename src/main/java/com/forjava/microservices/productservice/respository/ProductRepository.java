package com.forjava.microservices.productservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forjava.microservices.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
