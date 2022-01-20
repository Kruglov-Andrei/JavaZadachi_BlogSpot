/*В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n...*/

package BasicTypes;

public class Exercise01_02 {
    public static void main(String[] args) {
        int a = 83;
        int b = a % 10;
        int c = (a / 10) % 10;
        System.out.println("сумма цифр числа " + a + " составляет " + (b + c));
    }
}
