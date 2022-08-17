package com.balvarez.app.jardin;

import com.balvarez.app.hogar.Gato;
import com.balvarez.app.hogar.Persona;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Marcela");
        persona.setApellido("Mi Amorcito");

        System.out.println(persona.getNombre());

        Gato gato = new Gato();

        gato.nombre = "Nami";

        System.out.println(gato.nombre);

        Perro perro = new Perro();
        perro.nombre = "Fiona";

        String jugando = perro.jugar(persona);

        System.out.println("jugando = " + jugando);

    }
}
