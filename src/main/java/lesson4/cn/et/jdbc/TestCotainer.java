package lesson4.cn.et.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCotainer {
    static DataSource dataSource;
    static Connection connection;
    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson4/cn/et/jdbc/spring.xml");
         dataSource = (DataSource) context.getBean("dataSource");
    }

    public static void main(String[] args) {
            try {
                connection=dataSource.getConnection();
                //jdbc默认是自动提交事务，需要修改为手动提交
                connection.setAutoCommit(false);
                addMoney();

                reduceMoney();
                connection.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public static void addMoney() {
        String sql = "update fee set money=90 where id=1";
        try {
            connection.prepareStatement(sql).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void reduceMoney() {
        String sql = "update fee set money=210 where id=2";
        try {
            connection.prepareStatement(sql).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
