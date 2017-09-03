/*
 * Main.java 22/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task1;

import java.util.Scanner;
import com.boast.Converter;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter number to convert: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + Converter.decToBin(number));
        System.out.println("Octal: " + Converter.decToOct(number));
        System.out.println("Hexadecimal: " + Converter.decToHex(number));
    }
}