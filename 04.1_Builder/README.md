## Forma alternativa de Builder en Java

La clave de esta implementacion es que podemos hacer un wrapper llamado ___PersonaBuilder___
del objeto objetivo, es decir ___Persona___ 


```java

...

public class PersonaBuilder  {

    private Persona persona;

    //Metodos para el patron Builder
    public Persona build(){
        return this.persona;
    }

    private void setPersona(Persona persona){
        this.persona=persona;
    }

    public PersonaBuilder(){
        this.persona=new Persona();
    }
    ...
```

mediante el atributo persona, con dicha variable mantenemos los seteos encadenados hasta que finalmente se invoca build.



```java

personaConBuilder=new PersonaBuilder()
                                .setNombre("juan")
                                .setEdad(11)
                                .setApellido("perez jolote")
                                .setGenero('M')
                                .setNacionalidad("china")
                                .build();  
```


En caso de que build sea invocado se regresa la instancia persona sin atributos setteados como es de esperarse.

```java

personaConBuilderSinSetteo=new PersonaBuilder()
                                .build();  
```



 ___PersonaBuilder___ solo tiene  los metodos _set_  de persona pero en vez de que retorne void como regularmente los set lo hacen, lo que vamos a regresar es un  ___PersonaBuilder___ para _"encadenar"_ las llamadas a los setters que realmente necesitemos

 ```java

 //Metodos Wrappers de Objeto objetivo: Persona
	public PersonaBuilder setNombre(String nombre) {
        this.persona.setNombre(nombre);
        this.setPersona(persona);
        return this;
    }

    public PersonaBuilder setApellido(String apellido) {
        this.persona.setApellido(apellido);
        this.setPersona(persona);
        return this;
    }

    public PersonaBuilder setEdad(int edad) {
        this.persona.setEdad(edad)      ;
        this.setPersona(persona);
        return this;
    }

    public PersonaBuilder setGenero(Character genero) {
        this.persona.setGenero( genero);
        this.setPersona(persona);
        return this;
    }

    public PersonaBuilder setNacionalidad(String nacionalidad) {
        this.persona.setNacionalidad(nacionalidad);
        this.setPersona(persona);
        return this;
    }
 ```

 Se recomienda seguir el ejemplo del package de pruebas unitarias para su mejor entendimiento

### Instrucciones

corre este modulo

$mvn clean compile test
