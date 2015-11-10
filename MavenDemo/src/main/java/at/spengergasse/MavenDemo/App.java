package at.spengergasse.MavenDemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        

        
        Logger.getLogger(App.class).info("das ist eine Logging-Message");
    }
    
    
    public static int test(int x)
    {
    	return x * 6;
    }
}
