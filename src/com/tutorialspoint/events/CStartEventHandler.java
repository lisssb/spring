package com.tutorialspoint.events;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler 
   implements ApplicationListener<ContextStartedEvent>{

   public void onApplicationEvent(ContextStartedEvent event) {//this tell the kind of event is listening to
      System.out.println("ContextStartedEvent Received");
   }
}