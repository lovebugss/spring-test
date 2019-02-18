package com.itrjp.test;

import com.itrjp.test.bean.A;
import com.itrjp.test.bean.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renjp
 */
public class MainApplication {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        A a = applicationContext.getBean("a", A.class);
        System.out.println(a.getB());
        B b = applicationContext.getBean("b", B.class);
        System.out.println(b.getA());
        System.out.println("done");
    }
}
