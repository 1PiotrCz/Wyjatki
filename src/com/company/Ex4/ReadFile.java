package com.company.Ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Piotr Czubkowski on 2017-05-18.
 */
public class ReadFile {
    public void read() throws FileNotFoundException {
        File file = new File("C:/test.txt");
        Scanner in = new Scanner(file);

        String linijka = in.nextLine();
        System.out.println(linijka);
    }

}