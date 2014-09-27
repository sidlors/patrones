package com.sidlors.abstracfactory;

public class MySqlConexion extends Conexion{
		//constructor vacio
		public MySqlConexion(){
		
		}
		
		@Override
		public String descripcion(){
			return "Conexion de MySqlConexion";
		}

}