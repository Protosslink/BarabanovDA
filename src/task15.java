package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {

        // Ввод пользователем размер массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeMass = in.nextInt();

        //Создание массива
        int[] arr = new int[sizeMass];
        for (int i = 0; i < sizeMass; i++) {
            System.out.print("Введите число: ");
            int z = in.nextInt();
            arr[i] = z;
        }
        int numCounter;
        do {
            numCounter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    numCounter++;
                }
            }
        }while (numCounter > 0);
        System.out.println(Arrays.toString(arr));
    }
}
