¿Cuál es el método habitual para crear una instancia de una clase en java? La mayoría respondería a esta pregunta: por medio de palabra clave "new". Bueno, pues eso se considera pasado de moda. ahora vamos a ver cómo? 

Si el código de creación de objetos se extiende en toda la aplicación, y si es necesario cambiar el proceso de creación de objetos y luego tienes que ir en cada lugar para hacer los cambios necesarios considere el uso de patrón de fábrica.

Vamos a mostrar un patrón creacional, el patrón fábrica, para la creación de instancias para sus clases. Fábrica, como el nombre sugiere, es un lugar para crear algunos productos diferentes que son de alguna manera similar en características aún dividida en categorías. En Java también, patrón de la fábrica se utiliza para crear instancias de las diferentes clases de mismo tipo.


###Background information

Este patrón se presenta bajo acoplamiento entre clases, que es el principio más importante se debe considerar y aplicar en el diseño de la arquitectonico de una aplicación. Acoplamiento débil puede estar presente en la arquitectura de aplicaciones mediante la programación de clases abstractas en lugar de implementaciones concretas. Esto no sólo hace a nuestra arquitectura más flexible, también menos frágil.

Ventajas del patrón de la fábrica


La creación de un objeto impide su reutilización sin duplicación significativa de código. La creación de un objeto requiere el acceso a la información o recursos que no debe ser contenido dentro de la clase de composición. La gestión de vida de los objetos generados debe ser centralizada para garantizar un comportamiento coherente dentro de la aplicación. notas finales

Patrón de fábrica es el más adecuado donde hay algunas medidas de creación de objetos complejos están involucrados. Para asegurarse de que estos pasos son centralizados y no expuesto a las clases de composición, se debe utilizar el patrón de fábrica. Podemos ver muchos ejemplos de patrón de fábrica en el propio JDK, por ejemplo:

* java.sql.DriverManager#getConnection()
* java.net.URL#openConnection()
* java.lang.Class#newInstance()
* java.lang.Class#forName()
