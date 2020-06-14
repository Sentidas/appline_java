//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

import java.util.Scanner;

public class Task11 {
  public static void main(String[] args) {
    System.out.println("Введите с клавиатуры что-нибудь");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    System.out.println("Вы ввели с клавиатуры \"" + s + "\"");
  }
}
