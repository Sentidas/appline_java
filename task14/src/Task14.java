/*Необходимо написать программу, которая будет реализовывать следующие действия:
       1. Ввод числа с клавиатуры и запись его в строковую переменную S

       2. Конвертация строковой переменной S в числовую переменную X типа int

        3. Конвертация числа X типа int в число Y типа double

       Все три числа разных типов необходимо в столбик вывести на экран */

import java.util.Scanner;

public class Task14 {

  public static void main(String[] args) {

    System.out.println("Введите целое число");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    String s = a + "";
    System.out.println("Вывод на экран строки: " + s);

    int x = Integer.parseInt (s);
    System.out.println("Вывод на экран целого числа: " +  x);

    double y = x;
    System.out.println("Вывод на экран дробного числа: " + y);

  }
}
