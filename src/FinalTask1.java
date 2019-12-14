import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int binNum = input.nextInt();
        //Преобразование в числа в строку
        String strBinNum = Integer.toString(binNum);
        //Перевод в строковый массив
        String[] arrStrBinNum = strBinNum.split("");
        //Проверка на бинарный формат
        int i3 = 0;
        int pow = 1;
        int summary = 0;
        for (int i = arrStrBinNum.length - 1, y = 0; y < arrStrBinNum.length; i--, y++) { // количество итерaций равно длине массива
            try {
                i3 = Integer.parseInt(arrStrBinNum[i]);
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }
            if (i3 >= 2) {
                System.out.println("Введено число отличное от бинарного формата!");
                break;
            } else {
                if (pow == 1) {
                    summary = i3 * pow;
                    pow = 2;
                } else {
                    summary = summary + i3 * pow;
                    pow = pow * 2;
                }
            }
        }
        if (i3 >= 2) {
            System.out.println("Нужно ввести число в бинарном формате!");
        } else {
            System.out.println(summary);
        }
    }
}



