package com.sidlors.singleton;
import java.util.Scanner;
public class Juego{
	
	public static void main(String[] args){
		Scanner sc;
		Marciano marcianos;
		Computadora computadora=new Computadora();
		Jugador jugador=new Jugador();
		marcianos=Marciano.getMarciano();
		sc=new Scanner(System.in);
		int disparos;
		do{
			System.out.println("Digite los dispados: ");
			disparos=sc.nextInt();
			for(int i=0;i<disparos;i++){
				jugador.destruirMarciano();
			}
			computadora.creaMarciano();
			marcianos.cuantosQuedan();
		
		}while(disparos!=0);
	}

}