
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите бинарное число: ");
        String x2 = in.nextLine();
        int x10=Integer.parseInt(x2, 2);

        System.out.println(x10);

    }
}
