package com.sidlors.patterns.polimorfismo;

import org.apache.log4j.Logger;

import com.sidlors.patterns.polimorfismo.abstracta.Forma;

public class Rectangulo extends Forma {

	private static final Logger logger = Logger.getLogger(Rectangulo.class);

	public Rectangulo() {
		mover(5, 8);
		dondeEstoy();
	}

	@Override
	public void dibujar() {
		logger.info("Estoy dibujando un Rectangulo");
	}

	@Override
	public void redimensionar() {
		logger.info("Estoy siendo mas grande");
	}

}