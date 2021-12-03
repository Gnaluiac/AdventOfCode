package com.year21.day3;

import com.year21.day2.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ReadFile {

    public static String[] getDiagnosticReport() {
//        URL filePath = Day3.class.getResource("input.txt");
        URL filePath = Day3.class.getResource("exampleInput.txt");
        File input = new File(Objects.requireNonNull(filePath).getFile());

        try {
            StringBuilder data = new StringBuilder();

            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                data.append(scanner.nextLine());
                data.append("\n");
            }

            scanner.close();
            return data.toString().split("\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }





}
