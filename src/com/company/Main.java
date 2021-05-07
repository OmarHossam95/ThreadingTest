package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrintNumbers pn1 = new PrintNumbers(1, 100);
        PrintNumbers pn2 = new PrintNumbers(30, 50);

        pn1.start();
        pn2.start();
    }
}
