package com.year21.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<String[]> getInput() {
        List<String[]> plannedCourse = new ArrayList<>();

        URL filePath = Day2.class.getResource("input.txt");
        File input = new File(filePath.getFile());

        try {
            String data = "";

            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                data += scanner.nextLine();
                data += "\n";
            }

            scanner.close();

            String[] s = data.split("\n");

            for (String movement : s) {
                String[] splitMovement = movement.split(" ");
                plannedCourse.add(splitMovement);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return plannedCourse;
    }
}
