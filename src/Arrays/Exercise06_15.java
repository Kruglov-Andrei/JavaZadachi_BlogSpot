package Arrays;
/*Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел
из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран
значение максимального элемента этого массива (его индекс не имеет значения).*/
public class Exercise06_15 {
    public static void main(String[] args) {
        int[][] mas1 = new int[5][8];
        for (int i = 0; i < mas1.length; i++){
            for (int j = 0; j < mas1[i].length; j++){
                 mas1[i][j] = (int)(Math.random() * ((99 - (-99)) + 1) + (-99));
                System.out.print(mas1[i][j] + " ");
            }
            System.out.println(" ");
        }
        int min = mas1[0][0];
        for (int i = 0; i < mas1.length; i++){
            for (int j = 0; j < mas1[i].length; j++){
                if (mas1[i][j] > min)
                    min = mas1[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = " + min);
    }
}
