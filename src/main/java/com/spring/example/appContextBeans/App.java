package com.spring.example.appContextBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Beans in Application Context..." );
        String[] paths = { "classpath:**/beanRefContext.xml" };
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(paths);
    }
}


