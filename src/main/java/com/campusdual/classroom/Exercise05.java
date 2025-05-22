package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        checkLessOrGreaterEqual(2, 3);
        checkMultiply(6, 7);
        checkPositiveNegative(0);
    }

    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 < n2) {
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es mayor o igual que " + n2);
        }
    }

    public static void checkMultiply(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " no es multiplo de " + n2);
        }
    }

    public static void checkPositiveNegative(int num) {
        if (num < 0) {
            System.out.println(num + " es negativo.");
        } else {
            System.out.println(num + " es positivo.");
        }
    }
}
