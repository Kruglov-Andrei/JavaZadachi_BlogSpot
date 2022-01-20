package Arrays;
/*Создать двумерный массив из 8 строк по 5 столбцов в каждой
из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.*/
public class Exercise06_14 {
    public static void main(String[] args) {
        int [][] mas1 = new int[8][5];
        for (int i = 0; i < mas1.length; i++){
            for (int j = 0; j < mas1[i].length; j++){
                mas1[i][j] = (int)(Math.random() * ((99 - 10) + 1) + 10);
                System.out.print(mas1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
