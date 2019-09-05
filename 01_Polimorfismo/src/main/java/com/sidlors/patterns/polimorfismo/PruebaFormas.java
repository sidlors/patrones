package com.sidlors.patterns.polimorfismo;

import com.sidlors.patterns.polimorfismo.abstracta.Forma;

public class PruebaFormas{

	public static void main(String... args){
		Forma miForma = new Rectangulo();
		miForma.dibujar();
		miForma.redimensionar();
	}
}