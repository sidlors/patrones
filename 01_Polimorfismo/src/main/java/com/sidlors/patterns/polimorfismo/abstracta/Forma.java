package com.sidlors.patterns.polimorfismo.abstracta;

import org.apache.log4j.Logger;

public abstract class Forma{
	
	private static final Logger log = Logger.getLogger(Forma.class);

	protected int posicionX;
	protected int posicionY;

	protected void mover(int nuevoX, int nuevoY){
		posicionX = nuevoX;
		posicionY = nuevoY;
	}

	protected void dondeEstoy(){
	String lugar = "Estoy en X: "+posicionX+
					" en Y: "+posicionY;
	log.info(lugar);
	}

	protected abstract void dibujar();
	protected abstract void redimensionar();
}