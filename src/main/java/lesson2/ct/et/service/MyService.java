package lesson2.ct.et.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lesson2.ct.et.dao.MyDao;

@Service
public class MyService {
        @Autowired
        private MyDao myDao;
        
        public String getResult(String sql) {
            return myDao.getQuery(sql).toString();
        }
}
