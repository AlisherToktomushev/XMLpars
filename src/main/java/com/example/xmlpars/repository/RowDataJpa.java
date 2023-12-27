package com.example.xmlpars.repository;


import com.example.xmlpars.model.RowData;
import org.springframework.data.repository.CrudRepository;

public interface RowDataJpa extends CrudRepository<RowData,Integer> {
}
