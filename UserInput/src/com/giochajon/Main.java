package com.giochajon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //to handle the enter before after the number

            System.out.println("Enter your name:");

            String name = scanner.nextLine();

            int age = 2018 - yearOfBirth;

            if (age >= 0 && age < 100) {

                System.out.println("your name is " + name + ", and you are " + age + " years old");

            } else {
                System.out.println("Invalid year of birth");
            }
        }
        else
        {
            System.out.println("Unable to parse year of birth");
        }


        scanner.close();
    }
}
