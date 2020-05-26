package com.sidlors.builder2;

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
}