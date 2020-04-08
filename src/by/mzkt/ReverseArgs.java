package by.mzkt;

import java.util.Scanner;

public class ReverseArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите аргументы:");
        String line = sc.nextLine();
        System.out.println("В прямом порядке  : " + line);
        String [] subLine;
        subLine = line.split(" ");
        System.out.print("В обратном порядке: ");
        for (int i = subLine.length - 1; i >= 0; i--) {
            System.out.print(subLine[i] + " ");
        }
    }
}
