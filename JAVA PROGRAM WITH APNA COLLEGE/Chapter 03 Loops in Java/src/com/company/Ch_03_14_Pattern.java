package com.company;

public class Ch_03_14_Pattern {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
//            ---<< Loop for Spaces
            for (int j=1;i<=n-i;i++){
                System.out.print(" ");
            }
            int val =2*i-1;
            for (int k=1;k<=val;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
