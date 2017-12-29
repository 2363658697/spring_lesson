package lesson3.cn.et.log;

import org.springframework.stereotype.Component;

@Component
public class User {
        public void login(){
            System.out.println("用户登录");
        }
        
        public void buy(){
            System.out.println("用户购买商品");
        }
}
