package SegundoPractico;

import java.util.Scanner;

public class Binario {
    public void cuarto (){
        //Ejercicio 4
        //Realizar un programa que reciba un numero entero “N”
        // mayor a 0 y que muestre dicho número convertido a binario.
        // Sin utilizar métodos de la clase Integer o similares.
        //Entrada
        //•	Valor de N. Ej.: 25
        //Salida
        //•	Valor de N en binario. Ej.: 11001
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingrese la cantidad para convertir a Binario");
          int numeroDecimal = lec.nextInt();
          int Binario = 0;
          int base =10;
          int res = 0;

          while (numeroDecimal>0){
              int BinarioNumero = numeroDecimal%2 ;//resto
              Binario= (BinarioNumero * (int) Math.pow(base,res))+Binario;
              res++;
              numeroDecimal = numeroDecimal /2;
          }
        System.out.println("Binario = " + Binario);














    }
}
