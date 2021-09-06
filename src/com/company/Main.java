package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til plus-lommeregneren");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast et tal: ");
        double x = scanner.nextDouble();

        System.out.println("Hvilket tal skal jeg lægge til?");
        double y = scanner.nextDouble();

        double sum = x + y;
        System.out.println("Summen af disse to tal er: " + sum);

//        System.out.println("Lad os nu trække et tal fra dette. Angiv venlist et tal.");
//        double z = scanner.nextDouble();
//
//        double subsum = sum - z;
//        System.out.println("Den nye sum er nu: " + subsum);

        System.out.println("Lad os prøve en anden lommeregnerfunktion. Skriv et nyt tal.");
        double tal = scanner.nextDouble();

        System.out.println("Hvordan vil du regne med det nye tal? Skriv +, -, / eller *");
        String symbol = scanner.next();

        if (symbol.equals("+"))
        {
            System.out.println("Resultatet er:" + (sum + tal));
        }
        else if (symbol.equals("-"))
        {
            System.out.println("Resultatet er:" + (sum - tal));
        }
        else if (symbol.equals("/"))
        {
            System.out.println("Resultatet er:" + (sum / tal));
        }
        else if (symbol.equals("*"))
        {
            System.out.println("Resultatet er:" + (sum * tal));
        }
        else
        {
            System.out.println("Fejl");
        }

    }
}
