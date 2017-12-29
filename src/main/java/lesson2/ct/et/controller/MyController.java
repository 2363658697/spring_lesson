package lesson2.ct.et.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lesson2.ct.et.service.MyService;

@Controller
public class MyController {
        @Autowired
        private MyService myService;
        
        public  void service(String sql){
            System.out.println(myService.getResult(sql));
        }
}
