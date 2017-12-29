package lesson3.cn.et.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    
    static ApplicationContext context;
    
    static {
        context = new ClassPathXmlApplicationContext(" lesson3/cn/et/aop/spring.xml");
    }
    
    public static void main(String[] args) {
        MyHouse myHouse=(MyHouse) context.getBean("myHouse");
        myHouse.seekHouse();
    }
}
