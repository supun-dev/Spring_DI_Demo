package org.springframeworkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframeworkdemo.controllers.ConstructorInjectedController;
import org.springframeworkdemo.controllers.PropertyInjectedController;
import org.springframeworkdemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication
{

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        
//        MyController myController = (MyController) ctx.getBean("myController");
//        myController.doGreeting();
  
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
