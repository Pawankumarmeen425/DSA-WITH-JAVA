package com.company;

public class Ch_03_HP_05 {
    public static void main(String[] args) {
        /*
        * 2.	Print a hollow Rhombus.
         *****
         *      *
         *     *
         *     *
         *****
         */
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=n;k++){
                if (i==1||i==n){
                    System.out.print("*");
                }
                else {
                    if (k==1||k==n){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
