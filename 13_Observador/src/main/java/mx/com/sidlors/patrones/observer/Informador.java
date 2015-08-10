package mx.com.sidlors.patrones.observer;

public class Informador implements IObservador{
	@Override
	public void actualizar(String a, String l){
		System.out.println("Informando al jefe, Accion: "+a+", Lugar: "+l);
	}
}