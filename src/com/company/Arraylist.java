package com.company;

import java.util.Scanner;

public class Arraylist {

    public static void main(String args[]) {

        String str[] = new String[5];

        Scanner input = new Scanner(System.in);

            for (int i = 0; i < str.length; i++) {

                System.out.println("Enter the words you would like to save");
                str[i] = input.nextLine();

                if(str[i].equalsIgnoreCase("history")){
                    for (int j = 0; j <str.length ; j++) {
                        System.out.println(str[j]);
                    }

                    break;
                }
            }
    }
}


