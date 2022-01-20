package Cycles;
import java.util.Scanner;
/*Выведите на экран первые 11 членов последовательности Фибоначчи.
Напоминаем, что первый и второй члены последовательности равны единицам,
а каждый следующий — сумме двух предыдущих.*/
public class Exercise05_11 {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите целое число:");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()){
            n = sc1.nextInt();
            int[] arr1 = new int[n];
            arr1[0] = 0;
            arr1[1] = 1;
            for (int i = 2; i < arr1.length; ++i){
                arr1[i] = arr1[i - 1] + arr1[i - 2];
            }
            for (int i = 0; i < arr1.length; ++i){
                System.out.println(arr1[i]);
            }
        }
        else System.out.println("Вы ввели неверное число");
    }
}
