package com.intermediate.exintermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.intermediate.exintermediate.domain.baseballTeam;

@Repository
public class baseballTeamRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    /**
     * id serial 主キー
     * league_name リーグ名
     * team_name チーム名
     * headquarters 本拠地
     * inauguration 発足日
     * history チームの歴史
     */
    private static final RowMapper<baseballTeam> BASEBALLTEAM_ROW_MAPPER = new BeanPropertyRowMapper<>(
            baseballTeam.class);

    /**
     * 野球チームの名前をリストで返すメソッド
     * 
     * @return チーム名が格納されたリスト
     */
    public List<baseballTeam> showList() {
        String sql = "SELECT id,team_name FROM teams ORDER BY inauguration";
        List<baseballTeam> teamList  =template.query(sql, BASEBALLTEAM_ROW_MAPPER);
        return teamList;
    }

    /**
     * 引数で渡した情報での球団情報を取得するメソッド
     * @param teamName
     * @return 引数で渡した野球チームの詳細情報
     */
    public baseballTeam showDetail(String teamName) {
        String sql = "SELECT league_name,team_name,headquarters,inauguration,history FROM teams WHERE team_name=:teamName";

        SqlParameterSource param = new MapSqlParameterSource().addValue("teamName", teamName);
        
        baseballTeam baseballTeam = template.queryForObject(sql, param, BASEBALLTEAM_ROW_MAPPER);
        
        return baseballTeam;
    }
}
