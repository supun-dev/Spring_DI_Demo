package org.springframeworkdemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "I am injected from the Constructor !";
    } 
}
