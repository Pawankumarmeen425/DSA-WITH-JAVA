package com.company;

public class Ch_03_08_Pattern {
    public static void main(String[] args) {
        /*
       1
       2 3
       4 5 6
       7 8 9 10
       11 12 13 14 15
       */

        int n = 5;
        int m =5;
        int k=1;
        for (int i=1;i<=n;i++)

        {
            for (int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k+1;
            }
            System.out.print("\n");
        }
    }
}
