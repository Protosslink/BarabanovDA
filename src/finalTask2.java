import java.util.Scanner;

public class finalTask2 {

    public static void main(String[] args) {

        Scanner inputSizeArr = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int inSizeNum = inputSizeArr.nextInt();
        // System.out.println(inSizeNum);
        int inNum;
        int[] arrInt = new int[inSizeNum];
        for (int i = 0; i < inSizeNum; i++) {
            System.out.print("Введите число: ");
            arrInt[i] = inputSizeArr.nextInt();
            //System.out.print(arrInt[i] + " ");
        }
}
}






