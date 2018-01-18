package com.sidlors.patterns.polimorfismo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sidlors.patterns.polimorfismo.Rectangulo;
import com.sidlors.patterns.polimorfismo.abstracta.Forma;

public class PruebaFormasTest {
	
	private static Forma miForma;

	@BeforeClass
	public static void setUp() {
		miForma = new Rectangulo();
	}

	@Test
	public void testname() throws Exception {
		((Rectangulo)miForma).dibujar();
		((Rectangulo)miForma).redimensionar();

	}

}