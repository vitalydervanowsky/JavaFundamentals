package by.mzkt;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество случайных чисел: ");
        int quantity = sc.nextInt();
        int [] randArray = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            randArray[i] = (int)(Math.random()*100);
        }
        System.out.println("Случайные числа в строку:");
        for (int i = 0; i < quantity; i++) {
            System.out.print(randArray[i] + " ");
        }
        System.out.println();
        System.out.println("Случайные числа в столбец:");
        for (int i = 0; i < quantity; i++) {
            System.out.println(randArray[i]);
        }
    }
}
