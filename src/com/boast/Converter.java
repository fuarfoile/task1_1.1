package com.boast;

public class Converter {
    public static String decToBin(int number) {

        String result = "";
        while(number > 1) {
            result = number % 2 + result;
            number >>= 1;
        }

        return number + result;
    }

    public static String decToOct(int number) {

        String result = "";
        while(number > 7) {
            result = number % 8 + result;
            number >>= 3;
        }

        return number + result;
    }

    public static String decToHex(int number) {

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
