package com.company;

public class Ch_03_PracticeQuestion03 {
    public static void main(String[] args) {
        int n =5;
        int m=5;
        int val=1;
        for (int i=1;i<=5;i++){
            val =i;
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){

                System.out.print(val--+" ");
            }
            int val1=1;
            for (int l=1;l<i;l++){

                System.out.print(++val1+" ");
            }
            System.out.print("\n");
        }

    }
}
