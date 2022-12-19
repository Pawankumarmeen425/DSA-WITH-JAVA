package com.company;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
//        9.	Write a function that calculates the Greatest Common Divisor of 2 numbers.
        System.out.println("Enter the two number !!");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Number is :: "+num1+" and "+num2);
int gcd =1;
int val1=num1;
int val2=num2;

    for (int i = 2; i <= num1 || i <=num2; i++) {
        for(int j=i;num1%j==0||num2%j==0;) {
            if (num1 % j == 0 && num2 % j == 0) {
                gcd = gcd * i;
            }
            if (num1 % j == 0) {
                num1 = num1 / j;

            }
            if (num2 % j == 0) {
                num2 = num2 / j;

            }
        }
}
        System.out.println("Greatest Common Divisor of "+val1+" and "+val2+" is "+gcd);
    }
}
