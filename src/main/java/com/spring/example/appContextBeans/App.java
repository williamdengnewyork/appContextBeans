package com.spring.example.appContextBeans;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Beans in Application Context..." );
        String[] paths = { "classpath:**/beanRefContext.xml" };
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(paths);
        

        
        System.out.println( "SgetBeanDefinitionNames()..." );
        System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
        
        
        
    }
}


