package mx.com.sidors.method.factory;

import mx.com.sidors.method.factory.modelo.TVBase;

/**
 * @author nconde
 */
public interface TVFactoryMethod {
 
 /**
  * Se obtiene el tv.
  * @param color
  * @param descripcion
  * @param tipoPantalla
  * @return
  */
 public TVBase obtenerTV(String color, String descripcion, String tipoPantalla);
}