package com.company;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        String str[] = new String[11];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) { //loop array to input the president arrays

            System.out.println("Enter the names of the last 10 presidents");
            str[i] = input.nextLine(); //stores the names

            if (str[i].equalsIgnoreCase("history")) {
                for (int j = 10; j > 0; j--) { //inputs the 10 names backwards
                    System.out.println(str[j]);
                }
            }
        }
    }
}



