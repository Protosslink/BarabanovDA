import java.util.Scanner;

public class FinalTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате = ");
        int binaryNum = input.nextInt();

        //Преобразование в строку
        String strBinaryNum = Integer.toString(binaryNum);

        //Перевод строки в массив
        String[] strArr = strBinaryNum.split("");

        //Перевод в целочисленный массив
        int i3 = 0;

        for (int i = 0; i < strArr.length; i++) {
            try {
                i3 = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }
            //Проверка введенных чисел на бинарный формат
            if (i3 >= 2) {
                System.out.println("Введено число отличное от бинарного формата!");
                break;
            }
        }

        for(int x = strArr.length - 1, y = 0,w = 1; x >= 0; x--,y++, w++){
            int q = strArr.length - w;
            int sumY = 0;   // число в степени * 1
            int sumX = 2;   //2 в степени q
            //Возведение в степень
            while (q > 1) {
                    sumX = sumX * 2;
                    q--;
            }
            //Вывод на экран
            sumY = Integer.parseInt(strArr[y]) * sumX;
            System.out.println(sumY);

        }
    }
}



