package com.company.Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 * <p>
 * Stwórz program który pobiera od użytkownika liczbę całkowitą
 * Zabezpiecz program przed podaniem innej wartości  niż  liczba całkowita.
 * Sprawdź działanie programu.
 */

public class Main {
    public static void main(String[] args) {


        int liczbaCalkowita;
        System.out.println("Podaj liczbe całkowitą");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        try

        {
            liczbaCalkowita = odczyt.nextInt();
            System.out.println("Moja podana liczba całkowita to : " + liczbaCalkowita);
        } catch (InputMismatchException ex) {
            System.out.println("Podana liczba/ciąg wyrazów nie jest liczbą całkowitą.");
        }
    }
}