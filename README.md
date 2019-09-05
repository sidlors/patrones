## Patrones GOF
### Clasificación de patrones

Los patrones de diseño difieren en su complejidad, nivel de detalle y escala de aplicabilidad a todo el sistema que se está diseñando. 

### ¿Qué es un patrón de diseño?
Los patrones de diseño son soluciones típicas a problemas comunes en el diseño de software. Son como planos prefabricados que puede personalizar para resolver un problema recurrente de diseño en su código.

No puede simplemente encontrar un patrón y copiarlo en su programa, de la misma manera que puede hacerlo con las funciones o bibliotecas disponibles en el mercado.
El patrón no es un código específico, sino un concepto general para resolver un problema en particular. Puede seguir los detalles del patrón e implementar una solución que se adapte a las realidades de su propio programa.

Los patrones a menudo se confunden con algoritmos, porque ambos conceptos describen soluciones típicas a algunos problemas conocidos.
Si bien un algoritmo siempre define un conjunto claro de acciones que pueden lograr algún objetivo, un patrón es una descripción más de alto nivel de una solución. El código del mismo patrón aplicado a dos programas diferentes puede ser diferente.

Una analogía con un algoritmo es una receta de cocina: ambos tienen pasos claros para lograr un objetivo. Por otra parte,
un patrón es más como un plano: puedes ver cuál es el resultado y sus características, pero el orden exacto de implementación depende de ti.

### ¿En qué consiste el patrón?

La mayoría de los patrones se describen de manera muy formal para que las personas puedan reproducirlos en muchos contextos. Estas son las secciones que generalmente están presentes en una descripción de patrón:

  1.- La intención del patrón describe brevemente tanto el problema como la solución.

  2.- La motivación explica aún más el problema y la solución que el patrón hace posible.

  3.- La estructura de clases muestra cada parte del patrón y cómo están relacionadas.

  4.- El ejemplo de código en uno de los lenguajes de programación populares hace que sea más fácil comprender la idea detrás del patrón.

Algunos catálogos de patrones enumeran otros detalles útiles, como la aplicabilidad del patrón, los pasos de implementación y las relaciones con otros patrones.

Los 19 Patrones de Diseño de GOF podemos clasificar en tres grandes grupos:

**Patrones de creación.** Estos patrones se utilizan cuando debemos crear objetos pero debemos tomar decisiones dinámicamente en el proceso de creación. Para ésto lo que hacemos es abstraer el proceso de creación de los objetos para realizar la decisión de qué objetos crear o cómo crearlos para el momento en que se tenga que hacer. 

### Patrones de creación son: 
  
  1. [Abstract Factory](05_AbstractFactory/Readme.md#abstractfactory)
  1. [Builder](04_Builder#builder)
  1. Factory Method
  1. Object Pool
  1. Prototype
  1. [Singleton](02_Singleton/Readme.md#singleton)
  
**Patrones estructurales.** Estos patrones explican cómo ensamblar objetos y clases en estructuras más grandes mientras mantienen estas estructuras flexibles (que estas relaciones no se vean afectadas por cambios en los requisitos del programa.) y eficientes.


### Los patrones estructurales son: 
  
  1. Adapter
  1. Bridge
  1. Decorator
  1. Facade
  1. Flyweight
  1. Proxy.

**Patrones de comportamiento.** Fundamentalmente especifican el comportamiento entre objetos de nuestro programa, Estos patrones se refieren a algoritmos y a la asignación de responsabilidades entre objetos.


### Los patrones de Comportamiento son: 
  
  1. Chain of Responsability
  1. Command
  1. Interpreter
  1. Iterator
  1. Mediator
  1. Memento (o Snapshot)
  1. Observer
  1. State
  1. Strategy
  1. Template Method 
  1. Visitor.


### Resumen de los patrones

![](http://www.gofpatterns.com/images/gofPatterns.jpg)


