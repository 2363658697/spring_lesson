package lesson1.cn.et.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {

    public static void main(String[] args) {
        //容器对象，获取xml中bean中的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/demo1/spring.xml");
        /**
         * ApplicationContext:都支持字符串指令：
         * 1.类路径查找   classpath: 项目中xml文件的路径    2.文件系统查找  file:系统磁盘中xml文件的路径
         * 
         * ClassPathXmlApplicationContext：默认是classpath
         * FileSystemXmlApplicationContext: 默认是file
         * GenericXmlApplicationContext: 默认是classpath
         * 
         */
        
        //getBean()方法：传入id返回对应的对象(Object),需要强制转换
        //没有设置id, 默认id的值：包名.类名#编号，当bean中出现>=2个类实例，不知道取出的是哪个实例
        //还可以通过类名.class获取对象，当bean中出现>=2个类实例，报错
        A a=(A)context.getBean("a");
        System.out.println(a);
        
        B b=(B)context.getBean("b");
        System.out.println(b);
        
        //遍历容器中的对象名称
        String[] strings=context.getBeanDefinitionNames();
        for(String string:strings){
            System.out.println(string);
        }
    }

}
