package com.company;

public class Seventh {
    public static void main(String[] args) {
        double average;
        double sum = 0, count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        average = sum / count;
        System.out.println("Average is: " + average);
    }
}
