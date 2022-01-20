package Cycles;
/*Создайте программу, выводящую на экран
все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/
public class Exercise05_01 {
    public static void main(String[] args) {
        for (int a = 1000; a <= 9999; a += 3){
            System.out.print(a + ", ");
        }
    }
}
