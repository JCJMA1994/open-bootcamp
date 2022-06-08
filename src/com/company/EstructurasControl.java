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
            System.out.println("while numero :" + numberWhile);
        }

        //do...while
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numberWhile++;
            System.out.println("do...while numero: " + numberWhile);
        }while (numberWhile < 3);

        //for
        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y
        //su condición será que la variable sea igual o menor que 3, se irá incrementando en 1
        //su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for (int numberFor = 0; numberFor <= 3; numberFor++){
            System.out.println("For numero: " + numberFor);
        }

        //switch
        //Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        //Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        //También habrá que poner un default para cuando el valor de la variable no sea una estación.

        int estacion = 8;

        switch (estacion){
            case 1:
            case 2:
            case 3:
                System.out.println("Estacion -> Otono");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Estacion -> Invierno");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Estacion -> Primavera");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Estacion -> Verano");
                break;
            default:
                System.out.println("No hay estacion");
        }

    }
}
