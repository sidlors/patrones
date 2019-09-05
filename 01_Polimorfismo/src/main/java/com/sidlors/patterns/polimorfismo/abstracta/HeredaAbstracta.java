package com.sidlors.patterns.polimorfismo.abstracta;

import org.apache.log4j.Logger;

import com.sidlors.patterns.polimorfismo.abstracta.ClaseAbstracta;

public class HeredaAbstracta extends ClaseAbstracta{
	
	private static final Logger logger = Logger.getLogger(HeredaAbstracta.class);


	@Override
	public void despedirse(){
		logger.info("Ciao "+super.nombre);
	}

	public HeredaAbstracta(){
		darNombre("Alexys");
		saludar();
		despedirse();
	}

	public void darNombre(String nombre){
		super.nombre = nombre;		
	}

	public static void main(String... args){
		HeredaAbstracta ha = new HeredaAbstracta();
	}	
}