package com.sidlors.patterns.polimorfismo;
public class Polimorfismo{
	public static void main(String... args){
		Forma forma = null;
		forma = new Rectangulo();
		forma.dibujar();
	}
}