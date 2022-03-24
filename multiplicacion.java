package SegundoPractico;

import java.util.Scanner;

public class multiplicacion {
//Ejercicio 2
//Realizar un programa que realice la multiplicación de dos números,
// sin utilizar operadores de multiplicación ni de división.
//Entrada:
//•	Primer número. Ej.: 12
//•	Segundo número. Ej.: 2
//Salida:
//•	Resultado de la multiplicación. Ej.: Resultado = 24 == 12 + 12 = 24

    public void segundo (){
        Scanner sc = new Scanner( System.in);
        System.out.println("Multiplicacion de dos números");
        System.out.println(" ");
        System.out.println("Ingrese el primero número --> Multiplicando");
        int PrimerNumero = sc.nextInt();
        System.out.println("Ingrese el Segundo número --> Multiplicador");
        int SegundoNumero = sc.nextInt();


        if (SegundoNumero ==0 ) {
            System.out.println(0);
        }if (SegundoNumero == 1){
            System.out.println(PrimerNumero);
        }
        if(SegundoNumero >=2){
            int resultado =0;
           for (int i = 1; i < SegundoNumero; i++) {
                resultado = resultado + PrimerNumero;
           }
            System.out.println("resultado = " + resultado);
        }
    }
}
