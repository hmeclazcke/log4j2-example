package org.hmeclazcke.logSample;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	/**
	 * Logger log4j2 example
	 * 
	 * jvm arguments:
	 * 	Required: "-DAPP_LOG_ROOT=c:/temp" --> Used in "log4j2.xml". Location of logs. 
	 * 	Optional: "-Dlog4j2.debug" --> Prints the log4j2 logs.
	 */
    private static final Logger LOGGER = LogManager.getLogger( App.class.getName() );
    
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // Prints the jvm arguments. Must have "-DAPP_LOG_ROOT=c:/temp" --> location of the logs.-
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> jvmArgs = runtimeMXBean.getInputArguments();
        for (String arg : jvmArgs) {
            System.out.println( arg );
        }
        
        LOGGER.debug( "Debug Message Logged !!!" );
        LOGGER.info( "Info Message Logged !!!" );
        LOGGER.error( "Error Message Logged !!!", new NullPointerException( "NullError" ) );
    }
}
