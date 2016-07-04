package mx.com.sidors.method.factory;

import mx.com.sidors.method.factory.modelo.CRT;
import mx.com.sidors.method.factory.modelo.LCD;
import mx.com.sidors.method.factory.modelo.Plasma;
import mx.com.sidors.method.factory.modelo.TVBase;

/**
 * @author usuario
 */
public class TVFactory implements TVFactoryMethod {

	public TVBase obtenerTV(String color, String descripcion, String tipoPantalla) {

		if (tipoPantalla == "lcd") {
			return new LCD(color, descripcion, tipoPantalla);
		} else if (tipoPantalla == "plasma") {
			return new Plasma(color, descripcion, tipoPantalla);
		} else if (tipoPantalla == "crt") {
			return new CRT(color, descripcion, tipoPantalla);
		}
		return null;
	}
}