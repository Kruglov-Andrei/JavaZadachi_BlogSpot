package BasicTypes;
import java.util.Scanner;
/*Решение 3
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого
и выводящую результат на экран*/
public class Exercise01_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Пожалуйста, введите вещественное число:");
        if (sc.hasNextDouble()){
            a = sc.nextDouble();
            double b = (double) Math.round(a);
            System.out.println("Если округлить до ближайшего целого, то получим число " + b);
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
    }
}