package Arrays;

import java.util.Random;

/*Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
и выведете это количество на экран на отдельной строке.*/
public class Exercise06_03 {
    public static void main(String[] args) {
        int b = 0;
        int[] mas1 = new int[15];
        for (int i = 0; i < mas1.length; i++){
            Random rnd1 = new Random();
            mas1[i] = rnd1.nextInt(10);
            System.out.print(mas1[i] + " ");
            if (mas1[i] > 0 & mas1[i] % 2 == 0)
                b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + b + " четных чисел");
    }
}
