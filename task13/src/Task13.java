

//Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.

import java.util.Scanner;

public class Task13 {

  public static void main(String[] args) {
    System.out.println("Введите первую строку");
    Scanner scanner1 = new Scanner(System.in);
    String s1 = scanner1.nextLine();
    System.out.println("Введите вторую строку");
    Scanner scanner2 = new Scanner(System.in);
    String s2 = scanner2.nextLine();
    if (s1.length() == s2.length()) {
      System.out.println("Введенные строки равны");
    } else if (s1.length() < s2.length()) {
      System.out.println(s2);
    } else
      System.out.println(s1);

  }
}


