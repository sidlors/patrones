# Singleton
![](http://snag.gy/9DRvf.jpg)

Toda aplicacion Java debe asegurar que la instancia Singleton pueda trabajar correctamente con la presencia de multihilos (***thread safe***)

una manera seria agregando syncronizacion al metodo getInstance(). pero eso es algo costoso, por tanto algunas alternativas a considerar seran las siguientes:

  1.- Procura hacer syncrono el metodo que trae la instancia si esto **NO** es critico para tu aplicación, solo ten en cuenta que esto puede decrementar la eficiencia de algua aplicacion con un factor de 100
  
  ```java
  public class Singleton{
     private static Singleton uniqueInstance;
     private Singleton(){}
     public static synchronized Singleton getInstance(){
        if(uniqueInstance==null){
        	uniqueInstance=new Singleton();
        }
        return uniqueInstance;
     }
     //Otros Metodos
  }
```
  
  
  2.- Si tu sabes que siempre tu aplicacion va a crear e instanciar al singleton o el overhead de crear y en gral lo que el singleton realiza no es mucho, crea tu instancia anciosamente:
  
```java
  public class Singleton{
     private static Singleton uniqueInstance=new Singleton();
     private Singleton(){}
     public static Singleton getInstance(){
        return uniqueInstance;
     }
  }
```
  3.- usar un doble chequeo para reducir la necesidad de sincronizar el metodo getInstance().
 
 ```java
 public class Singleton{
   private volatile static Singleton uniqueInstance;
   private Singleton(){}
   public static Singleton getInstance(){
     if(uniqueInstance==null){
		   synchronized (Singleton.class){
		     if(uniqueInstance==null){
		        uniqueInstance=new Singleton();
		     }
		   }
	   }
	 return uniqueInstance;
  }
}
```

