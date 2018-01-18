package com.sidlors.patterns.state;
public class Activa implements Estado{
	@Override
	public void ejecutarAccion(){
		System.out.println("Estado Activo: Atento");
	}
}