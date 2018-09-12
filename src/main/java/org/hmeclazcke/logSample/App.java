package org.hmeclazcke.logSample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	/**
	 * Logger log4j2 example
	 * https://howtodoinjava.com/log4j2/levelrangefilter-example/
	 */
    private static final Logger LOGGER = LogManager.getLogger( App.class.getName() );
    
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
    }
}
