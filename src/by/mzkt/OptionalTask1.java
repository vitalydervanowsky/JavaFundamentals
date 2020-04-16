package by.mzkt;

import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите аргументы:");
        String line = sc.nextLine();
        String [] subLine;
        subLine = line.split(" ");
        int quantity = subLine.length;
        int [] nums = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            nums[i] = Integer.parseInt(subLine[i]);
        }

        // Task 1
        System.out.println("Task 1");
        int longest = 0;
        int shortest = 0;
        for (int i = 1; i < subLine.length; i++) {
            if (subLine[i].length() > subLine[longest].length()) {
                longest = i;
            }
            if (subLine[i].length() < subLine[shortest].length()) {
                shortest = i;
            }
        }
        System.out.println("Самое длинное введенное число: " + subLine[longest]);
        System.out.println("Самое короткое введенное число: " + subLine[shortest]);

        // Task 2
        System.out.println("Task 2");
        System.out.print("По возрастанию длины введенных аргументов: ");
        for (int i = 0; i < subLine.length; i++) {
            String temp;
            for (int j = i; j < subLine.length; j++) {
                if (subLine[i].length() > subLine[j].length()) {
                    temp = subLine[i];
                    subLine[i] = subLine[j];
                    subLine[j] = temp;
                }
            }
            System.out.print(subLine[i] + " ");
        }
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        double sum = 0;
        for (String value : subLine) {
            sum += value.length();
        }
        double averageLength = sum / subLine.length;
        System.out.print("Средняя длина: " + averageLength
                + "\nАргументы, длиннее средней длины: ");
        for (String s : subLine) {
            if (s.length() > averageLength) {
                System.out.print(s + "(длина " + s.length() + ") ");
            }
        }
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        int [] counterOfDifferentNums = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            boolean [] differentNums = new boolean[10];
            int temp = nums[i];
            while (temp != 0) {
                int number = temp % 10;
                for (int j = 0; j < 10; j++) {
                    if (number == j) {
                        differentNums[j] = true;
                    }
                }
                temp = temp / 10;
            }
            for (boolean differentNum : differentNums) {
                if (differentNum) {
                    counterOfDifferentNums[i]++;
                }
            }
        }
        int minDifNums = 0;
        for (int i = 0; i < quantity; i++) {
            if (counterOfDifferentNums[i] < counterOfDifferentNums[minDifNums]) {
                minDifNums = i;
            }
            System.out.println("В " + nums[i] + " разных цифр "
                + counterOfDifferentNums[i]);
        }
        System.out.println("Число с наименьшим количеством различных цифр: "
                + nums[minDifNums] + " ("
                + counterOfDifferentNums[minDifNums] + ")");

        // Task 5
        System.out.println("Task 5");
        int [] arrayOfEvenDigits = new int[quantity];
        int [] arrayOfDigitsInNum = new int[quantity];
        int totalEvenNumbers = 0;
        int totalEvenEqualsOdd = 0;
        for (int i = 0; i < quantity; i++) {
            arrayOfEvenDigits[i] = 0;
            arrayOfDigitsInNum[i] = 0;
            int temp = nums[i];
            while (temp != 0) {
                int number = temp % 10;
                if (number % 2 == 0) {
                    arrayOfEvenDigits[i]++;
                }
                arrayOfDigitsInNum[i]++;
                temp = temp / 10;
            }
            if (arrayOfEvenDigits[i] == arrayOfDigitsInNum[i]) {
                totalEvenNumbers++;
            }
            if (arrayOfEvenDigits[i] == arrayOfDigitsInNum[i] - arrayOfEvenDigits[i]) {
                totalEvenEqualsOdd++;
            }
        }
        System.out.println(totalEvenNumbers
                + " чисел, содержащих только четные цифры");
        System.out.println(totalEvenEqualsOdd
                + " чисел, содержащих равное число четных и нечетных цифр");

        // Task 6
        System.out.println("Task 6");
        boolean isAscending = false;
        for (int i = 0; i < quantity; i++) {
            int temp = nums[i];
            while (temp != 0) {
                int number = temp % 10;
                if (temp / 10 > 0) {
                    int nextNumber = temp / 10 % 10;
                    isAscending = nextNumber < number;
                }
                temp = temp / 10;
            }
            if (isAscending) {
                System.out.println(nums[i] + " первое по возрастанию");
                break;
            }
        }


        // Task 7
        System.out.println("Task 7");
        boolean isFound = false;
        for (int i = 0; i < quantity; i++) {
            int temp = nums[i];
            boolean [] usedNumbers = new boolean[10];
            while (temp != 0) {
                int number = temp % 10;
                if (!usedNumbers[number]) {
                    isFound = true;
                    switch (number) {
                        case 0: {  usedNumbers[0] = true;  break;  }
                        case 1: {  usedNumbers[1] = true;  break;  }
                        case 2: {  usedNumbers[2] = true;  break;  }
                        case 3: {  usedNumbers[3] = true;  break;  }
                        case 4: {  usedNumbers[4] = true;  break;  }
                        case 5: {  usedNumbers[5] = true;  break;  }
                        case 6: {  usedNumbers[6] = true;  break;  }
                        case 7: {  usedNumbers[7] = true;  break;  }
                        case 8: {  usedNumbers[8] = true;  break;  }
                        case 9: {  usedNumbers[9] = true;  break;  }
                    }
                } else {
                    isFound = false;
                }
                temp = temp / 10;
            }
            if (isFound) {
                System.out.println(nums[i] + " состоит из различных цифр");
                break;
            }
        }
    }
}
