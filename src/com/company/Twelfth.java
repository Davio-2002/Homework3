package com.company;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();
        int temp;

        int firstNum = 0;
        int secondNum = 1;

        for (int i = 0; i < number; i++) {
            temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;

            System.out.print(temp + " ");
        }
    }
}
