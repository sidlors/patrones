package mx.com.sidlors.patrones.subject;

import mx.com.sidlors.patrones.observer.IObservador;

public interface ISujeto {

	public abstract void registrarObs(IObservador o);

	public abstract void retirarObs(IObservador o);

	public abstract void notificar();

}