package lesson3.cn.et.aop;

import org.springframework.stereotype.Component;

@Component
public class MyHouse {
        public void seekHouse(){
            System.out.println("���ⷿ��");
            int i=5/0;
        }
}
