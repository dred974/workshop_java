package com.github.dred974.workshop;

public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.printf("%d", i);
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.printf(" -> Fizz");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.printf((" -> Buzz"));
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf((" -> FizzBuzz"));
            }
            System.out.printf("\n");
        }
    }
}