package SegundoPractico;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Edad {

    //Realizar un programa que permita ingresar primero el día,
    // luego el mes y luego el año de nacimiento de una persona y
    // que calcule la edad en años a la fecha, es decir que el programa
    // debe mostrar la edad de la persona luego del ingreso de los datos.
    //Entrada:
    //•	Día de nacimiento
    //•	Mes de nacimiento
    //•	Año de nacimiento
    //Salida
    //•	Edad en Años
    public void primero (){
        //para poder ingresar los datos
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingresa el dia de tu nacimiento");
        int dia  = lec.nextInt();

        System.out.println("Ingresa el mes el que naciste ");
        System.out.println("ejemlo : 04 -> abril ");
        int mes  = lec.nextInt();

        System.out.println("Ingresa el año en que naciste ");
        System.out.println("ejemplo : 2001");
        int anio = lec.nextInt();

        Calendar calendario = Calendar.getInstance();
        int fechaActual = calendario.get(Calendar.YEAR);

        int edadActual = fechaActual - anio ;
        System.out.println("Edad que tienes es de " + edadActual+" años");



    }
}
