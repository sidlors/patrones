package mx.com.sidors.method.factory.modelo;

public class LCD extends TVBase {

	public LCD(String color, String descripcion, String tipoPantalla) {
		super.setColor(color);
		super.setDescripcion(descripcion);
		super.setTipoPantalla(tipoPantalla);
	}
}