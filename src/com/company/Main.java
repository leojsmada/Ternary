package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What day is it?");
        String day = scanner.nextLine();
        String howToSpendTime;

         //-----------CONDITION-----------------//
//        if (day.toLowerCase().equals("Saturday")) {
//            howToSpendTime = "Relax";
//        } else {
//
//            howToSpendTime = "Work";
//        }
                       //----------CONDITION----------------//
        howToSpendTime = day.toLowerCase().equals("Saturday") ? "Relax" : "Work";//<---TERNARY STATEMENT

        System.out.printf("%s on %s %n",howToSpendTime, day);
        scanner.close();
    }

}

