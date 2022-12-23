package com.year22.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class ReadFile {
    public static String[] getInput() {
        URL filePath = Day4.class.getResource("input.txt");
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
