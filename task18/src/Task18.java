//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные,введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;

public class Task18 {
  public static void main(String[] args) {
    String s;
    int counter = 0;
    int counter1 = 0;
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text"))) {

      while ((s = bufferedReader.readLine()) != null) {
        System.out.println(s);
        counter ++;
      }

    } catch (IOException e) {
      System.out.println("Что-то пошло не так! " + e);
    }

    String str;
    System.out.println("\n");
    System.out.println("А теперь напиши свое стихотворение. Количество строк в стихотворении: " + counter);
    System.out.println("Поэтому тебе придется написать столько же строк, иначе твои стихи не будут опубликованы!");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    try (FileWriter fileWriter = new FileWriter("text"))
    {
      System.out.println("Пиши свой шедевр:");
      do {
        str = bufferedReader.readLine();
        str = str + "\r\n";
        fileWriter.write(str);
        counter1 ++;
      }
      while (counter1<counter);
      System.out.println("Твои стихи опубликованы!");
    }
    catch (IOException e) {
      System.out.print("что то пошло не так! "+ e);
    }
  }
}
