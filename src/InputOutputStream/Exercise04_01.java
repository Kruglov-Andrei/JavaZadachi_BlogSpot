package InputOutputStream;

import java.util.Scanner;

/*Создать программу, которая будет сообщать, является ли целое число,
введённое пользователем, чётным или нечётным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.*/
public class Exercise04_01 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            if (sc1.nextInt() % 2 == 0) {
                System.out.println("Введенное число является чётным");
            } else
                System.out.println("Введённое число является нечётным");
        }
            else
                System.out.println("Ошибка! Введённое число не является целым");
        }
    }
