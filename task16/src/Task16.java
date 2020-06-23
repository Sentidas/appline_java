// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {

  public static void main(String[] args) {
    String s;
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text"))) {
      while ((s = bufferedReader.readLine()) != null) {
        System.out.println(s);
      }
    } catch (IOException e) {
      System.out.println("Что-то пошло не так! " + e);
    }
  }
}

