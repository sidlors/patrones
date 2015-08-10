package mx.com.sidlors.patrones.observer;

public class Auditor implements IObservador{
	@Override
	public void actualizar(String a, String l){
		System.out.println("Guardando en la BD, Accion: "+a+", Lugar: "+l);
	}
}