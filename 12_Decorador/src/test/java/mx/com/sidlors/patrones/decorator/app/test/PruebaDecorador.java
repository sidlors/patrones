package mx.com.sidlors.patrones.decorator.app.test;
import java.util.Scanner;

import org.junit.Test;

import mx.com.sidlors.patrones.decorator.Hamburguesa;
import mx.com.sidlors.patrones.decorator.Lechuga;
import mx.com.sidlors.patrones.decorator.Queso;
import mx.com.sidlors.patrones.decorator.Tomate;

public class PruebaDecorador{
	
	@Test
	public void decoradorTest(){
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************");
		System.out.println("Bienvenido a Comidas Rapidas");
		System.out.println("****************************");
		System.out.println();

		Hamburguesa hamburguesa = new Hamburguesa();

		int opcion = 0;
		do{
			System.out.println("Con su hamburguesa, seleccione su adicion:");
			System.out.println("1=Lechuga, 2=Tomate, 3=Queso, 0=Terminar");
			opcion = sc.nextInt();
			switch(opcion){
				case 0:
					break;
				case 1:
					hamburguesa = new Lechuga(hamburguesa);
					break;
				case 2:
					hamburguesa = new Tomate(hamburguesa);
					break;
				case 3:
					hamburguesa = new Queso(hamburguesa);
					break;
				default:
					System.out.println("Opcion no valida");
			}
		} while(opcion!=0);
		
		sc.close();

		System.out.println();
		System.out.println("Entregando.....");
		System.out.println(hamburguesa.getDescripcion());
		System.out.println("Disfrute su pedido!!!");
	}
}