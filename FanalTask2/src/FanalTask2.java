//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Scanner;

public class FanalTask2 {
  public static void main(String[] args) {
    System.out.println("Укажи размер массива");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];


    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Введи " + (i + 1) + "-й элемент массива: ");
      numbers[i] = scanner.nextInt();
    }

    int temp;
    int min;

    for (int j = 0; j < numbers.length - 1; j++) {
      min = j;
      for (int i = j+1; i < numbers.length; i++) {

        if (numbers[i] > numbers[min]) {
          min = i;
        }
        temp = numbers[i];
        numbers[i] = numbers[min];
        numbers[min] = temp;
        }
      }

    System.out.println("это вывод отсортированного массива сортировкой прямого выбора:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]+" ");
    }
  }
  }

