
//Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Task12 {

  public static void main(String[] args) {
    System.out.println("Введите с клавиатуры что-нибудь");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String a=s.replace(" ","" );


    System.out.println("Ваш ввод с клавиатуры без пробелов: \"" + a + "\"");
  }
}
