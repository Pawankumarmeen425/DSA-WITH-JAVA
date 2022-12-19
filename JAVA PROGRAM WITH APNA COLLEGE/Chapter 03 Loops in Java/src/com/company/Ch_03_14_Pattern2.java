package com.company;

public class Ch_03_14_Pattern2 {
    public static void main(String[] args) {
        int n = 4;
//        Half Piramind
//        Outer loop for number of Rows
        for (int i = 1; i <= n; i++) {
//            Inner loop for Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//            Inner loop for Star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//Other Half Primind
        for (int i = n; i >= 1; i--) {
//            Inner loop for Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//            Inner loop for Star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
