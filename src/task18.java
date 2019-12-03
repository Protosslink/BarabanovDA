package com.company;
import java.io.*;
import java.util.Scanner;

public class task18 {

    public static void main(String[] args) throws IOException {
        //Вывод строк из файла testTask18

        String pathTestTask18 = "testTask18.txt";
        File fileTxtTask18 = new File(pathTestTask18);
        int lines = 0;
        //Сканируем файл
        try {
            Scanner importTxt = new Scanner(fileTxtTask18);
            //Циклом выводим строки из файла
            while (importTxt.hasNextLine()) {
                System.out.println(importTxt.nextLine());
                lines++;
            }
            //Закрываем сканер
            importTxt.close();
        } catch (FileNotFoundException noneTestTask18) {
            System.out.println("Файл не найден");
        }

        //Подсчет количества строк в файле
        System.out.println("Колличество строк " + lines);
    }
}
