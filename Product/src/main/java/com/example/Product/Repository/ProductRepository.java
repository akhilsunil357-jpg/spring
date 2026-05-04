package com.example.Product.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Product.Model.Productmodel;

public interface ProductRepository extends CrudRepository<Productmodel,Integer> {

}