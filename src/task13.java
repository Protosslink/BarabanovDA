package com.company;
import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {

        // Ввод пользователем размер массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String one = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String two = in.nextLine();
        //System.out.println(one + " " + two);
        int lengthOne = one.length();
        int lengthTwo = two.length();
        //System.out.println(lengthOne + " " + lengthTwo);
        if(lengthOne > lengthTwo){
            System.out.println("Первая строка длиннее");
        }
            else if(lengthOne < lengthTwo){
            System.out.println("Вторая строка длиннее");
        }
            else {
            System.out.println("Длинны строк равны");
        }
    }
}

