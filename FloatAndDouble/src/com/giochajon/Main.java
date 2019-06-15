package com.giochajon;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4bytes)
	int myInt= 5/3;
        //width of float = 32 (4bytes)
	float myFloat = 5f/3f;
        //width of Double = 64 (8bytes)
	double myDouble = 5d/3d;

        System.out.println("my intValue ="+ myInt);
        System.out.println("my floatValue ="+ myFloat);
        System.out.println("my intDouble ="+ myDouble);

    double pounds = 300d;
    double kilograms = 0.45359237d;

        System.out.println(pounds +" pounds is " + pounds * kilograms + "Kilograms");



    }
}
