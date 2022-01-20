package Arrays;
/*Создайте массив из всех нечётных чисел от 1 до 99,
выведите его на экран в строку, а затем этот же массив
выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)*/
public class Exercise06_02 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0)
                a++;
        }
        int[] mas1 = new int[a];
        for (int i = 1, b = 0; i <= 99; i++){
            if (i % 2 != 0){
                mas1[b] = i;
                System.out.print(mas1[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = 99, c = 0; i >= 1; i--){
            if (i % 2 != 0){
                mas1[c] = i;
                System.out.print(mas1[c] + " ");
                c++;
            }
        }
        System.out.println(" ");
        for (int i = mas1.length - 1; i >= 0; i--){
            System.out.println(mas1[i]);
        }
    }
}
