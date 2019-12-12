import java.util.Scanner;

public class Binarium {
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
        int sumNum = 0;
        for (int i = 0, y = arrStrBinNum.length - 1; i < arrStrBinNum.length; i++, y--) { // количество итериций равно длинне массива
            try {
                i3 = Integer.parseInt(arrStrBinNum[i]);
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }
            if (i3 >= 2) {
                System.out.println("Введено число отличное от бинарного формата!");
            } else {
                while (y > 0) {
                    if(y == 0){
                        break;
                    }else {

                    }
                }
            }
        }
    }
}


//1101101
//0123456 i
//6543210 y
