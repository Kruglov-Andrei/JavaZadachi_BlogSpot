/*Создайте программу, выводящую на экран результат деления q на w с остатком.*/

package BasicTypes;

public class Exercise01_01 {
    public static void main(String[] args) {
        int a = 46;
        int b = 11;
        int x = a / b;
        int y = a % b;
        System.out.println("Результат деления a и b равен " + x + " с остатком " + y);
    }
}
