package ClassMath;
/*Создайте программу, которая будет генерировать и выводить
на экран вещественное псевдослучайное число из промежутка [-3;3)*/
public class Exercise02_01 {
    public static void main(String[] args) {
        double a = (double)Math.random() * 6 - 3;
        System.out.print("Случайное число из промежутка -3 , 3 равно ");
        System.out.printf("%-8.3f", a);
    }
}
