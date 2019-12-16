import java.util.Arrays;
import java.util.Scanner;

public class finalTask2 {

    public static void main(String[] args) {

        Scanner inputSizeArr = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int inSizeNum = inputSizeArr.nextInt();
        // System.out.println(inSizeNum);

        int[] arrInt = new int[inSizeNum];
        for (int i = 0; i < inSizeNum; i++) {
            System.out.print("Введите число: ");
            arrInt[i] = inputSizeArr.nextInt();
            //System.out.print(arrInt[i] + " ");
        }
        int inNum;
        for (int i = 1; i < arrInt.length; i++) {
            inNum = arrInt[i];
            int j = i - 1;
            while(j >= 0 && arrInt[j] > inNum) {
                arrInt[j + 1] = arrInt[j];
                j = j - 1;
            }
            arrInt[j + 1] = inNum;
            }
        System.out.println(Arrays.toString(arrInt));
        }
    }









