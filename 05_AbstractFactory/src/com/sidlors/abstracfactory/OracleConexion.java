package com.sidlors.abstracfactory;

public class OracleConexion extends Conexion{
		//constructor vacio
		public OracleConexion(){
		
		}
		
		@Override
		public String descripcion(){
			return "Conexion de Oracle";
		}

}