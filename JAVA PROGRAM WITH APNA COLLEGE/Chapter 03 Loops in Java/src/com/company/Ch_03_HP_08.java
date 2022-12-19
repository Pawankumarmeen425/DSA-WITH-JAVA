package com.company;

public class Ch_03_HP_08 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=n-i+1;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
