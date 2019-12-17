import java.util.Arrays;
import java.util.Scanner;

public class finalTask3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Ввод курса
        System.out.print("Введите текущий курс: ");
        double inRate = in.nextDouble();

        //Ввод количества рублей
        System.out.print("Введите количество рублей: ");
        int inSumRub = in.nextInt();
        in.close();
        System.out.println(inRate);
        System.out.println(inSumRub);
        double dollars = inSumRub / inRate;

        //Вывод количества долларов
        System.out.println(String.format("%.2f", dollars));

    }
}
