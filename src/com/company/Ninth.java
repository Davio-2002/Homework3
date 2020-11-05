package com.company;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + Math.pow(i, 3));
        }
    }
}
