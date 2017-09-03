/*
 * Converter.java 04/09/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast;

public class Converter {
    public static String decToBin(int number) {
        long longNumber = number;
        if (longNumber < 0) {
            longNumber = longNumber + ((long) Integer.MAX_VALUE) * 2 + 2;
        }

        StringBuilder result = new StringBuilder();
        while(longNumber > 1) {
            result.append(longNumber % 2);
            longNumber >>= 1;
        }
        result.append(longNumber);

        for (int i = 4; i < result.length(); i++) {
            if ((i + 1) % 5 == 0) {
                result.insert(i, ' ');
            }
        }

        result.reverse();

        return result.toString();
    }

    public static String decToOct(int number) {
        long longNumber = number;
        if (longNumber < 0) {
            longNumber = longNumber + ((long) Integer.MAX_VALUE) * 2 + 2;
        }

        StringBuilder result = new StringBuilder();
        while(longNumber > 7) {
            result.append(longNumber % 8);
            longNumber >>= 3;
        }
        result.append(longNumber);

        for (int i = 3; i < result.length(); i++) {
            if ((i + 1) % 4 == 0) {
                result.insert(i, ' ');
            }
        }

        result.reverse();

        return result.toString();
    }

    public static String decToHex(int number) {
        long longNumber = number;
        if (longNumber < 0) {
            longNumber = longNumber + ((long) Integer.MAX_VALUE) * 2 + 2;
        }

        StringBuilder result = new StringBuilder();
        while (longNumber > 15) {

            if (longNumber % 16 > 9) {
                result.append((char) (longNumber % 16 + 'a' - 10));
            }
            else {
                result.append(longNumber % 16);
            }

            longNumber >>= 4;
        }

        if (longNumber % 16 > 9) {
            result.append((char) (longNumber % 16 + 'a' - 10));
        }
        else {
            result.append(longNumber % 16);
        }

        for (int i = 4; i < result.length(); i++) {
            if ((i + 1) % 5 == 0) {
                result.insert(i, ' ');
            }
        }

        result.reverse();

        return result.toString();
    }
}
