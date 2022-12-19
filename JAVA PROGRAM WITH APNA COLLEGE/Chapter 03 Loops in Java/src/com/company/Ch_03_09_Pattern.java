package com.company;

public class Ch_03_09_Pattern {
    public static void main(String[] args) {

        /*
        * 1
        * 0 1
        * 1 0 1
        * 0 1 0 1
        * 1 0 1 0 1         * */
        int n = 5;
        int m =5;
        for (int i=1;i<=n;i++)

        {
            for (int j=1;j<=i;j++){
//                ---<< If sum of i+j queal to even number then print 1. If sum of i+j equal to odd number then print 0
                if ((i+j)%2==0){
                System.out.print(1+" ");}
                else{
                    System.out.print(0+" ");
                }
            }

            System.out.print("\n");
        }

    }
}
