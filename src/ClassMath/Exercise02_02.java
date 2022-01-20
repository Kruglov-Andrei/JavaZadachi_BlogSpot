package ClassMath;
/*Натуральное положительное число записано в переменную n. Создайте программу,
которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n]*/
public class Exercise02_02 {
    public static void main(String[] args) {
        int n = 5;
        int a = (int)(Math.random() * (2 * n)) - n;
        System.out.println("Случайное число из отрезка " + (n*-1) + ", " + n + " равно " + a);
    }
}
