package com.example.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.example.util.MyFileUtils;

public class Testarw {
    public static void main(String[] args) {
        File text = new File("text.txt");

        try (FileReader fileReader = new FileReader(text);
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("Problem reading the file" + text.getName());
        }

        MyFileUtils myUtil = new MyFileUtils();

        try {
            System.out.println(myUtil.subtract10FromLargerNumber(1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
