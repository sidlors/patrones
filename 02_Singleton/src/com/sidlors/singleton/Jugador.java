package com.sidlors.singleton;
public class Jugador{
	private Marciano marcianos;
	public Jugador(){
		marcianos=Marciano.getMarciano();
	}
	public void destruirMarciano(){
		marcianos.derribaMarcianos();
	}
}