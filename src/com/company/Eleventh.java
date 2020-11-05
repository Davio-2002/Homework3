package com.company;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
