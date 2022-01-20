package Cycles;
import java.util.Scanner;
/*Вариант с рекурсией
Выведите на экран конкретный член (n) последовательности Фибоначчи.
Напоминаем, что первый и второй члены последовательности равны единицам,
а каждый следующий — сумме двух предыдущих.*/
public class Exercise05_11_01 {
    public static int getFibonacciValue(int n){
        if (n <= 1){
            return 0;
        }else if (n == 2){
            return 1;
        }else {
            return (getFibonacciValue(n - 1) + getFibonacciValue(n - 2));
        }
    }
    public static void main(String[] args) {
        int m;
        System.out.println("Введите целое число - номер элемента последовательности Фибоначчи:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()){
            m = sc1.nextInt();
            System.out.println(m + "-ый элемент последовательности фибоначчи: " + getFibonacciValue(m));
        }
        else System.out.println("Вы ввели неверное число");
    }
}