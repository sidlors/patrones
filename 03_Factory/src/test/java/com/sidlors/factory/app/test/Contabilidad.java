package com.sidlors.factory.app.test;
import java.util.Scanner;

import com.sidlors.factory.Fabrica;
import com.sidlors.objects.Conexion;

public class Contabilidad{


	public static void main(String ...args){
		Scanner sc=new Scanner(System.in);
		Fabrica miFrabrica;
		Conexion miConexion;
		
		System.out.print("Digite su BD: ");
		String tipo=sc.nextLine();
		
		miFrabrica=new Fabrica(tipo);
		miConexion = miFrabrica.creaConexion();
		String salida="Esta conectado con: " +
					   miConexion.descripcion();
		System.out.println(salida);
	
	}

}