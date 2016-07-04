package mx.com.sidors.method.factory.app;

import mx.com.sidors.method.factory.TVFactory;
import mx.com.sidors.method.factory.TVFactoryMethod;
import mx.com.sidors.method.factory.modelo.TVBase;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		TVFactoryMethod tvMethod = new TVFactory();
		TVBase tv = tvMethod.obtenerTV("Negro", "40 pulgadas, 256 M. Colores", "lcd");
		System.out.println(tv.verDescripcion());
	}
}
