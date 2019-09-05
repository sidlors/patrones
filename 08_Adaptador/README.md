# Adapter

![](https://refactoring.guru/images/patterns/cards/adapter-mini.png)

El adaptador es un patrón de diseño estructural que permite la colaboración de objetos incompatibles.

El adaptador actúa como un _wrapper_ entre dos objetos. Captura llamadas para un objeto y las transforma a formato e interfaz reconocibles por el segundo objeto.

___Ejemplos de uso:___ el patrón Adaptador es bastante común en el código Java. A menudo se usa en sistemas basados ​​en algún código heredado. En tales casos, los adaptadores crean código heredado con clases modernas.

Hay algunos adaptadores estándar en las bibliotecas principales de Java:

* java.util.Arrays # asList ()
* java.util.Collections # list ()
* java.util.Collections # enumeration ()
* java.io.InputStreamReader (InputStream) (devuelve un objeto Reader)
* java.io.OutputStreamWriter (OutputStream) (devuelve un objeto Writer)
* javax.xml.bind.annotation.adapters.XmlAdapter # marshal () y #unmarshal ()

___Identificación:___ el adaptador es reconocible por un constructor que toma una instancia de diferente tipo abstracto / interfaz.

Cuando el adaptador recibe una llamada a cualquiera de sus métodos, traduce los parámetros al formato apropiado y luego dirige la llamada a uno o varios métodos del objeto envuelto.

___Aplicabilidad:___ Usa la clase Adaptador cuando quieras usar alguna clase existente, pero su interfaz no es compatible con el resto de su código.

 El patrón Adaptador le permite crear una clase de capa intermedia que sirve como traductor entre su código y una clase heredada, una clase de terceros o cualquier otra clase con una interfaz extraña.
Use el patrón cuando desee reutilizar varias subclases existentes que carecen de alguna funcionalidad común que no se puede agregar a la superclase.

 Puede ampliar cada subclase y colocar la funcionalidad que falta en nuevas clases secundarias. Sin embargo, deberá duplicar el código en todas estas nuevas clases, lo que huele muy mal.

La solución mucho más elegante sería poner la funcionalidad que falta en una clase de adaptador. Luego, envolvería objetos con características faltantes dentro del adaptador, obteniendo dinámicamente las características necesarias. Para que esto funcione, las clases de destino deben tener una interfaz común, y el campo del adaptador debe seguir esa interfaz.
Este enfoque se parece mucho al patrón Decorador.