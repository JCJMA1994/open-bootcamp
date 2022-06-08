package com.company;

public class EstructurasControl {
    public static void main(String[] args) {
        //if
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIF = -1;
        if (numeroIF > 0){
            System.out.println("El numero es positivo");
        }else if (numeroIF == 0){
            System.out.println("El numero es cero");
        }else {
            System.out.println("El numero es negativo");
        }

        //while
        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        //- Incrementar el valor de la variable en uno cada vez que se ejecute.
        //- Mostrarlo por pantalla cada vez que se ejecute.
        int numberWhile = 0;

        while (numberWhile < 3){
            numberWhile++;
            System.out.println("Numero :" + numberWhile);
        }

        //do...while
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numberWhile++;
            System.out.println("Numero: " + numberWhile);
        }while (numberWhile < 3);

    }
}
