package com.company;
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

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println(" ");


        //Сортировка массива
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] < arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;

                }
            }
            System.out.print(arr[i] + " ");
        }

        }
    }
