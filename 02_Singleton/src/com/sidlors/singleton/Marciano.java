package com.sidlors.singleton;
public final class Marciano{
	private static final Marciano marcianos= new Marciano();
	private static int cantidad;

	private Marciano(){
	
		cantidad =10;
	}
	
	public static Marciano getMarciano(){
	 return marcianos;
	}
	
	public static void derribaMarcianos(){
		if (cantidad >0){
			cantidad--;
			System.out.println("Soy el bueno, derribe un marciano");
		}
	}
	public static void creaMarcianos(){
		if(cantidad>0){
			cantidad++;
			System.out.println("Soy el malo, cree un marciano");
		}
	}
	
	public static void cuantosQuedan(){
		if(cantidad>0){
			System.out.println("Queda en el juego: "+cantidad+" marcianos");
		}else{
			System.out.println("Felicidades, has ganado!!!!");
		}
	}
}