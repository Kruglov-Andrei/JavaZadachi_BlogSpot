package Cycles;

import java.util.Scanner;

/*Создайте программу, вычисляющую факториал натурального числа n,
которое пользователь введёт с клавиатуры.*/
public class Exercise05_07 {
    public static int getFactorial(int b) {
        if (b <= 1) {
            return 1;
        } else {
            return b * getFactorial(b - 1);
        }
    }

    public static void main(String[] args) {
        int a;
        System.out.println("Введите натуральное число:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            a = sc1.nextInt();
            System.out.println("Факториал числа равен " + getFactorial(a));
        }
        else System.out.println("Введено неверное число");
    }
}
