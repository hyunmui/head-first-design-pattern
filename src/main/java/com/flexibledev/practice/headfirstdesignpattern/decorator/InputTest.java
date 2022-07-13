package com.flexibledev.practice.headfirstdesignpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

public class InputTest {

    public static void run() {
        int c;
        try {
            ClassPathResource res = new ClassPathResource("text.txt");

            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(res.getFile().getAbsolutePath())));

            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            ;
        }
    }
}
