package com.company;
import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {

        // Ввод пользователем размер массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeMass = in.nextInt();

        //Создание массива
        int mass[] = new int[sizeMass];
        int x;
        int y = 0;
        for(int i = 0; i < sizeMass; i++){
            System.out.print("Введите число: ");
            int z = in.nextInt();
            mass[y] = z;
            y = y +1;
        }

        // Вывод массива на экран, умножив каждый элемент массива на 2
        for(int j = 0; j < sizeMass; j++){
            System.out.print(mass[j]*2 + " ");
       }
    }
}
