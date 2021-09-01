package com.yash.LogDemo2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.time.LocalDate;
public class LogDemo 
{
	static Logger logger=Logger.getLogger(LogDemo.class);


    public static void main(String[] args) 
    {
    	PropertyConfigurator.configure("log.properties");
        logger.info("this is the log for LogDemo");
        System.out.println("Logger Executed");
        logger.warn("This is warning message");
        logger.error("This is error");
        logger.debug("This is warn message");
        logger.fatal("This is fatal message");
        System.out.println("Completed");
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        
    }
}
