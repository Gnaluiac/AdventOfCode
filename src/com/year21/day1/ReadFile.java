package com.year21.day1;

import com.year21.day2.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class ReadFile {
    public static int[] getSonarReadings() {
        URL filePath = Day1.class.getResource("input.txt");
        File input = new File(filePath.getFile());
        String[] readings = null;

        try {
            String data = "";

            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                data += scanner.nextLine();
                data += "\n";
            }

            readings = data.split("\n");

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] readingsAsIntegers = new int[readings.length];

        for (int i = 0; i < readings.length; i++) {
            readingsAsIntegers[i] = Integer.parseInt(readings[i]);
        }

        return readingsAsIntegers;
    }
}
