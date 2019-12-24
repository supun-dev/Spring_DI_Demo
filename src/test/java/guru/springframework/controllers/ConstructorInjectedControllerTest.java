package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author IB
 */
public class ConstructorInjectedControllerTest
{
    private ConstructorInjectedController constructorInjectedController;
    
    @Before
    public void setUp() throws Exception
    {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    
    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.USER_NAME,constructorInjectedController.sayHello());
    }
            
            
}
