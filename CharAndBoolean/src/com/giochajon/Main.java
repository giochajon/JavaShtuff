package com.giochajon;

public class Main {

    public static void main(String[] args) {
        // the char length is 16 (2bytes)
        // the uicode character reference is in: https://unicode-table.com/en/#latin-1-supplement
	char myChar = '\u00A9';
    System.out.println("My Character is: "+myChar);

    char regChar = '\u00AE';
    System.out.println("the unicode for the registered trade mark  is: "+regChar);

    boolean myBool = false;
    boolean isMale = true;


    }
}
