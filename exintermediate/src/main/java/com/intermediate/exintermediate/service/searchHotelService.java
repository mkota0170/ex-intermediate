package com.intermediate.exintermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intermediate.exintermediate.domain.searchHotel;
import com.intermediate.exintermediate.repository.searchHotelRepository;

@Service
@Transactional
public class searchHotelService {

    @Autowired
    private searchHotelRepository repository;

    public List<searchHotel> searchByLessThanPrice(Integer price){
        return repository.searchByLessThanPrice(price);
    }

}
