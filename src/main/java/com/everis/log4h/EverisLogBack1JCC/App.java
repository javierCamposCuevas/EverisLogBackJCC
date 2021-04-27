package com.everis.log4h.EverisLogBack1JCC;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App 
{
	static Scanner sc = new Scanner(System.in);
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void equipo (int equipo) {
		LOGGER.info("Iniciando método equipo");
		System.out.println("1.Sevilla\n"+"2.Betis\n"+"3.Real Madrid\n"+"4.Barça\n"+"0.Salir\n");
		switch (equipo) {
		case 1:
			LOGGER.info("Sevilla: Muy buena elección");
			System.out.println("Bien bien así se hace");
			break;
		case 2:
			LOGGER.info("Betis: Amante de las vitrinas vacías por lo que veo");
			System.out.println("Buen material para meme");
			break;
		case 3:
			LOGGER.info("Madrird: Con los pedazo de equipos uqe hay aquí y escoges esta cosa");
			System.out.println("Real Mandril, digo Madrid");
			break;
		case 4:
			LOGGER.error("Barça: Esto es un error");
			System.err.println("Sigue siendo un error");
			break;
		case 0:
			LOGGER.info("Sigo pensando que me merezco un 10");
			System.out.println("Creo que me merezco un 10 Tellez");
			LOGGER.debug("Finalizando el método equipo");
			break;
		}
		
	}
    public static void main( String[] args )
    {
    	int opt = sc.nextInt();
    	equipo(opt);
    
        
    }
}
