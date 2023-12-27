package com.example.xmlpars.repository;


import com.example.xmlpars.model.CustomData;
import org.springframework.data.repository.CrudRepository;

public interface CustomDataJpa extends CrudRepository<CustomData,Integer> {
}
