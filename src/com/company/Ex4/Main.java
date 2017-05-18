package com.company.Ex4;

import java.io.FileNotFoundException;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 * <p>
 * Stwórz klasę która odczytuje dane z dowolnego pliku.
 * Zabezpiecz program przed brakiem pliku w klasie która wywołuje metodę.
 */


public class Main {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        try {
            rf.read();
        } catch (FileNotFoundException ex) {
            System.out.println("Brak pliku");
        }
    }
}