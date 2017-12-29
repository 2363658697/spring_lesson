package lesson3.cn.et.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;


@Component
public class HouseAgent {

    public void seekBefore(){
        System.out.println("招租");
    }
    
    
    public void seekAfter() {
        System.out.println("收租");
    }
    
    public void throwException(JoinPoint joinPoint){
        System.out.println("出现异常");
      //得到拦截的方法名
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName);
        //打印出切点对象
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getThis());
      //得到方法的执行参数
       Object [] args = joinPoint.getArgs();
       for(Object a:args){
           System.out.println(a);
       }
    }
}
