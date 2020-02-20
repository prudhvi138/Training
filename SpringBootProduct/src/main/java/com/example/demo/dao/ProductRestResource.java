package com.example.demo.dao;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Product;
@RepositoryRestResource(path = "products", collectionResourceRel = "products")
public interface ProductRestResource extends PagingAndSortingRepository<Product, Integer> {
	//List<Product> findAll();
	List<Product> findByDescription(@Param("ds")String ds);

}
