package com.company;
import java.util.Scanner;

public class task7 {

        public static void main(String[] args) {
            final int X = 1;
            final int Y = 2;
            final int Z = 3;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите любое число = ");
            int number = in.nextInt();
            switch(number) {
                case X:
                    System.out.println("Данное значение имеется в константе X");
                         break;
                case Y:
                    System.out.println("Данное значение имеется в константе Y");
                    break;
                case Z:
                    System.out.println("Данное значение имеется в константе Z");
                    break;
                default:
                    System.out.println("Такой константы нет!");
                    break;
            }



        }
    }


