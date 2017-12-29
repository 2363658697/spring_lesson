package lesson2.ct.et;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lesson2.ct.et.controller.MyController;

public class MyView {
    static ConfigurableApplicationContext context;
    
    static {
        context = new ClassPathXmlApplicationContext(" lesson2/spring.xml");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       try {
         while(true){
            System.out.println("«Î ‰»Îsql”Ôæ‰");
            String sql=scanner.nextLine();
            MyController myController=(MyController) context.getBean("myController");
            myController.service(sql);
        }
    } catch (Exception e) {
        
    }finally {
        context.close();
    }
        
        
    }
}
