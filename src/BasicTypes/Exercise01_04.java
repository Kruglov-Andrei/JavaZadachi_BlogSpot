package BasicTypes;

import java.util.Scanner;

/*В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n*/
public class Exercise01_04 {
    public static void main(String[] args) {
        int a;
        System.out.println("Пожалуйста, введите целое трёхзначное число:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            a = sc.nextInt();
            int x = a % 10;
            int y = (a / 10) % 10;
            int z = (a / 100) % 10;
            System.out.println("Сумма цифр введённого числа равняется " + (x + y + z));
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
    }
}
