package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;
public interface ProductRepo extends JpaRepository<Product, Integer> {
}