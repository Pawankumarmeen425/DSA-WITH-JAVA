package com.company;

public class Ch_05_02_ReverseString {
    public static void main(String[] args) {
        StringBuilder sc  = new StringBuilder("Pawan Kumar");
//        for (int i=sc.length()-1;i>=0;i--){
//
//            System.out.print(sc.charAt(i));
//        }

        //     2nd Good Approach
        for(int i=0;i<=(sc.length()/2);i++){
        char frontind  = sc.charAt(i);
        char backind  = sc.charAt(sc.length()-i-1);
        sc.setCharAt(i,backind);
        sc.setCharAt(sc.length()-i-1 , frontind);


        }
        System.out.println("Reverse of the String is :: "+sc);
    }


}
