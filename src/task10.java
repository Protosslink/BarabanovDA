package com.company;
import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        // Ввод пользователем размер массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int sizeMassY = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int sizeMassX = in.nextInt();

        //Создание массива
        int mass[][] = new int[sizeMassY][sizeMassX];
        for (int j = 0; j < sizeMassY; j++) {
            for (int i = 0; i < sizeMassX; i++) {
                System.out.print("Введите число: ");
                int z = in.nextInt();
                mass[j][i] = z;
            }
            System.out.println("Новая строка"); }

        //Вывод на экран первой строки матрицы, где каждый элемент умножается на 3
         for(int l = 0; l < sizeMassX; l++){
         System.out.print(mass[0][l]*3 + " "); }
    }
}

