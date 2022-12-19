package com.company;

public class Ch_03_01_Pattern {
    public static void main(String[] args) {
//        Print pattern
/*      * * * * * *
*       * * * * * *
*       * * * * * *
*       * * * * * *            */

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<6;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
