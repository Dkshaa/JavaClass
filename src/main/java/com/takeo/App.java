
package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.takeo.pojo.College;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
        College cs = (College) ctx.getBean("clz");
        cs.displayInfo();
    }
}