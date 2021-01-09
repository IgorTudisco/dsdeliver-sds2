package com.tudis.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tudis.dsdeliver.dto.ProductDTO;
import com.tudis.dsdeliver.entities.Product;
import com.tudis.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional (readOnly = true)
	public List<ProductDTO> findall(){
		List<Product> List = repository.findAllByOrderByNameAsc();
		return List.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

}
