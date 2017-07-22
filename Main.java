package com.boast.task1;

import java.util.Scanner;

/**
 * Created by Bondarenko Oleh on 22.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + Converter.decToBin(number));
        System.out.println("Octal: " + Converter.decToOct(number));
        System.out.println("Hexadecimal: " + Converter.decToHex(number));
    }
}

class Converter {

    static String decToBin(int number) {

        String result = "";
        while(number > 1) {
            result = number % 2 + result;
            number >>= 1;
        }

        return number + result;
    }

    static String decToOct(int number) {

        String result = "";
        while(number > 7) {
            result = number % 8 + result;
            number >>= 3;
        }

        return number + result;
    }

    static String decToHex(int number) {

        String result = "";
        while (number > 15) {

            if (number % 16 > 9) {
                result = (char) (number % 16 + 'a' - 10) + result;
            }
            else {
                result = number % 16 + result;
            }

            number >>= 4;
        }

        if (number % 16 > 9) {
            result = (char) (number % 16 + 'a' - 10) + result;
        }
        else {
            result = number % 16 + result;
        }

        return result;
    }
}
