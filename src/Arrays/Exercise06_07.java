package Arrays;
/*Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.*/
public class Exercise06_07 {
    public static void main(String[] args) {
        int[] mas1 = new int[20];
        for (int i = 0; i < mas1.length; i++){
            if (i < 2){
                mas1[i] = 1;
            }
            else {
                mas1[i] = mas1[i - 2] + mas1[i - 1];
            }
            System.out.print(mas1[i] + " ");
        }
    }
}
