package com.company;
import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        //Ввод строки в консоль
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст = ");
        String text = in.nextLine();
        //Удаление пробелов и вывод на экран
        String b = text.replaceAll(" ","");
        System.out.println(b);
    }
}