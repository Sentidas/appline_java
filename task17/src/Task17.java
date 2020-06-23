//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать,
// какой принцип остановки записи в файл он должен подать.

import java.io.*;

public class Task17 {

  public static void main(String[] args) {
    String s;
    System.out.println("Пиши что-нибудь. Как надоест писать, напиши слово \"яблоко\"");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    try (FileWriter fileWriter = new FileWriter("text.txt"))
    {
      do {
      System.out.println(": ");
      s = bufferedReader.readLine();

      if (s.compareTo ("яблоко") == 0) break;
      s = s + "\r\n";
      fileWriter.write(s);
    }
      while (s.compareTo("яблоко") != 0);
    }

    catch (IOException e) {
      System.out.print("что то пошло не так! "+ e);
    }
  }
}





