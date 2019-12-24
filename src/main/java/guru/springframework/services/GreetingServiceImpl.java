package guru.springframework.services;

/**
 *
 * @author IB
 */
public class GreetingServiceImpl implements GreetingService
{
    public static final String USER_NAME = "Supun";
    
    
    @Override
    public String sayGreeting()
    {
        return USER_NAME;
    }

}
