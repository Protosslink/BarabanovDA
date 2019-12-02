package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате = ");
        int binarynum = input.nextInt();

        //Преобразование в строку
        String strBinaryNum = Integer.toString(binarynum);

        //Перевод строки в массив
        String[] strArr = strBinaryNum.split("");

        //Перевод в целочисленный массив
        int binary = binarynum;
        int decimal = 0;
        int power = 0;
        int i3 = 0;
        for (int i = 0; i < strArr.length; i++) {
            try {
                i3 = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }
            //Проверка введенных чисел на бинарный формат
            if (i3 >= 2) {
                System.out.println("Введено число отличное от бинарного формата!");
                break;
            } else {

                while (true) {
                    if (binary == 0) {
                        break;
                    } else {
                        int temp = binary % 10;
                        decimal += temp * Math.pow(2, power);
                        binary = binary / 10;
                        power++;

                    }
                }

            }
        }

        if (i3 <= 1) {
            System.out.println("Бинарный = " + binarynum + " Десятичный = " + decimal);
        }
    }
}






