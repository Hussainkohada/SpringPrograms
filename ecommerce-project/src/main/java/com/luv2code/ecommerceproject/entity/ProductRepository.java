package com.luv2code.ecommerceproject.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.ecommerceproject.dao.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
