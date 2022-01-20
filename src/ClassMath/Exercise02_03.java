package ClassMath;

import java.util.Scanner;

/*В переменные a и b записаны целые числа, при этом b больше a. Создайте программу,
которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b].*/
public class Exercise02_03 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Введите целое число a:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()){
            a = sc1.nextInt();
            System.out.println("Введите целое число b:");
            Scanner sc2 = new Scanner(System.in);
            if (sc2.hasNextInt()){
                b = sc2.nextInt();
                    if (b > a){
                        int c = (int)(Math.random() * (b - a)) + a;
                        System.out.println("Случайное число из отрезка [" + a + "; " + b + "] равняется " + c);
                        }
                    else {
                        System.out.println("Неверное число - " + a + " > " + b);
                    }

                }
            }
    }
}
