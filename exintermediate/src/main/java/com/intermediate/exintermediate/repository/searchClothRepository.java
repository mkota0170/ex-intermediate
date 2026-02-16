package com.intermediate.exintermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intermediate.exintermediate.domain.searchCloth;

@Repository
public class searchClothRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<searchCloth> SEARCHCLOTH_ROW_MAPPER = new BeanPropertyRowMapper<>(searchCloth.class);

    public List<searchCloth> searchByColorAndGender(Integer gender, String color) {

        String sql = "SELECT category,size,price FROM clothes WHERE gender=:gender AND color=:color";
        List<searchCloth> clothesList = template.query(sql, SEARCHCLOTH_ROW_MAPPER);
        return clothesList;
    }
}
