package com.giochajon;

public class Main {

    public static void main(String[] args) {
	String myString = "this is a test";
        System.out.println("myString is "+myString);
        myString = myString + " and then some ";
        myString = myString + "\u00A9 2019";
        System.out.println("My resulting string is : "+myString);

    }
}
