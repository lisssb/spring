package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      
      
      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld1");
   
      obj.getMessage();
      obj2.getMessage();
      context.registerShutdownHook(); //This will ensure a graceful shutdown and call the relevant destroy methods.
   }
}