#Builder

###Creando Objetos


Fábricas estáticas (metodos *'constructores'* estaticos ) comparten una limitación: **no escala bien a un gran número de parámetros opcionales**. 

Consideremos el caso de una clase que representa la etiqueta de Datos de Nutrición que aparece en los alimentos envasados. Estas etiquetas tienen un tamaño de unos pocos campos requerido de porción , porciones por envase y calorías por racion y más de veinte opcionales: grasa totales, grasas saturadas, grasas trans, colesterol, sodio, y así sucesivamente. 

La mayoría de los productos tienen valores distintos de cero sólo para unos pocos de estos campos opcionales. 

¿Qué clase de constructores o fábrica estática se debe escribir para esa clase? Tradicionalmente, los programadores han utilizado el patrón **constructor telescópico**, en el que declaramos un constructor con sólo los parámetros obligatorios, otro constuctor con un solo parámetros opcional, un tercero constructor con dos parámetros opcionales, y así seguiriamos con los constructores sucesivamente que al final terminariamos con un constructor con todos los parámetros opcionales.

Para abreviar vamos a ver el ejemplo con sólo cuatro campos opcionales se indican:



```java
// Telescoping constructor pattern - does not scale well!
public class NutritionFacts {
       private final int servingSize; // (mL) required
       private final int servings; // (per container) required
       private final int calories; // optional
       private final int fat; // (g) optional
       private final int sodium; // (mg) optional
       private final int carbohydrate; // (g) optional
       
       public NutritionFacts(int servingSize, int servings) {
           this(servingSize, servings, 0);
       }
       
       public NutritionFacts(int servingSize, int servings,int calories) {
          this(servingSize, servings, calories, 0);
       }
       
       public NutritionFacts(int servingSize, int servings,int calories, int fat) {
          this(servingSize, servings, calories, fat, 0);
       }
       
       public NutritionFacts(int servingSize, int servings,int calories, int fat, int sodium) {
          this(servingSize, servings, calories, fat, sodium, 0);
       }
       
       public NutritionFacts(int servingSize, int servings,int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
       }
}
```

Entoces cuando se desé crear una instancia, se utiliza el constructor con la más corta lista de parámetros que contiene todos los parámetros que desea establecer:

```java
NutritionFacts cocacola = nuevos NutritionFacts (240, 8, 100, 0, 35, 27);
```


Normalmente esta invocación al constructor requerirá muchos parámetros que no se quieren configurar, pero estás obligado a pasar un valor para ellos de todos modos. En este caso, pasamos por un valor de 0 para la grasa. Con "sólo" seis parámetros esto puede no parecer tan malo, pero se vuelve rápidamente de la mano como el número de parámetros aumenta.

En resumen, el patrón constructor telescópica funciona, pero es difícil de escribir código de cliente cuando hay muchos parámetros, y más difícil aún que lo lean. Secuencias largas de parámetros idénticamente escritas pueden causar errores sutiles. **Si el cliente invierte accidentalmente dos de estos parámetros, el compilador no se quejará, pero el programa se portan mal en tiempo de ejecución.**

Una segunda alternativa cuando se enfrentan con muchos parámetros del constructor es el patrón JavaBeans, en el que se llama a un constructor sin parámetros para crear el objeto y luego llamar a los métodos setter para ajustar cada parámetro requerido y cada parámetro opcional de interés:

```java
NutritionFacts cocaCola = new NutritionFacts();
cocaCola.setServingSize(240);
cocaCola.setServings(8);
cocaCola.setCalories(100);
cocaCola.setSodium(35);
cocaCola.setCarbohydrate(27);
```

Desafortunadamente, el patrón JavaBeans tiene serias desventajas de su propia naturaleza. Debido a que la construcción se divide en varias llamadas al objeto, un JavaBean puede estar inconsistente en parte de su estado a través de su construcción. 

La clase no tiene la opción de hacer cumplir la coherencia simplemente mediante la comprobación de la validez de la constructor parámetros. El intento de usar un objeto cuando está en un estado incoherente puede causar fallas que están muy lejos de un código que contiene el error, por lo tanto, difícil de depurar. Una desventaja relacionada es que el patrón se opone a JavaBeans la posibilidad de hacer una clase inmutable, y requiere esfuerzo añadido por parte del programador para garantizar el **thread safety**

