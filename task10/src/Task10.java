//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3. Размерность матрицы задается пользователем.


import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        System.out.println("Укажи количество строк массива");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Укажи количество столбцов массива");
        int y = scanner.nextInt();
        int[][] numbers = new int[x][y];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("Введи элемент массива: ");

                numbers[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                ;
                System.out.print(numbers[i][j] * 3 + " ");

            }
        }
    }
}
