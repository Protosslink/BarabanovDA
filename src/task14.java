package com.company;
import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {

        // Ввод числа с клавиатуры и запись его в строковую переменную S
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = in.nextLine();
        //Конвертация строковой переменной S в числовую переменную X типа int
        int X = Integer.parseInt(S);
        //Конвертация числа X типа int в число Y типа double
        double Y = X;
        //Вывод на экран значения трех переменных S,X,Y
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);

    }
}

