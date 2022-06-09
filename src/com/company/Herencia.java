package com.company;

public class Herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(28);
        cliente.setNombre("Jose Carlos Joao");
        cliente.setTelefono(937829182);
        cliente.setCredito(900.9);

        int edadC= cliente.getEdad();
        String nombreC = cliente.getNombre();
        int telefonoC = cliente.getTelefono();
        double creditoC = cliente.getCredito();

        System.out.println("Datos del Cliente" + "\n" +"Nombre: " + nombreC + "\n" +
                "Edad: " + edadC + "\n" + "Telefono: " + telefonoC + "\n" + "Credito: " + creditoC);

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(28);
        trabajador.setNombre("Jose Carlos Joao");
        trabajador.setTelefono(937829182);
        trabajador.setSalario(100.25);

        int edadT = trabajador.getEdad();
        String nombreT = trabajador.getNombre();
        int telefonoT = trabajador.getTelefono();
        double salario = trabajador.getSalario();

        System.out.println("Datos del Trabajador" + "\n" +"Nombre: " + nombreT + "\n" + "Edad: " + edadT + "\n" + "Telefono: " + telefonoT + "\n" + "Salario: " + salario);


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

class Cliente extends Persona {

    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {

    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}