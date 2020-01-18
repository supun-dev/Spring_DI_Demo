package org.springframeworkdemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Primary
@Profile("es")
public class GrettingServiceSpanish implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Hola ako si Gracias Service!";
    }

}
