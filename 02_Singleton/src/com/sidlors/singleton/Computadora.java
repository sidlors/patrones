package com.sidlors.singleton;
public class Computadora{
	private Marciano marcianos=Marciano.getMarciano();
	
	public Computadora(){
	
		marcianos.creaMarcianos();
	
	}
	public void creaMarciano(){
		marcianos.creaMarcianos();
	}
}