package lesson2.ct.et.demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Resource(name="a")
        private A a;
        
    
        public A getA() {
            return a;
        }
        
}
