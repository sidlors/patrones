¿Cuál es el método habitual para crear una instancia de una clase en java? La mayoría respondería a esta pregunta: por medio de palabra clave "new". Bueno, pues eso se considera pasado de moda. ahora vamos a ver cómo? 

Si el código de creación de objetos se extiende en toda la aplicación, y si es necesario cambiar el proceso de creación de objetos y luego tienes que ir en cada lugar para hacer los cambios necesarios considere el uso de patrón de fábrica.

Vamos a mostrar un patrón creacional, el patrón fábrica, para la creación de instancias para sus clases. Fábrica, como el nombre sugiere, es un lugar para crear algunos productos diferentes que son de alguna manera similar en características aún dividida en categorías. En Java también, patrón de la fábrica se utiliza para crear instancias de las diferentes clases de mismo tipo.


###Background information

Este patrón se presenta bajo acoplamiento entre clases, que es el principio más importante se debe considerar y aplicar en el diseño de la arquitectonico de una aplicación. Acoplamiento débil puede estar presente en la arquitectura de aplicaciones mediante la programación de clases abstractas en lugar de implementaciones concretas. Esto no sólo hace a nuestra arquitectura más flexible, también menos frágil.

As you can see, factory is able to return any type of car instance it is requested for. It will help us in making any kind of changes in car making process without even touching the composing classes i.e. classes using CarFactory.

Advantages of factory pattern

By now, you should be able to count the main advantages of using factory pattern. Lets note down:

The creation of an object precludes its reuse without significant duplication of code.
The creation of an object requires access to information or resources that should not be contained within the composing class.
The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.
Final notes

Final notes

Factory pattern is most suitable where there is some complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used. We can see many examples of factory pattern in JDK itself e.g.

* java.sql.DriverManager#getConnection()
* java.net.URL#openConnection()
* java.lang.Class#newInstance()
* java.lang.Class#forName()

:)
