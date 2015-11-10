package com.camel.exec;

import org.apache.camel.spring.Main;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App extends Main
{
    public static void main( String[] args )
    {
    	
    	try{
    	
    	AbstractApplicationContext context=createApplicationContext();
    	context.start();
    	
    	while(true){
    		
    	}
    	
    	
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
        
    }

    
    
    
    protected  static AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("xml-dsl.xml");
    }
}
