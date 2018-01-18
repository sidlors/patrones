package com.sidlors.patterns.polimorfismo.abstracta;

import org.apache.log4j.Logger;

public abstract class ClaseAbstracta{
	
	private static final Logger logger = Logger.getLogger(ClaseAbstracta.class);

	public String nombre;

	public void saludar(){
		logger.info("Hola "+nombre);
	}

	public abstract void despedirse();
}