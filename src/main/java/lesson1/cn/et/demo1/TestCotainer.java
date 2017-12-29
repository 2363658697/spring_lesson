package lesson1.cn.et.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestCotainer {

    public static void main(String[] args) {
        //�������󣬻�ȡxml��bean�еĶ���
        ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/demo1/spring.xml");
        /**
         * ApplicationContext:��֧���ַ���ָ�
         * 1.��·������   classpath: ��Ŀ��xml�ļ���·��    2.�ļ�ϵͳ����  file:ϵͳ������xml�ļ���·��
         * 
         * ClassPathXmlApplicationContext��Ĭ����classpath
         * FileSystemXmlApplicationContext: Ĭ����file
         * GenericXmlApplicationContext: Ĭ����classpath
         * 
         */
        
        //getBean()����������id���ض�Ӧ�Ķ���(Object),��Ҫǿ��ת��
        //û������id, Ĭ��id��ֵ������.����#��ţ���bean�г���>=2����ʵ������֪��ȡ�������ĸ�ʵ��
        //������ͨ������.class��ȡ���󣬵�bean�г���>=2����ʵ��������
        A a=(A)context.getBean("a");
        System.out.println(a);
        
        B b=(B)context.getBean("b");
        System.out.println(b);
        
        //���������еĶ�������
        String[] strings=context.getBeanDefinitionNames();
        for(String string:strings){
            System.out.println(string);
        }
    }

}
