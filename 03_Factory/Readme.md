What is the most usual method of creating an instance of a class in java? Most people will answer this question: “using new keyword“. Well, it is considered old fashioned now.  Lets see how??

If object creation code is spread in whole application, and if you need to change the process of object creation then you need to go in each and every place to make necessary changes. After finishing this article, while writing your application, consider using factory pattern.
In my previous post, “Singleton design pattern in java“, we discussed various ways to create an instance of a class such that there can not exist another instance of same class in same JVM.
In this post, i will demonstrate another creational pattern, i.e. Factory pattern, for creating instances for your classes. Factory, as name suggest, is a place to create some different products which are somehow similar in features yet divided in categories.
In java also, factory pattern is used to create instances of different classes of same type.

###Background information

This pattern introduces loose coupling between classes which is the most important principle one should consider and apply while designing the application architecture. Loose coupling can be introduced in application architecture by programming against abstract entities rather than concrete implementations. This not only makes our architecture more flexible but also less fragile.

![](http://howtodoinjava.files.wordpress.com/2012/10/class_diagram_of_factory_pattern_in_java1.png)
Above class diagram depicts a common scenario using example of car factory which is able to build 3 types of cars i.e. small, sedan and luxury. Building a car requires many steps from allocating accessories to final makeup. These steps can be written in programming as methods and should be called while creating an instance of a specific car type.

If we are unfortunate then we will create instances of car types (e.g. SmallCar) in our application classes and thus we will expose the car building logic to outside world and this is certainly not good. It also prevents us in making changes to car making process because code in not centralized, and making changes in all composing classes seems not feasible.

###Implementation

So far we have seen the classes need to be designed for making a CarFactory. Lets hit the keyboard now and start composing our classes.

CarType.java will hold the types of car and will provide car types to all other classes

```java
package designPatterns.creational.factory;

public enum CarType {
    SMALL, SEDAN, LUXURY
}
```
Car.java is parent class of all car instances and it will also contain the common logic applicable in car making of all types.


```java
package designPatterns.creational.factory;

public abstract class Car {

	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}

	private void arrangeParts() {
		// Do one time processing here
	}

	// Do subclass level processing in this method
	protected abstract void construct();

	private CarType model = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
}
```

LuxuryCar.java is concrete implementation of car type LUXURY

```java
package designPatterns.creational.factory;

public class LuxuryCar extends Car {

	LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
		// add accessories
	}
}
```

SmallCar.java is concrete implementation of car type SMALL

```java
package designPatterns.creational.factory;

public class SmallCar extends Car {

	SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
		// add accessories
	}
}
```

SedanCar.java is concrete implementation of car type SEDAN

```java
package designPatterns.creational.factory;

public class SedanCar extends Car {

	SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
		// add accessories
	}
}
```
CarFactory.java is our main class implemented using factory pattern. It instantiates a car instance only after determining its type.


```java
package designPatterns.creational.factory;

public class CarFactory {
	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar();
			break;

		case SEDAN:
			car = new SedanCar();
			break;

		case LUXURY:
			car = new LuxuryCar();
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}
}
```

In TestFactoryPattern.java, we will test our factory code. Lets run this class.

```java
package designPatterns.creational.factory;

public class TestFactoryPattern {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}
```
Output:

Building small car
designPatterns.creational.factory.SmallCar@7c230be4
Building sedan car
designPatterns.creational.factory.SedanCar@60e1e567
Building luxury car
designPatterns.creational.factory.LuxuryCar@e9bfee2

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