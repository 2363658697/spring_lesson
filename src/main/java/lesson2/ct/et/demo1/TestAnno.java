package lesson2.ct.et.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    
    static ApplicationContext context;
    
    static {
        context = new ClassPathXmlApplicationContext(" lesson2/ct/et/demo1/spring.xml");
    }
    
    public static void main(String[] args) {
        B b=(B) context.getBean("b");
        System.out.println(b.getA());
    }
}
