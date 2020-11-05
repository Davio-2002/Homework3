package com.company;

import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    if (i % 2 == 0)
                        if (j == n - 1)
                            System.out.print("white");
                        else
                            System.out.print("white-");
                    else if (j == n - 1)
                        System.out.print("black");
                    else
                        System.out.print("black-");
                } else {

                    if (i % 2 == 0)
                        if (j == n - 1)
                            System.out.print("black");
                        else
                            System.out.print("black-");
                    else if (j == n - 1)
                        System.out.print("white");
                    else
                        System.out.print("white-");
                }
            }
            System.out.println();
        }
    }
}