package SegundoPractico;

import java.util.Scanner;

public class Intercalado {
    //Ejercicio 5
    //Realizar un programa reciba un numero entero “N”
    // y muestre la siguiente serie: 0 1 0 1 0 1 0 1 0 1 0 1
    // según la cantidad de N, es decir:
    //i es impar empieza con cero
    //Si N = 1 generar   0
    //si es par empieza con no
    //Si N = 2 generar   0 1
    //Si N = 3 generar   0 1 0
    //Si N = 4 generar   0 1 0 1

    //Y así sucesivamente…
    public  void quinto (){
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingrese la cantidad para intercalar los numeros");
        int numero = lec.nextInt();
        int [] vect = new int[numero];
        int par = 1 ;
        int inpar  =0 ;
        int resultado =0;
        if (numero <= 0){
            System.out.println("ERROR");
        }
        if (numero == 1){
            System.out.print(0);
        }
        if ( numero % 2 ==0 ){
            for (int i = 0; i < vect.length; i++){
                if (i%2==0){
                    vect[i] = par;
                }else {
                    vect[i]= inpar ;
                }

              resultado = vect[i];

                System.out.print(resultado+" ");
                System.out.println(" ");

            }
        }else {
            for (int i = 0; i < vect.length; i++){
                if (i%2==0){
                    vect[i] = par;
                }else {
                    vect[i]= inpar ;
                }

                resultado = vect[i];

                System.out.print(resultado +" ");
                System.out.println(" ");

            }

        }



    }
}
