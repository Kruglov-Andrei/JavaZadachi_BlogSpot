package InputOutputStream;

import java.util.Scanner;

/*Создать программу, которая будет выводить на экран
меньшее по модулю из трёх введённых пользователем вещественных чисел.*/
public class Exercise04_03 {
    public static void main(String[] args) {
        System.out.println("Введите первое вещественное число:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextDouble()) {
            double a = sc1.nextDouble();
            System.out.println("Введите второе вещественное число:");
            Scanner sc2 = new Scanner(System.in);
            if (sc2.hasNextDouble()) {
                double b = sc2.nextDouble();
                System.out.println("Введите третье вещественное число:");
                Scanner sc3 = new Scanner(System.in);
                if (sc3.hasNextDouble()) {
                    double c = sc3.nextDouble();
                    System.out.println("Колдуй баба, колдуй дед - начинается магия...");
                    if (Math.abs(a) <= Math.abs(b) & Math.abs(a) <= Math.abs(c))
                        System.out.println("Число " + a + " является меньшим по модулю среди трёх введенных чисел");
                        if (Math.abs(b) <= Math.abs(c) & Math.abs(b) <= Math.abs(a))
                            System.out.println("Число " + b + " является меньшим по модулю среди трёх введенных чисел");
                            if (Math.abs(c) <= Math.abs(a) & Math.abs(c) <= Math.abs(b))
                                System.out.println("Число " + c + " является меньшим по модулю среди трёх введенных чисел");
                            } else System.out.println("Вы ввели неверное третье число");
                        } else System.out.println("вы ввели неверное второе число");
                    } else System.out.println("Вы ввели неверное первое число");
                }
            }

