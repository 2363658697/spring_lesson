package lesson3.cn.et.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HouseAgent implements InvocationHandler {
    
    private HouseOwner ho;
    public HouseAgent(HouseOwner ho) {
        this.ho = ho;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("еазт");
        Object object=method.invoke(ho, args);
        System.out.println("Ъезт");
        return object;
    }


}
