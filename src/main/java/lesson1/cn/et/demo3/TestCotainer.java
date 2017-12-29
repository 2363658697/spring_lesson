package lesson1.cn.et.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/demo3/spring.xml");

        A a=(A)context.getBean("a");
        System.out.println(a);
        
        B b=(B)context.getBean("b");
        System.out.println(b);
        
    }

}
