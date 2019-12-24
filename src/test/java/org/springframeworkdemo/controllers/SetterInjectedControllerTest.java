package org.springframeworkdemo.controllers;

import org.springframeworkdemo.controllers.SetterInjectedController;
import org.springframeworkdemo.services.GreetingServiceImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author IB
 */
public class SetterInjectedControllerTest
{
    private SetterInjectedController setterInjectedController;
    
    @Before
    public void setUp() throws Exception
    {
        this.setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    
    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.USER_NAME,setterInjectedController.sayHello());
    }
}
