package com.everis.log4h.EverisLogBack1JCC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    
        
        

        LOGGER.info("Inicio");
        System.out.println("hola mundo");
        LOGGER.info("Fin");
    }
}
