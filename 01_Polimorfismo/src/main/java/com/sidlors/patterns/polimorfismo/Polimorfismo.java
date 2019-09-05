package com.sidlors.patterns.polimorfismo;

import com.sidlors.patterns.polimorfismo.abstracta.Forma;

public class Polimorfismo{
	public static void main(String... args){
		Forma forma = null;
		forma = new Rectangulo();
		forma.dibujar();
	}
}