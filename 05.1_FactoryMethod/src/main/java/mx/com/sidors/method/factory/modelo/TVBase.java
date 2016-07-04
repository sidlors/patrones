package mx.com.sidors.method.factory.modelo;

public abstract class TVBase {

	private String descripcion;
	private String tipoPantalla;
	private String color;

	/**
	 * <p>
	 * Muestra la descripcion de la television.
	 * </p>
	 * 
	 * @author nconde
	 * @return String
	 */
	public String verDescripcion() {
		return "Descripcion: " + this.descripcion + " Tipo de pantalla: " + this.tipoPantalla + " Color: " + color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}