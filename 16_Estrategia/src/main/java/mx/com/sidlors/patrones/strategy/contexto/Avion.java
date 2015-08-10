package mx.com.sidlors.patrones.strategy.contexto;

import mx.com.sidlors.patrones.strategy.estrategias.Algoritmo;

public abstract class Avion{
	private Algoritmo miAlgoritmo;

	public void setAlgoritmo(Algoritmo a){
		this.miAlgoritmo = a;
	}

	public void mover(){
		this.miAlgoritmo.moverse();
	}
}