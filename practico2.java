package SegundoPractico;

import java.util.Scanner;

public class practico2 {
    public static void main(String[] args) {

        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();

            if (numero ==0 ){
                break;
            } if (numero == 1){
                Edad  primero = new Edad();
                primero.primero();//termiando :)
            }
            if (numero == 2){ //terminado :)
                multiplicacion seg = new multiplicacion();
                seg.segundo();
            }
            if (numero == 3){
                division ter = new division(); // terminado :)
                ter.tercero();
            }
            if (numero == 4){
                Binario cuarto = new Binario ();//terminado :)
                cuarto.cuarto();

            }if (numero == 5){
                Intercalado intercaladito = new Intercalado();
                intercaladito.quinto(); // casi termino :(

            }if (numero>5 ){
                String mensaje  = new String("ha ingresado un número incorrecto");

                System.out.println(mensaje.toUpperCase());
            }if (numero< 0 ){
                String mensaje  = "ha ingresado un número incorrecto";
                System.out.println(mensaje.toUpperCase());
            }
        }
    }

    public static  void menu (){


        System.out.println("|       Practico 2     |");
        System.out.println("------------------------");
        System.out.println("Seleccione el ejercico ");
        System.out.println("1.- ¿Qué edad tienes ?");
        System.out.println("2.- Multiplicación de numeros sin utilizar * y /");
        System.out.println("3.- Divicion de numeros sin utilizar * y /");
        System.out.println("4.- convertir a binario");
        System.out.println("5.- Conversor de numeros a una serie de numeros designados");
        System.out.println("0.- Para poder salir del programa ");
    }
}
