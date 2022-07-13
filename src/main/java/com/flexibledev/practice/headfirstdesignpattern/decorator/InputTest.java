package com.flexibledev.practice.headfirstdesignpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void run() {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));

            while ((c = inputStream.read()) >= 0) {
                System.out.println((char) c);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
    }
}
