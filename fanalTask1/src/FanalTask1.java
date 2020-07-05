//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
//Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.


import java.io.IOException;
import java.util.Scanner;

public class FanalTask1 {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int[] n = new int[s.length()];


    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != '1' && s.charAt(i) != '0') {
        System.out.println("Вы ввели не двоичное число, попробуйте еще раз.");
        break;
      }
      n[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
    }

    int a = 0;
    double sum = 0;
    for (int i = n.length - 1; i >= 0; i--) {
      sum = sum + n[i] * Math.pow(2, a);
      a++;
    }
    int b = (int) sum;

    if (b != 0 || s.equals("0") )
      System.out.println("Двоичное число " + b);
  }
}








