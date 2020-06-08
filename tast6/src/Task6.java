//Написать программу, которая будет выполнять следующие действия:

     //   1. Ввод трех чисел с клавиатуры x, y, z

      //  2. Нахождение и вывод на экран среднего арифметического чисел x, y, z

      //  3. Деление среднего арифметического на 2 без остатка

      //  4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double x = scanner.nextInt();
        System.out.println("Введите второе число");
        double y = scanner.nextInt();
        System.out.println("Введите третье число");
        double z = scanner.nextInt();

        double b = (x+y+z)/3.0;
        System.out.println("среднее арифметическое чисел " + b);

        int c = (int)b/2;

        if (c > 3) {
            System.out.println("Программа выполнена корректно");
        }

        }
    }

