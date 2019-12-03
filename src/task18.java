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
        System.out.println("Колличество строк " + lines);

        //Запись в файл
        String str;
        int x = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("testTask18.txt")) {
            {
                while (x < lines) {
                    System.out.println(": ");
                    str = br.readLine();

                    if (str.compareTo("stop") == 0) break;

                    str = str +"\r\n";
                    fw.write(str);
                    x++;
                }
            }
        } catch (IOException esr) {
            esr.printStackTrace();
            System.out.println("Ошибка ввода-вывода: " + esr );
        }

    }
}
