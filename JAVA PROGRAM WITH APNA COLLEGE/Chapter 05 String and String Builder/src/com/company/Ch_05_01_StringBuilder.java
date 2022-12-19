package com.company;

public class Ch_05_01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Pawan Kumar");
        System.out.println(sc);

//        Char at the desired Index
        System.out.println(sc.charAt(1));
//        Set Char at the desired index. And it will replace previous index
        sc.setCharAt(1, 'p');
        System.out.println(sc);

//        Insert : it will insert element at the desired index and replace forward string
        sc.insert(0, 'M');
        System.out.println(sc);

//        Delete : It will delete charater at the desired index
        sc.delete(0, 1);
//        Start index is included but end index is excluded
        System.out.println(sc);
//        Appends : It will add charater at the end of the string
        sc.append(" Meena");
        System.out.println(sc);
        sc.setCharAt(1, 'a');
        System.out.println(sc);
    }
}