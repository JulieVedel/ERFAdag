package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til lommeregneren");
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Indtast et tal.");
            double x = scanner.nextDouble();

            System.out.println("Skriv endnu tal.");
            double y = scanner.nextDouble();

            System.out.println("Hvordan vil du regne med det nye tal? Skriv +, -, / eller *");
            String symbol = scanner.next();

            if (symbol.equals("+")) {
                System.out.println("Resultatet er:" + (x + y));
                System.out.println("Er du færdig med lommeregneren? (Skriv ja/nej)");
                String svar = scanner.next();
                if (svar.equalsIgnoreCase("ja")) {
                    exit = true;}
            } else if (symbol.equals("-")) {
                System.out.println("Resultatet er:" + (x - y));
                System.out.println("Er du færdig med lommeregneren? (Skriv ja/nej)");
                String svar = scanner.next();
                if (svar.equalsIgnoreCase("ja")) {
                    exit = true;}
            } else if (symbol.equals("/")) {
                System.out.println("Resultatet er:" + (x / y));
                System.out.println("Er du færdig med lommeregneren? (Skriv ja/nej)");
                String svar = scanner.next();
                if (svar.equalsIgnoreCase("ja")) {
                    exit = true;}
            } else if (symbol.equals("*")) {
                System.out.println("Resultatet er:" + (x * y));
                System.out.println("Er du færdig med lommeregneren? (Skriv ja/nej)");
                String svar = scanner.next();
                if (svar.equalsIgnoreCase("ja")) {
                    exit = true;}
            } else {
                System.out.println("Fejl");
                System.out.println("Vil du forsøge igen?");
                String svar = scanner.next();
                if (svar.equalsIgnoreCase("nej")) {
                    exit = true;}
            }
        }
    }
}
