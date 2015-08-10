package mx.com.sidlors.patrones.subject;

import java.util.ArrayList;

import mx.com.sidlors.patrones.observer.IObservador;

public class Sujeto implements ISujeto{
	private ArrayList<IObservador> observadores;
	private String accion;
	private String lugar;

	public Sujeto(){
		observadores = new ArrayList<IObservador>();
	}

	/* (non-Javadoc)
	 * @see mx.com.sidlors.patrones.subject.SujetoAbstracto#registrarObs(mx.com.sidlors.patrones.observer.Observador)
	 */
	@Override
	public void registrarObs(IObservador o){
		observadores.add(o);
	}

	/* (non-Javadoc)
	 * @see mx.com.sidlors.patrones.subject.SujetoAbstracto#retirarObs(mx.com.sidlors.patrones.observer.Observador)
	 */
	@Override
	public void retirarObs(IObservador o){
		observadores.remove(o);
	}

	public void ejecutarAccion(String a, String l){
		this.accion = a;
		this.lugar  = l;
		notificar();
	}

	/* (non-Javadoc)
	 * @see mx.com.sidlors.patrones.subject.SujetoAbstracto#notificar()
	 */
	@Override
	public void notificar(){
		for(IObservador o:observadores){
			o.actualizar(this.accion, this.lugar);
		}
	}
}