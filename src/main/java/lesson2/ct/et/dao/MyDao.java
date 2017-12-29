package lesson2.ct.et.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class MyDao {
    @Autowired
        private JdbcTemplate jdbcTemplate;
    
    public List<Map<String, Object>> getQuery(String sql) {
        return jdbcTemplate.queryForList(sql);
    }
}
