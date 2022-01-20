package ClassMath;
/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
Вычислить и вывести на экран площадь треугольника и его периметр.*/

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Double a = 25.3;
        Double b = 46.14;
        Double c = (Double) Math.sqrt((Math.pow(a, 2) + Math.pow(b,2)));
        Double d = a * b / 2;
        System.out.print("Длина гипотенузы равна ");
        System.out.printf("%5.3f", c);
        System.out.println("");
        System.out.print("Площадь треугольника равна ");
        System.out.printf("%5.3f", d);
        }
    }
