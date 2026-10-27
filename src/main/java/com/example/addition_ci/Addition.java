package com.example.addition_ci;

import java.util.Scanner;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Addition addition = new Addition();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = addition.add(num1, num2);

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

