package com.sidlors.patterns.polimorfismo;

import org.apache.log4j.Logger;

public class Hereda implements Interface{
	
	private static final Logger logger = Logger.getLogger(Hereda.class);

	public Hereda(){
		saludar();
	}

	@Override
	public String getNombre(){
		return miNombre;
	}

	@Override
	public void saludar(){
		logger.info("Hola "+getNombre());
	}

	public static void main(String... args){
		Hereda hereda = new Hereda();
	}
}