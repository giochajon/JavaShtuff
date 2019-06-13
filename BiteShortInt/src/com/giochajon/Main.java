package com.giochajon;

public class Main {


    public static void main(String[] args) {
/*

        // int has a width of 32
	 int myMaxInt = 2_147_483_647;
	 int myMinInt = -2_147_483_648;

        // int has a width of 8
	 byte myByte = 127;

        // int has a width of 16
	 short myShort = 32_767;

	 long myLong = 9_223_372_036_854_775_807L;

*/

    byte bg = 10;
    short sg =  20_000;
    int  ig = 60_000_000;
    long lg = 50000 * (bg+sg+ig);

        System.out.println(lg);


    }
}
