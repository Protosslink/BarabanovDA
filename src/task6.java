package com.company;
import java.util.Scanner;


public class task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x = ");
        int numX = in.nextInt();
        System.out.print("Введите число y = ");
        int numY = in.nextInt();
        System.out.print("Введите число z = ");
        int numZ = in.nextInt();
        int averageNumber = (numX + numY + numZ) / 3;
        System.out.println("Среднее арифметическое = " + averageNumber);
        int number = averageNumber / 2;
        if(number > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}