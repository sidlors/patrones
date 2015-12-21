¿Cuál es el método habitual para crear una instancia de una clase en java? La mayoría respondería a esta pregunta: por medio de palabra clave "new". Bueno, pues eso se considera pasado de moda. ahora vamos a ver cómo? 

Si el código de creación de objetos se extiende en toda la aplicación, y si es necesario cambiar el proceso de creación de objetos y luego tienes que ir en cada lugar para hacer los cambios necesarios considere el uso de patrón de fábrica.

El patrón de fábrica es un patrón de diseño creacional cuya intención es proporcionar una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. La lógica creational se encapsula dentro de la fábrica que o bien proporciona un método para su creación o delegados de la creación del objeto a una subclase. El cliente no tiene conocimiento de las diferentes implementaciones de la interfaz o clase. El cliente sólo necesita saber la fábrica de usar para obtener una instancia de una de las implementaciones de la interfaz. Los clientes están desacoplados de la creación de los objetos. A menudo, el patrón de la fábrica se implementa como un singleton o una clase estática ya que se requiere sólo una instancia de la fábrica. Este centraliza la creación de objetos.

Vamos a mostrar un patrón creacional, el patrón fábrica, para la creación de instancias para sus clases. Fábrica, como el nombre sugiere, es un lugar para crear algunos productos diferentes que son de alguna manera similar en características aún dividida en categorías. En Java también, patrón de la fábrica se utiliza para crear instancias de las diferentes clases de mismo tipo.


###Background information

Este patrón se presenta bajo acoplamiento entre clases, que es el principio más importante se debe considerar y aplicar en el diseño de la arquitectonico de una aplicación. Acoplamiento débil puede estar presente en la arquitectura de aplicaciones mediante la programación de clases abstractas en lugar de implementaciones concretas. Esto no sólo hace a nuestra arquitectura más flexible, también menos frágil.

Con el Framework CDI de Java EE podemos aprovecharlo para crear objetos sin saber los detalles de su creación. El desacoplamiento se produce como resultado de la forma en que Java EE implementa inversión de control. El beneficio más importante que transmite es la desvinculación del nivel de las clases más altas, desde las clases de nivel inferior. Este desacoplamiento permite la implementación de la clase concreta para cambiar sin afectar el cliente: la reducción de acoplamiento y aumentar la flexibilidad.  CDI en sí es una implementación del patrón de fábrica. El contenedor crea el objeto de calificación durante la aplicación puesta en marcha y lo inyecta en cualquier punto de la inyección que coincida con el criterio de la inyección. El cliente no necesita saber nada acerca de la aplicación concreta del objeto, ni siquiera el nombre de la clase de concreto se conoce al cliente.

```java
public class CoffeeMachine implements DrinksMachine {
    // Implementation code
}
```

Y se ocuparia:

```java
@Inject
DrinksMachine drinksMachine;
```

Aquí, el contenedor crea una instancia de la clase concreta CoffeeMachine, se selecciona en base a su interfaz *DrinksMachine*  y se inyecta donde el contenedor se encuentra un punto de inyección. Esta es la forma más sencilla de utilizar la implementación CDI del patrón de fábrica. Sin embargo, no es el más flexible.

**¿Qué pasa si tenemos más de una aplicación concreta de la interfaz DrinksMachine?**

```java
public class CoffeeMachine implements DrinksMachine {
    // Implementation code
}
```

```java
public class SoftDrinksMachine implements DrinksMachine {
    // Implementation code
}
```

```java
@Inject
DrinksMachine drinksMachine;
```

¿Qué implementacion debe ser inyectada? *SoftDrinksMachine* o *CoffeeMachine*?

El contenedor no sabe por lo que el despliegue se producirá  un error “ambiguous dependencies”

Entonces, ¿Cómo distinguir el contenedor entre las implementaciones concretas? Java EE nos da una nueva herramienta:
***Qualifiers***: Calificadores son anotaciones personalizadas que marcan la clase concreta y el punto donde desea que el recipiente para inyectar el objeto.

Las dos clases concretas del mismo tipo CoffeeMachine y SoftDrinksMachine podríamos distinguirlos por el uso de dos anotaciones de Cualificacion:

```java
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface SoftDrink

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Coffee
```

Creamos un nombre calificador SoftDrink. Esto se le anotara a la clase concreta SoftDrinksMachine y @Coffe se anotará a la clase CoffeeMachine.

La anotación @Target restringe donde podemos utilizar estos calificativos para marcar puntos de inyección, en este caso a nivel de método y de propiedad de la clase. La anotación @Retention con política de retención *RUNTIME* asegura que la anotación está disponible para la JVM en tiempo de ejecucion.

Los valores posibles para Target son: TIPO, MÉTODO, CAMPO, DE PARÁMETROS.

Las dos implementaciones concretas de la interfaz DrinksMachine se anotan de manera apropiada. La clase *CoffeeMachine* se anota con *@Coffee* mientras que la clase *SoftDrinksMachine* se anota *@SoftDrink*.

```java
@Coffee
public class CoffeeMachine implements DrinksMachine {
    // Implementation code
}

@SoftDrink
public class SoftDrinksMachine implements DrinksMachine {
    // Implementation code
}
```

Ya anotamos los puntos de inyección. Utilice el calificador @SoftDrink  para indicar dónde desea que el recipiente para inyectar la clase **SoftDrinksMachine** y el calificador @Coffee donde desea que el contenedor inyecte el la clase CoffeeDrinkMachine. Ahora que hemos dejado claro al contenedor donde estan las implementaciones concretas deben ser inyectadas, sin ambiguedades

```java
@Inject @SoftDrink
DrinksMachine softDrinksMachine;

@Inject @Coffee
DrinksMachine coffeeDrinksMachine;
```


Ventajas del patrón de la fábrica


La creación de un objeto impide su reutilización sin duplicación significativa de código. La creación de un objeto requiere el acceso a la información o recursos que no debe ser contenido dentro de la clase de composición. La gestión de vida de los objetos generados debe ser centralizada para garantizar un comportamiento coherente dentro de la aplicación. notas finales

Patrón de fábrica es el más adecuado donde hay algunas medidas de creación de objetos complejos están involucrados. Para asegurarse de que estos pasos son centralizados y no expuesto a las clases de composición, se debe utilizar el patrón de fábrica. Podemos ver muchos ejemplos de patrón de fábrica en el propio JDK, por ejemplo:

* java.sql.DriverManager#getConnection()
* java.net.URL#openConnection()
* java.lang.Class#newInstance()
* java.lang.Class#forName()
