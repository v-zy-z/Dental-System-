package edu.unl.cc.jbegginers.math.turfdom;

import java.util.Scanner;

public class Cedula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu numero de cedula (10 digitos): ");
        String cedula = sc.nextLine();

        if (esCedulaValida(cedula)) {
            System.out.println("Cedula valida");
        } else {
            System.out.println("Cedula invalida. Debe tener 10 digitos y solo numeros.");
        }
        sc.close();
    }

    //Validar cedula
    public static boolean esCedulaValida(String cedula) {
        if (cedula == null || cedula.length() != 10) {
            return false;
        }
        try {
            Long.parseLong(cedula);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}