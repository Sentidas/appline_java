
//Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
// В программе должны присутствовать константы X, Y, Z.
// Программа должна сравнивать введенное значение с клавиатуры со значением констант
// и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
// Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите c клавиатуры число");
         int number = scanner.nextInt();

         int x = 5;
         int y = 10;
         int z = 55;

         if (number == x || number ==y || number == z)
             System.out.println("Данное значение имеется в константах");
         else
             System.out.println("Такой константы нет!");
    }
}
