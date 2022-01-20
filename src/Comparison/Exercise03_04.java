package Comparison;
/*Создать программу, которая будет проверять попало ли случайно выбранное
из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.*/
public class Exercise03_04 {
    public static void main(String[] args) {
        double a = (Math.random()*(155 - 5) + 1) + 5;
            if (a <=25 || a >= 100){
                System.out.println("Число " + a + " не входит в интервал (25, 100)");
            }
            else {
                System.out.println("Число " + a + " входит в интервал (25, 100)");
            }
    }
}
