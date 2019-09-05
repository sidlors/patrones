package com.sidlors.patterns.polimorfismo;	
public class PruebaFormas{

	public static void main(String... args){
		Forma miForma = new Rectangulo();
		miForma.dibujar();
		miForma.redimensionar();
	}
}