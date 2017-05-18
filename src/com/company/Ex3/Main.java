package com.company.Ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 * <p>
 * Stwórz 2 elementową tablicę.
 * Od użytkownika pobierz liczby całkowite i wpisz je w tablicę.
 * Pobierz 1,2,3 element tablicy .
 * Zabezpiecz program przez podaniem innej wartości niż liczba całkowita.
 * Zabezpiecz program przed pobraniem elementu z tablicy który nie istnieje .
 * Sprawdź działanie programu.
 */
public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[2];

        int liczbaCalkowita;

        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        try {
            System.out.println("Podaj pierwsza liczbe:");
            liczbaCalkowita = odczyt.nextInt();
            tablica[0] = liczbaCalkowita;

            System.out.println("Podaj drugą liczbe:");
            liczbaCalkowita = odczyt.nextInt();
            tablica[1] = liczbaCalkowita;

            System.out.println("Pobieram Tablice:");

            System.out.print("1:");
            liczbaCalkowita = tablica[0];
            System.out.println(liczbaCalkowita);

            System.out.print("2:");
            liczbaCalkowita = tablica[1];
            System.out.println(liczbaCalkowita);


            System.out.print("3:");
            liczbaCalkowita = tablica[2];
            System.out.println(liczbaCalkowita);

        } catch (InputMismatchException ex) {
            System.out.println("Error:Podana liczba/ciąg wyrazów nie jest liczbą całkowitą.");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error:Element w tablicy nie istnieje");
        }
    }
}