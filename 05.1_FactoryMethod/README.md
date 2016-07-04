## Patrón Factory Method

### ¿Que es el Patrón de Diseño Factory Method / Constructor virtual?


El patrón Factory Method se define como una interfaz para la creación de cierto tipo de objeto, permitiendo que las subclases decidan que clase concreta necesitan instanciar. El problema que se plantea en algunos entornos es que una clase no puede anticipar el tipo de objetos que debe crear debido a la jerarquía de clases existente, lo cual provoca que tenga que delegar esta tarea en una subclase.

Es decir de una forma mas sencilla soluciona el problema que se presentan cuando tenemos que crear una instancia de una clase que no sabemos aun a que tipo de clase depende, generalmente esto sucede por alguna opción del usuario o por alguna configuración en tiempo de ejecución.

### Diagrama UML

![](http://3.bp.blogspot.com/-18hppk8MQUU/VFjbkNq1z4I/AAAAAAAABqE/FZdqHc6lQlY/s1600/01.jpg)

**ClaseBase:** Clase abstracta que contiene los métodos bases.
**ClaseEspecializada:** Clase que extiende de la Clase Base por ende utiliza todos los métodos de la clase base y agrega los propios.
**InterfaceFactoryMethod:** Contiene la firma para los métodos que se deben utilizar.
**ClaseFactory:** La magia del Patrón Factory Method, pasa por aca el metodo obtenerObject, va determinar de acuerdo a los datos de entrada que ClaseEspecializada va a utilizar.
**Cliente:** El cliente utiliza una ClaseFactory solicitando una implementación de la ClaseBase.


**Nombre del patrón:**  Patrón Factory Method / Constructor virtual

**Clasificación del Patrón:** Creacional

### Intención

Sirven cuando no se puede anticipar el tipo de objeto que debe crear y quiere que sus subclases especifiquen dichos objetos.


Ejemplo

Problema: El cliente necesita un televisor, pero el mismo desconoce si es CRT, PLASMA o LCD.

![](http://4.bp.blogspot.com/-tFjN6NmhtTc/VFfj0xvsrBI/AAAAAAAABp0/8BdKoFA4H7M/s1600/00.jpg)

_TVBase_

```java

package mx.com.sidors.method.factory.modelo;
public abstract class TVBase {
 
 private String descripcion;
 private String tipoPantalla;
 private String color;

 /**
  * <p> Muestra la descripcion de la television. </p>
  * @author nconde
  * @return String
  */
 public String verDescripcion(){
  return "Descripcion: " +this.descripcion + " Tipo de pantalla: " + this.tipoPantalla  + " Color: " + color; 
 }
 
 public String getDescripcion() {
  return descripcion;
 }

 public void setDescripcion(String descripcion) {
  this.descripcion = descripcion;
 }
 
 
 public String getTipoPantalla() {
  return tipoPantalla;
 }

 public void setTipoPantalla(String tipoPantalla) {
  this.tipoPantalla = tipoPantalla;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }
}
```

_CRT_


```java
import ar.com.patronesdisenio.factorymethod.base.TVBase;

public class CRT extends TVBase {

 public CRT (String color, String descripcion, String tipoPantalla){
  super.setColor(color);
  super.setDescripcion(descripcion);
  super.setTipoPantalla(tipoPantalla);
 }
}
```

**LCD**

```java
import mx.com.sidors.method.factory.modelo.TVBase;

public class LCD extends TVBase {

 public LCD (String color, String descripcion, String tipoPantalla){
  super.setColor(color);
  super.setDescripcion(descripcion);
  super.setTipoPantalla(tipoPantalla);
 }
}
```
*Plazma*

```java
import mx.com.sidors.method.factory.modelo.TVBase;

public class Plasma extends TVBase {

 public Plasma (String color, String descripcion, String tipoPantalla){
  super.setColor(color);
  super.setDescripcion(descripcion);
  super.setTipoPantalla(tipoPantalla);
 }
}
```

*TVFactoryMethod*

```java
package mx.com.sidors.method.factory;

import mx.com.sidors.method.factory.modelo.TVBase;

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
```

*TVFactory*

```java
package mx.com.sidors.method.factory;

import mx.com.sidors.method.factory.modelo.CRT;
import mx.com.sidors.method.factory.modelo.LCD;
import mx.com.sidors.method.factory.modelo.Plasma;
import mx.com.sidors.method.factory.modelo.TVBase;

public class TVFactory implements TVFactoryMethod {

 @Override
 public TVBase obtenerTV(String color, String descripcion, String tipoPantalla) {
 
  if (tipoPantalla == "lcd"){
   return new LCD(color, descripcion, tipoPantalla);
  } else  if (tipoPantalla == "plasma"){
   return new Plasma(color, descripcion, tipoPantalla);
  } else  if (tipoPantalla == "crt"){
   return new CRT(color, descripcion, tipoPantalla);
  }    
  return null;
 }
}
```

***Clase App (Cliente)***


```java
package mx.com.sidors.method.factory.app;

import mx.com.sidors.method.factory.TVFactory;
import mx.com.sidors.method.factory.TVFactoryMethod;
import mx.com.sidors.method.factory.modelo.TVBase;

public class Cliente {

 /**
  * @param args
  */
 public static void main(String[] args) {
  TVFactoryMethod tvMethod = new TVFactory();
  TVBase tv = tvMethod.obtenerTV("Negro", "40 pulgadas, 256 M. Colores","lcd");
  System.out.println(tv.verDescripcion());
 }
}
```


***Prueba Unitaria del factory method***


```java
package mx.com.sidors;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mx.com.sidors.method.factory.TVFactory;
import mx.com.sidors.method.factory.TVFactoryMethod;
import mx.com.sidors.method.factory.modelo.TVBase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	private static final String DESCRIPCION="Descripcion: 40 pulgadas, 256 M. Colores Tipo de pantalla: lcd Color: Negro";
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		TVFactoryMethod tvMethod = new TVFactory();
		TVBase tv = tvMethod.obtenerTV("Negro", "40 pulgadas, 256 M. Colores", "lcd");
		System.out.println(tv.verDescripcion());
		assertTrue(DESCRIPCION.equals(tv.verDescripcion()));
	}
}
```

### Prueba Unitaria Aprobada :+1:

![](https://snag.gy/xcvqHK.jpg)
