package lesson3.cn.et.log;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    
    static ApplicationContext context;
    
    static {
        context = new ClassPathXmlApplicationContext(" lesson3/cn/et/log/spring.xml");
    }
    
    public static void main(String[] args) {
        User user=(User) context.getBean("user");
        Admin admin=(Admin) context.getBean("admin");
        
        user.login();
        for(int i=0;i<3;i++){
            user.buy();
        }
        
        admin.addGoods();
    }
}
