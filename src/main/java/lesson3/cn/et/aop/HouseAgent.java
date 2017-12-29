package lesson3.cn.et.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;


@Component
public class HouseAgent {

    public void seekBefore(){
        System.out.println("����");
    }
    
    
    public void seekAfter() {
        System.out.println("����");
    }
    
    public void throwException(JoinPoint joinPoint){
        System.out.println("�����쳣");
      //�õ����صķ�����
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName);
        //��ӡ���е����
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getThis());
      //�õ�������ִ�в���
       Object [] args = joinPoint.getArgs();
       for(Object a:args){
           System.out.println(a);
       }
    }
}
