package lesson3.cn.et.java;

import java.lang.reflect.Proxy;

public class TestHouse {
    public static void main(String[] args) {
        HouseOwner o = new AfHouseOwner();

        HouseAgent agent = new HouseAgent(o);

        /*HouseOwner hOwner = (HouseOwner) Proxy.newProxyInstance(TestHouse.class.getClassLoader(), o.getClass().getInterfaces(), agent);
        hOwner.seekHouse();*/
    }
}
