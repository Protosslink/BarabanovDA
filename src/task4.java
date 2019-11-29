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
            System.out.println(Arrays.toString(strArr));

            for (int i = 0; i <= strArr.length; i++) {
                int i3 = 0;
                try {
                    i3 = Integer.parseInt(strArr[i]);
                    System.out.print(i3 + " ");
                } catch (NumberFormatException e) {
                    System.err.println("Неверный формат строки!");
                }
                if (i3 >= 2) {
                    System.out.println("Введено число отличное от бинарного формата!");
                } else {
                    int binary = binarynum;
                    int decimal = 0;
                    int power = 0;
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
        }
    }





