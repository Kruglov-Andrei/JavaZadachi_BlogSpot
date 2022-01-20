package Comparison;
/*Создать программу, выводящую на экран случайно сгенерированное
трёхзначное натуральное число и его наибольшую цифру.*/
public class Exercise03_05 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * (999 - 100) + 1) + 100;
        System.out.println("Случайное трехзначное натуральное число равняется " + a);
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = (a / 100) % 10;
        if (b >= c & b > d || b > c & b >= d) {
            System.out.println("В числе " + a + " наибольшая цифра " + b);
        }
        else {
            if (c >= d & c > b || c > d & c >= b){
                System.out.println("В числе " + a + " наибольшая цифра " + c);
            }
            else {
                if (d >= b & d > c || d > b & d >= c){
                    System.out.println("В числе " + a + " наибольшая цифра " + d);
                }
            }
        }
    }
}
