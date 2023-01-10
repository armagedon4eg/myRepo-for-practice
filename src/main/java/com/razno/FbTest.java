package com.razno;

public class FbTest {
    public static void main(String[] args) {
        FizzBuzz();
    }

    public static void FizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Bu...");
            } else if (i % 3 == 0) {
                System.out.println("Fi...");
            } else {
                System.out.println(i);
            }
        }
    }
}
