# Observer


Observador (en inglés: Observer) Se trata de un patrón de comportamiento, es un patrón de diseño que define una dependencia del tipo uno-a-muchos entre objetos, de manera que cuando uno de los objetos cambia
su estado, notifica este cambio a todos los dependientes. es decir, está relacionado con algoritmos de funcionamiento y asignación de responsabilidades a clases y objetos. 
Los patrones de comportamiento describen no solamente estructuras de relación entre objetos o clases sino también esquemas de comunicación entre ellos y se pueden clasificar
en función de que trabajen con clases (Método Plantilla) u objetos (Cadena de Responsabilidad, Comando, Iterador, Recuerdo, Observador, Estado, Estrategia, Visitante).

Los principios de diseño detras de este patron son:

   1. 
   2. 
   3. 
   

### Diagrama UML

![](https://upload.wikimedia.org/wikipedia/commons/9/97/EstructuraPatronObservador.png)


![](https://upload.wikimedia.org/wikipedia/commons/4/41/SecuenciaObservador.png)

### Participantes

Tendremos sujetos concretos cuyos cambios pueden resultar interesantes a otros y observadores a los que al menos les interesa estar pendientes de un elemento y en un momento
dado, reaccionar ante sus notificaciones de cambio. Todos los sujetos tienen en común que un conjunto de objetos quieren estar pendientes de ellos. 
Cualquier elemento que quiera ser observado tiene que permitir indicar:

“Estoy interesado en tus cambios”.
“Ya no estoy interesado en tus cambios”.

El observable tiene que tener, además, un mecanismo de aviso a los interesados.


* Sujeto (Subject): El sujeto proporciona una interfaz para agregar (attach) y eliminar (detach) observadores. El Sujeto conoce a todos sus observadores.
* Observador (Observer): Define el método que usa el sujeto para notificar cambios en su estado (update/notify).
* Sujeto Concreto (ConcreteSubject): Mantiene el estado de interés para los observadores concretos y los notifica cuando cambia su estado. No tienen porque ser elementos
 de la misma jerarquía.
* Observador Concreto (ConcreteObserver): Mantiene una referencia al sujeto concreto e implementa la interfaz de actualización, es decir, guardan la referencia del objeto
 que observan, así en caso de ser notificados de algún cambio, pueden preguntar sobre este cambio.


## Nuestro Ejemplo




### Java Observer Build-It

Existe un API en java que nso permite definir a los objetos participantes de este patron de diseño.

![](http://snag.gy/lh4xZ.jpg)


Para ser un subject

![](http://snag.gy/RPnR2.jpg)

![](http://snag.gy/0k2zm.jpg)





