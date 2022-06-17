package com.company;

//Операції над комплексними числами.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Real1: ");
        double real1 = scanner.nextDouble();

        System.out.println("Image1:" );
        double image1 = scanner.nextDouble();

        System.out.println("Real2: ");
        double real2 = scanner.nextDouble();

        System.out.println("Image2:" );
        double image2 = scanner.nextDouble();

        Complex complex = new Complex();
        Complex complex1 = new Complex(real1, image1);
        Complex complex2 = new Complex(real2, image2);

        complex1.print();
        System.out.print(" + ");
        complex2.print();
        System.out.print(" = " + complex.add(complex1, complex2));

                System.out.println();

        complex1.print();
        System.out.print(" - ");
        complex2.print();
        System.out.print(" = " + complex.sub(complex1, complex2));

                System.out.println();

        complex1.print();
        System.out.print(" * ");
        complex2.print();
        System.out.print(" = " + complex.mul(complex1, complex2));

                System.out.println();

        complex1.print();
        System.out.print(" / ");
        complex2.print();
        System.out.print(" = " + complex.div(complex1, complex2));


    }
}
