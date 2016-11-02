package com.vantiv.insights.model.BS;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Data Access Object Implementation for BS
 */
public class BSDAOImpl implements BSDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public BSDAOImpl(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public BS getBS(Integer id){
        String sql = "select * from BS where id = ?";
        BS bs = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BSRowMapper());

        return bs;
    }

    public List<BS> listBS() {
        String sql = "select * from BS";
        List<BS> bsList = jdbcTemplate.query(sql, new BSRowMapper());

        return bsList;
    }
}
