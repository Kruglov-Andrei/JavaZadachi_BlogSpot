package Cycles;

import java.util.Scanner;

/*Для введённого пользователем с клавиатуры натурального числа
посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).*/
public class Exercise05_12 {
    public static void main(String[] args) {
        int a;
        int c = 0;
        System.out.println("Введите целое число:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()){
            a = sc1.nextInt();
            while(a != 0){
                c = c + a % 10;
                a /= 10;
            }
            System.out.println("Сумма всех цифр, введённого числа " + a + " составляет " + c);
        }
        else System.out.println("Вы ввели неверное число");
    }
}
