package com.company;

public class Encapsulacion {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(28);
        persona.setNombre("Jose Carlos Joao");
        persona.setTelefono(937829182);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Telefono: "+ telefono);

    }

}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}
