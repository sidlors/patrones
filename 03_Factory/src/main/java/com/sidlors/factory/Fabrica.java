package com.sidlors.factory;

import com.sidlors.objects.Conexion;
import com.sidlors.objects.MySqlConexion;
import com.sidlors.objects.OracleConexion;
import com.sidlors.objects.SqlServerConexion;

public class Fabrica{
	//Nombre del tipo de conexion
	protected String tipo;
	
	public Fabrica(String t){
		tipo=t;
	}
	
	//Metodo que retorna el objeto conexion especifico
	public Conexion creaConexion(){
		if(tipo.equalsIgnoreCase("Oracle")){
			return new OracleConexion();
		}else if(tipo.equalsIgnoreCase("Mysql")){
			return new MySqlConexion();
		}else{
			return new SqlServerConexion();
		}
	
	}
}