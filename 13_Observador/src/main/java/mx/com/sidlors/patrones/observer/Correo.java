package mx.com.sidlors.patrones.observer;

public class Correo implements IObservador{
	@Override
	public void actualizar(String a, String l){
		System.out.println("Enviando correo, Accion: "+a+", Lugar: "+l);
	}
}