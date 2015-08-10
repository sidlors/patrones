package mx.com.sidlors.patrones.strategy.app.test;

import mx.com.sidlors.patrones.strategy.algoritmo.Algoritmo;
import mx.com.sidlors.patrones.strategy.algoritmo.EnAire;
import mx.com.sidlors.patrones.strategy.algoritmo.EnAireVeloz;
import mx.com.sidlors.patrones.strategy.algoritmo.EnTierra;
import mx.com.sidlors.patrones.strategy.clases.Avion;
import mx.com.sidlors.patrones.strategy.clases.AvionComercial;
import mx.com.sidlors.patrones.strategy.clases.AvionRapido;

import org.junit.Before;
import org.junit.Test;

public class PruebaEstrategia{
	
	private Avion avion;
	private Algoritmo algoritmo;
	
	@Before
	public void setUp(){
		avion=new AvionComercial();
		algoritmo= new EnTierra();
	}
	
	@Test
	public void strategyTest(){
//		AvionComercial avionComercial = new AvionComercial();
		

		System.out.println("Primero el avion comercial...");
		
		avion.setAlgoritmo(algoritmo);
		avion.mover();
		algoritmo=new EnAire();
		avion.setAlgoritmo(algoritmo);
		avion.mover();
		System.out.println("El avion comercial veloz...");
		algoritmo=new EnAireVeloz();
		avion.setAlgoritmo(algoritmo);
		avion.mover();
		System.out.println();

		avion = new AvionRapido();
		System.out.println("Ahora el avion rapido...");
		algoritmo=new EnTierra();
		avion.setAlgoritmo(algoritmo);
		avion.mover();
		algoritmo=new EnAireVeloz();
		avion.setAlgoritmo(algoritmo);
		avion.mover();
		System.out.println();

		
		
	}
}