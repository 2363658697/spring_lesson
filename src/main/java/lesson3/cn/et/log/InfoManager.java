package lesson3.cn.et.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
@Component
public class InfoManager {
    Logger logger=Logger.getLogger(InfoManager.class);
        public void  runBefore(JoinPoint joinPoint) {
            
            String methodName = joinPoint.getSignature().getName();
            logger.debug("������"+methodName+"������");
            System.out.println("������"+methodName+"������");
        }
}
