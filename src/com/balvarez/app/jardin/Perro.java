package com.balvarez.app.jardin;

import com.balvarez.app.hogar.Persona;

public class Perro {

    public String nombre;
    public String raza;

    String jugar (Persona persona){
       return persona.lanzarPelota();
    }

}
