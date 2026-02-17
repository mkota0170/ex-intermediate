package com.intermediate.exintermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.intermediate.exintermediate.domain.searchCloth;

@Repository
public class searchClothRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<searchCloth> SEARCHCLOTH_ROW_MAPPER = new BeanPropertyRowMapper<>(searchCloth.class);

    /**
     * 選択された性別と色に応じた情報を抽出するメソッド
     * @param gender
     * @param color
     * @return 条件に応じた衣類の検索結果
     */
    public List<searchCloth> searchByColorAndGender(Integer gender, String color) {
        
        String sql = "SELECT genre,size,price FROM clothes WHERE gender=:gender AND color=:color";

        SqlParameterSource param = new MapSqlParameterSource().addValue("gender", gender).addValue("color", color);

        List<searchCloth> clothesList = template.query(sql, param,SEARCHCLOTH_ROW_MAPPER);
        return clothesList;
    }
}
