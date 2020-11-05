package com.company;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int number;
        double sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            number = src.nextInt();
            sum += number;
            count++;
        }

        double average = sum / count;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
