package com.generation;

public class Perro {
    String nombre;
    String raza;
    String tamanio;
    int edad;
    //contructor que inicialza mi objeto perro
    public Perro(){

    }

    public Perro(String nombre, String raza, String tamanio, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
    }
    //metodo
    public void caracteristicas(){
        System.out.println("nombre:" + this.nombre + "\nraza:" + this.raza + "\ntamaño" + this.tamanio + "\nedad:" + this.edad);
    }

    }

