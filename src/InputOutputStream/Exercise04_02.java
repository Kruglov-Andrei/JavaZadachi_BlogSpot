package InputOutputStream;

import java.util.Scanner;

/*Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел,
введённых пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.*/
public class Exercise04_02 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()){
            int a = sc1.nextInt();
            System.out.println("Введите второе целое число:");
            Scanner sc2 = new Scanner(System.in);
            if (sc2.hasNextInt()){
                int b = sc2.nextInt();
                int c = a + b;
                System.out.println("Сумма двух целых чисел равняется " + c);
            }
            else
                System.out.println("Вы ввели не целое число");
        }
        else
            System.out.println("Вы ввели не целое число");
    }
}
