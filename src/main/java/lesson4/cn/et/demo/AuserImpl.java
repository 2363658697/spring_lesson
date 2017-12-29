package lesson4.cn.et.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AuserImpl {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    BuserImpl bdDaoImpl;
        public void  updateA(int money) {
            String sql="update fee set money=money-"+money+" where id=1";
            jdbcTemplate.execute(sql);
            
            bdDaoImpl.saveB(money);
            
            int i=4/0;
        }
}
