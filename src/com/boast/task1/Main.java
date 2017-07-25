package com.boast.task1;

import java.util.Scanner;
import com.boast.Converter;

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