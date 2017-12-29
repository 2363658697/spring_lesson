package lesson4.cn.et.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BuserImpl{
    @Autowired
    JdbcTemplate jdbcTemplate;
    
        public void  saveB(int money) {
            String sql="update fee set money=money+"+money+ " where id=2";
            jdbcTemplate.execute(sql);       
        }
}
