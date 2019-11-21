package com.company;
import java.util.Scanner;

    public class task4 {

        public static void main(String[] args) {

            Scanner input = new Scanner( System.in );
            System.out.print("Введите число в бинарном формате = ");

            int  binarynum =input.nextInt();
            int binary=binarynum;
            int decimal = 0;
            int power = 0;
            while(true){
                if(binary == 0){
                    break;
                } else {
                    int temp = binary%10;
                    decimal += temp*Math.pow(2, power);
                    binary = binary/10;
                    power++;

                }
            }
            System.out.println("Число в десятичном формате = " + decimal); ;
        }

    }

