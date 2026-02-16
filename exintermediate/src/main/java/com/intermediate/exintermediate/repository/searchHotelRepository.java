package com.intermediate.exintermediate.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.intermediate.exintermediate.domain.searchHotel;

@Repository
public class searchHotelRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    //id serial primary key,
    //area_name text,
    //hotel_name text,
    //address text,
    //nearest_station text,
    //price integer,
    //parking text

    private static final RowMapper<searchHotel> SEARCHHOTEL_ROW_MAPPER = new BeanPropertyRowMapper<>(searchHotel.class);

    /**
     * 引数で渡した金額以下のホテル一覧を表示するメソッド
     * @param price
     * @return 条件に一致するホテルの全情報
     */
    public List<searchHotel> searchByLessThanPrice(Integer price){
        String sql = "SELECT hotel_name,nearest_station,price FROM hotels WHERE price=:price";
        return null;
    }
    
}
