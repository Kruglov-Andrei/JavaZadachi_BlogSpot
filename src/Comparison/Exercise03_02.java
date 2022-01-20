package Comparison;

import java.util.Scanner;

/*Создать программу, выводящую на экран
ближайшее к 10 из двух чисел, записанных в переменные m и n. */
public class Exercise03_02 {
    public static void main(String[] args) {
        double a = 10;
        System.out.println("Введите первое число для сравнения:");
        double m;
        Scanner sc1 = new Scanner(System.in);
        m = sc1.nextDouble();
        System.out.println("Введите второе число для сравнения:");
        double n;
        Scanner sc2 = new Scanner(System.in);
        n = sc2.nextDouble();
            if (Math.abs(a - m) > Math.abs(a - n)){
                System.out.println("Значение числа " + n + " ближе к числу " + a);
            }
                else {
                    System.out.println("Значение числа " + m + " ближе к числу " + a);
                }
    }
}
