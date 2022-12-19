package com.company;

public class Ch_03_05_Pattern {
    public static void main(String[] args) {
        /*
        *       *
        *     * *
        *    * * *
        *  * * * *
        * */
        int n = 5;
        int m =5;

//        Outer Loop
        for (int i=1;i<=n;i++)

        {
//            Inner loop -<< Space Print
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
//                Outer Loop --<< Star Print
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
