package Cycles;
/*Создайте программу, выводящую на экран
первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/
public class Exercise05_02 {
    public static void main(String[] args) {
        for (int a = 1, b = 1; a <= 55; a++, b = b + 2){
            System.out.print(b + ", ");
        }
    }
}
