package com.vantiv.insights.model.BS;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Row mapper for BS
 */
public class BSRowMapper implements RowMapper<BS> {
    public BS mapRow(ResultSet rs, int rowNum) throws SQLException {
        BS bs = new BS();

        bs.setId(rs.getInt("id"));
        bs.setName(rs.getString("name"));
        bs.setDescription(rs.getString("description"));
        return bs;
    }
}
