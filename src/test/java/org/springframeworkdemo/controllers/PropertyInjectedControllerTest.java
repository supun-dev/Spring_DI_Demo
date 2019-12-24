package org.springframeworkdemo.controllers;

import org.springframeworkdemo.controllers.PropertyInjectedController;
import org.springframeworkdemo.services.GreetingServiceImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author IB
 */
public class PropertyInjectedControllerTest
{
    private PropertyInjectedController propertyInjectedController;
    
    @Before
    public void setUp() throws Exception
    {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }
    
    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.USER_NAME,propertyInjectedController.sayHello());
    }
}
