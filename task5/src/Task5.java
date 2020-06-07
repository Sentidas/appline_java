//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 1 до 10: ");
        int x = in.nextInt();


        System.out.println(x * 1 + " " + x * 2 + " " + x * 3 + " " + x * 4 + " "
                + x * 5 + " " + x * 6 + " " + x * 7 + " " + x * 8 + " "
                + x * 9 + " " + x * 10);
    }
}









