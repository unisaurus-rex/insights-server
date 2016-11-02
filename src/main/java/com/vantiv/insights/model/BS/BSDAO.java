package com.vantiv.insights.model.BS;

import javax.sql.DataSource;
import java.util.List;

/**
 * Data Access Object for BS
 */
public interface BSDAO {
    public void setDataSource(DataSource ds);
    public BS getBS(Integer id);
    public List<BS> listBS();
}
