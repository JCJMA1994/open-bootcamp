package com.company;

public class Main {

    public static void main(String[] args) {
        sumarABC(1, 2, 3);
       Coche miCoche = new Coche();
       miCoche.incrementoP(1);

    }

    public static void sumarABC(int numberA, int numberB, int numberC) {
        int suma = numberA + numberB + numberC;
        System.out.println("la suma es: " + suma);
    }

}
class Coche {
    int nPuertas;

    public  void incrementoP(int nPuertas){
        nPuertas++;
        System.out.println("Numero de Puertas: " + nPuertas);
    }
}