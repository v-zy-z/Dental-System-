package edu.unl.cc.jbegginers.math.turfdom;

import java.util.Scanner;

public class Celular {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su numero de celular (10 digitos, comienza con 09)");
        String celular = sc.nextLine();

        if (esCelularValido(celular)){
            System.out.println("¡Numero de celular valido!");
        }else {
            System.out.println("¡Numero invalido!.Debe contener 10 dijitos, empezar con 09 y solo contener numeros");
        }
        sc.close();
    }
    //Validar numero de celular
    public static boolean esCelularValido(String celular){

        if (celular == null || celular.length() !=10 || celular.startsWith("09")){
            return false;
        }
        try {
            Long.parseLong(celular);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
