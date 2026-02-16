package com.intermediate.exintermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intermediate.exintermediate.domain.searchCloth;
import com.intermediate.exintermediate.repository.searchClothRepository;

@Service
@Transactional
public class searchClothService {

    @Autowired
    private searchClothRepository repository;

    /**
     * repositoryクラスのsearchByColorAndGenderメソッドを返す
     * @param gender
     * @param color
     * @return searchByColorAndGenderメソッド
     */
    public List<searchCloth> searchByColorAndGender(Integer gender, String color) {
        return repository.searchByColorAndGender(gender, color);
    }
}
