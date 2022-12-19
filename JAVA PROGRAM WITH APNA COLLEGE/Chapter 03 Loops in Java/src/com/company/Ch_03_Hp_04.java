package com.company;

public class Ch_03_Hp_04 {
    public static void main(String[] args) {
        int n = 5;
//        Loop for half Pattern
        for(int i=1;i<=n;i++){
//            Loop for first half star
            for (int j=1;j<=i;j++){
                if (i<=2){
                    System.out.print("*");
                }
           else{
                    if(j==1||j==i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
//            Loop for Space Printing
            for (int k=1;k<2*(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if (i<=2){
                    System.out.print("*");
                }
                else{
                    if(j==1||j==i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        //        Loop for Other  half Pattern
        for(int i=n;i>=1;i--){
//            Loop for first half star
            for (int j=1;j<=i;j++){
                if (i<=2){
                    System.out.print("*");
                }
                else{
                    if(j==1||j==i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
//            Loop for Space Printing
            for (int k=1;k<2*(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if (i<=2){
                    System.out.print("*");
                }
                else{
                    if(j==1||j==i){
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

