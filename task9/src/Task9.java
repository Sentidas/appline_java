//  Произведите ввод данных с клавиатуры в массив,
//  а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
//  Размер массива задается пользователем.


import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("Укажи размер массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введи " + (i+1) + "-й элемент массива: ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 2);

        }
    }
}
