package lesson4.cn.et.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {
    static ApplicationContext context;
    static{
        context = new ClassPathXmlApplicationContext("lesson4/cn/et/demo/spring.xml");
    }
    
    
    public static void main(String[] args) {
            AuserImpl daoImpl=(AuserImpl) context.getBean("auserImpl");
            daoImpl.updateA(10);
    }

}
