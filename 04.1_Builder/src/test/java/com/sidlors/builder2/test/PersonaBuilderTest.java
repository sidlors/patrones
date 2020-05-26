package com.sidlors.builder2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import com.sidlors.builder2.Persona;
import com.sidlors.builder2.PersonaBuilder;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaBuilderTest {

    private static Persona personaNormal;
    private static Persona personaConBuilder;

    @BeforeClass
    public static void init(){
        personaNormal=new Persona();
        personaConBuilder=new PersonaBuilder()
                                .setNombre("juan")
                                .setEdad(11)
                                .setApellido("perez jolote")
                                .setGenero('M')
                                .setNacionalidad("china")
                                .build();    
    }

    @Test
    public void nombreTest(){
        personaNormal.setNombre("juan");
        assertEquals(personaNormal.getNombre(), personaConBuilder.getNombre());
    }

    @Test
    public void apellidoTest(){
        personaNormal.setApellido("perez jolote");
        assertEquals(personaNormal.getApellido(), personaConBuilder.getApellido());
    }

    @Test
    public void nacionalidadTest(){
        personaNormal.setNacionalidad("china");
        assertEquals(personaNormal.getNacionalidad(), personaConBuilder.getNacionalidad());
    }

    @Test
    public void edadTest(){
        personaNormal.setEdad(11);
        assertEquals(personaNormal.getEdad(), personaConBuilder.getEdad());
    }

    @Test
    public void generoTest(){
        personaNormal.setGenero('M');
        assertEquals(personaNormal.getGenero(), personaConBuilder.getGenero());
    }

    @Test
    public void failTest(){
        Persona persona2=new Persona();
        persona2.setNombre("Maria");
        assertNotSame(persona2.getNombre(), personaConBuilder.getNombre());
    }

    @AfterClass
    public static void valoresTest(){
        assertEquals(personaNormal.toString(), personaConBuilder.toString());
    }
}