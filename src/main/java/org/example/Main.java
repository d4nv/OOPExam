package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Enter Age ");
        Scanner scan1 = new Scanner(System.in);

        String input = scan1.nextLine();

       int Age = Integer.parseInt(input);

        if( Age > 17  ){System.out.print("Age:" + Age);

        }
        else {
            System.out.println("Not a Valid Age");
        }

        }


    Scanner scan2 = new Scanner(System.in);

    String input = scan2.nextLine();











    }

