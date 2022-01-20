package Comparison;

import java.util.Scanner;

/*Создать программу, проверяющую и сообщающую на экран,
является ли целое число записанное в переменную n, чётным либо нечётным.*/
public class Exercise03_01 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        if (n % 2 == 0) {
            System.out.println("Число " + n + " является четным");
        }
        else {
            System.out.println("Число " + n + " является нечетным");
        }
    }
}
