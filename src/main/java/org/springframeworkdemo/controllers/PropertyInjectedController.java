package org.springframeworkdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframeworkdemo.services.GreetingService;

@Controller //Indicates that this is a spring managed bean
public class PropertyInjectedController
{
    @Autowired //Tells Spring framework to inject this bean - This bean also needs to have an annotation like @Service,@Component,@Controller 
    //If we use the concrete class object name ( starting with lower case ) Spring will assume its the correct bean.DO NOT RELY ON THIS.
    public GreetingService greetingServiceImpl;
    
    //Injecting through property
    public String sayHello()
    {
        return greetingServiceImpl.sayGreeting();
    }  
}
