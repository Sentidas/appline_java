//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)


import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalTask3 {
  public static void main(String[] args) {

    try {
      System.out.println("Введите текущий курс доллара");
      Scanner scanner = new Scanner(System.in);
      double n = scanner.nextDouble();

      System.out.println("Введите количество рублей");
      Scanner scanner1 = new Scanner(System.in);
      double s = scanner.nextDouble();


      System.out.println("Итого: " + String.format("%.2f", s/n) + " долларов");
    }

    catch (ArithmeticException ex)
    { System.out.println("Ошибка. Попробуйте снова" + ex);
    }
    catch (InputMismatchException ex)
    { System.out.println("Введите число через запятую " + ex);
    }

    }
  }


