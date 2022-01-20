package Arrays;
/*Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
Определить и вывести на экран сообщение о том,
является ли массив строго возрастающей последовательностью.*/
public class Exercise06_06 {
    public static void main(String[] args) {
        int[] mas1 = new int[4];
        for (int i = 0; i < mas1.length; i++){
            mas1[i] = (int)(Math.random() * ((99 - 10)+ 1) + 10);
            System.out.print(mas1[i] + " ");
        }
        for (int i = 0; i < mas1.length; i++){
            if (i > 0){
                if (mas1[i - 1] >= mas1[i]){
                    System.out.println("Прогрессия не возрастающая");
                    break;
                }
            }
            if (i == mas1.length - 1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}
