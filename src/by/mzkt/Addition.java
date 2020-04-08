package by.mzkt;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значения через пробел: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Сумма введенных значений равна: " + (a + b));
        System.out.println("Произведение введенных значений равно: " + (a * b));
    }
}
