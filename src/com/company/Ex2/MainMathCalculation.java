package com.company.Ex2;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 * <p>
 * Stwórz klasę która odpowiada za proste obliczenia matematyczne
 * <p>
 *   dodawanie
 *   odejmowanie
 *   dzielenie
 *   mnożenie
 * <p>
 * Stwórz własny wyjątek który zabezpiecza dzielenie przez zero.
 * Sprawdź działanie programu.
 */

public class MainMathCalculation {
    public static void main(String[] args) {
        MathCalculation math = new MathCalculation();

        int a;
        int b;

        a = 20;
        b = 10;

        System.out.println(math.divide(a, b));

        a = 20;
        b = 00;

        try {
            System.out.println(math.divide(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Dzielisz przez zero !");
        }
    }
}