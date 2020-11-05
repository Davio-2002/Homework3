package com.company;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
