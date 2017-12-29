package lesson1.cn.et.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {

    public static void main(String[] args) {
        //�������󣬻�ȡxml��bean�еĶ���
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/demo2/spring.xml");
        
        C c=(C)context.getBean("c");
        System.out.println(c);
        
        D d=(D)context.getBean("d");
        System.out.println(d.getName());
    }

}
