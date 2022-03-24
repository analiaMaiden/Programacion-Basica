package SegundoPractico;

import java.util.Scanner;

public class division {
    //Ejercicio 3
    //Realizar un programa que realice la división de dos números
    // y que muestre el resto, sin utilizar operadores de
    // multiplicación ni de división ni de modulo.
    //Entrada

    //•	Dividendo. Ej.: 5
    //•	Divisor. Ej.: 2
    //Salida
    //•	Resultado de la división. Ej: 2
    //•	Residuo de la división: Ej: 1


    public void tercero (){
        Scanner sc = new Scanner( System.in);
        System.out.println("División de dos números");
        System.out.println(" ");
        System.out.println("Ingrese el primero número --> Dividendo");
        int Dividendo = sc.nextInt();
        System.out.println("Ingrese el Segundo número --> Divisor");
        int Divisor = sc.nextInt();

        if (Dividendo  == 0 ) {
            System.out.println("ERROR");
        }
        if (Divisor == 0 ) {
            System.out.println(0);
        }
        if (Divisor== 1){
            System.out.println(Dividendo);
        }
        int resul = dividir(Dividendo ,Divisor);
        System.out.println(resul);


        }

        public int dividir (int dividendo, int Divisor ){
        int resultado ;
        if (dividendo < Divisor){
            resultado = 0;
        }else {
            dividendo = dividendo-Divisor;
            resultado = 1+ dividir(dividendo,Divisor);
        }


        return resultado ;


        }


    }

