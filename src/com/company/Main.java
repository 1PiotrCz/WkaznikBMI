package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = input.nextLine();
        System.out.println("Witaj " + name);

        System.out.println("Podaj ile masz lat");
        int age = input.nextInt();
        System.out.println("Twój wiek to " + age);

        System.out.println("Podaj Twój wzrost");
        double growth = input.nextDouble();
        System.out.println("Podaj Twoją wagę");
        double weight = input.nextDouble();

        growth = growth / 100;
        double bmi = weight / (Math.pow(growth, 2));
        System.out.println("Twój indeks BMI wynosi " + bmi);

        if (bmi < 18.5) {
            System.out.println("Jesteś zbyt szczupły/a");
        } else if (bmi > 25) {
            System.out.println("Jesteś zbyt gruby/a");
        } else {
            System.out.println("Masz dobry wskaźnik");
        }
    }

}