package com.company;

public class Ch_03_02_PracticeQuestion {
    public static void main(String[] args) {
        int n =5;
        int m=5;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}
