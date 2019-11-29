package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task16 {

    public static void main(String[] args) throws FileNotFoundException /*исключение файл не найден*/ {
        //Строковая переменная "path" и путь к файлу
        String path = "C:/test.txt";

        //Создаем объект fileTxt типа файл с параметром path
        File fileTxt = new File(path);

        //Сканируем файл
         Scanner importTxt = new Scanner(fileTxt);

         //Циклом выводим строки из файла
         while (importTxt.hasNextLine()){
             System.out.println(importTxt.nextLine());

         }
    }
}
