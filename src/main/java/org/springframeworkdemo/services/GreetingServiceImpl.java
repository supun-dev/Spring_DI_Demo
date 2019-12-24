package org.springframeworkdemo.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author IB
 */
@Service
public class GreetingServiceImpl implements GreetingService
{
    public static final String USER_NAME = "Supun";
    
    
    @Override
    public String sayGreeting()
    {
        return USER_NAME;
    }

}
