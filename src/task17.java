package com.company;
import java.io.*;


public class task17 {

    public static void main(String[] args) {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершенья работы программы введите 'stop' ");

        try (FileWriter fw = new FileWriter("testFile.txt")) {
            {
                do {
                    System.out.println(": ");
                    str = br.readLine();

                    if (str.compareTo("stop") == 0) break;

                    str = str +"\r\n";
                    fw.write(str);
                } while (str.compareTo("stop") != 0);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: " + e );
        }
    }
}
