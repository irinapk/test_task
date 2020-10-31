package main;

import java.util.Scanner;

import static main.Roman.decode;
import static main.Roman.intToRoman;

public class Calc {
    public static void main(String[] args) {
        System.out.print("Please insert your expression: ");
        Scanner problem = new Scanner(System.in); // prompt user for input

        // case with the Arabic numerals
        if (problem.hasNextInt()) {

            int a = problem.nextInt();
            String str = problem.next();
            char symbol = str.charAt(0);
            int b = problem.nextInt();
            if (a >= 0 & a < 11 & b >= 0 & b < 11) {
                if (symbol == '+') {
                    System.out.println("Result: " + (a + b));
                } else if (symbol == '-') {
                    System.out.println("Result: " + (a - b));
                } else if (symbol == '/') {
                    System.out.println("Result: " + (a / b));
                } else if (symbol == '*') {
                    System.out.println("Result: " + (a * b));
                }
            } else {
                System.out.println("Please input only numbers from 0 to 10");
            }
        }

        // case with the Roman numerals
        else {
             int c = decode(problem.next());
             String symbol = problem.next();
             int d = decode(problem.next());

            char sym = symbol.charAt(0);
                if (c >= 0 & c < 11 & d >= 0 & d < 11) {
                    if (sym == '+') {
                        int result2 = c + d;
                        String romanResult = intToRoman(result2);
                        System.out.println("Result: " + romanResult);
                    } else if (sym == '-') {
                        int result2 = c - d;
                        String romanResult = intToRoman(result2);
                        System.out.println("Result: " + romanResult);
                    } else if (sym == '/') {
                        int result2 = c / d;
                        String romanResult = intToRoman(result2);
                        System.out.println("Result: " + romanResult);
                    } else if (sym == '*') {
                        int result2 = c * d;
                        String romanResult = intToRoman(result2);
                        System.out.println("Result: " + romanResult);
                    }
                }
                else {
                    System.out.println("Error!");
               }
        }
    }
}
