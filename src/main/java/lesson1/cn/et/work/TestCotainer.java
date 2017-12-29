package lesson1.cn.et.work;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCotainer {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/work/spring.xml");

        Connection connection =(Connection) context.getBean("connection");
        System.out.println(connection);

    }

}
