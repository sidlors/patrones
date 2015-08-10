package mx.com.sidlors.patrones.strategy.estrategias;


public class EnTierra implements Algoritmo{
	@Override
	public void moverse(){
		System.out.println("Moviendose sobre ruedas");
	}
}