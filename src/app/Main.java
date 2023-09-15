package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення двовимірного масиву
        int[][] ticket = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Введення виграшного числа через Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        int winningNumber = scanner.nextInt();

        // Пошук виграшного числа на лотерейному квитку
        boolean isWinningNumberFound = false;
        for (int i = 0; i < ticket.length; i++) {
            for (int j = 0; j < ticket[i].length; j++) {
                if (ticket[i][j] == winningNumber) {
                    System.out.println("You win!");
                    isWinningNumberFound = true;
                    break;
                }
            }
            if (isWinningNumberFound) {
                break;
            }
        }

        // Виведення повідомлення, якщо виграшне число не знайдено
        if (!isWinningNumberFound) {
            System.out.println("Ви не виграли. Спробуйте ще раз!");
        }
    }

}
