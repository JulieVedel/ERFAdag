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

        double sum = x - y;
        System.out.println("Summen af disse to tal er: " + sum);

    }
}
