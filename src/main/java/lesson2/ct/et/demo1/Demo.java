package lesson2.ct.et.demo1;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo {

    static ApplicationContext context;
    
    static {
        context = new ClassPathXmlApplicationContext(" lesson2/ct/et/demo1/spring.xml");
    }

    public static void main(String[] args) {
        Myconf cMyconf=(Myconf) context.getBean("myconf");
       DataSource dataSource= cMyconf.dataSource();
       JdbcTemplate jdbc=cMyconf.jdbcTemplate(dataSource); 
       
        List<Map<String, Object>> list= jdbc.queryForList("select * from news");
        System.out.println(list);
    }
}
