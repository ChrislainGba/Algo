package com.xl1.algo.nombrepremier;

import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre positif : ");
        int nombre = scanner.nextInt();
        scanner.close();

        boolean estPremier = estNombrePremier(nombre);

        if (estPremier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }

    public static boolean estNombrePremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
    

}

