
// Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Использовать пузырьковый метод сортировки.

import java.util.Scanner;

public class Task15 {

  public static void main(String[] args) {
    System.out.println("Укажи размер массива");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];


    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Введи " + (i + 1) + "-й элемент массива: ");
      numbers[i] = scanner.nextInt();
    }


    for (int j = numbers.length-1; j > 0; j--) {
      for (int i = 1; i < numbers.length; i++) {
        if (numbers[i-1] > numbers[i]) {
          int temp = numbers[i-1];
          numbers[i-1] = numbers[i];
          numbers[i] = temp;
        }
      }
    }
    System.out.println("это вывод отсортированного массива");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]+" ");

    }
  }
}
