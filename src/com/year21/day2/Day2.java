package com.year21.day2;

import java.util.List;

public class Day2 {
    public static void main(String[] args) {
        final List<String[]> PLANNED_COURSE = ReadFile.getInput();

        // Part 1
        int depthPt1 = 0, horizontalPositionPt1 = 0;

        for (String[] movement : PLANNED_COURSE) {
            switch (movement[0]) {
                case "forward" -> horizontalPositionPt1 += Integer.parseInt(movement[1]);
                case "up" -> depthPt1 -= Integer.parseInt(movement[1]);
                case "down" -> depthPt1 += Integer.parseInt(movement[1]);
            }
        }

        System.out.println("====PART 1====");
        System.out.println("Depth: " + depthPt1 + "\n"
                + "Horizontal position: " + horizontalPositionPt1 + "\n"
                + "Result ==> " + (depthPt1 * horizontalPositionPt1) + "\n");

        // Part 2
        int depthPt2 = 0, horizontalPositionPt2 = 0, aim = 0;

        for (String[] movement : PLANNED_COURSE) {
            switch (movement[0]) {
                case "forward":
                    horizontalPositionPt2 += Integer.parseInt(movement[1]);
                    depthPt2 += (aim * Integer.parseInt(movement[1]));
                    break;
                case "up":
                    aim -= Integer.parseInt(movement[1]);
                    break;
                case "down":
                    aim += Integer.parseInt(movement[1]);
                    break;
            }
        }

        System.out.println("====PART 2====");
        System.out.println("Depth: " + depthPt2 + "\n"
                + "Horizontal position: " + horizontalPositionPt2 + "\n"
                + "Aim: " + aim + "\n"
                + "Result ==> " + ((long) depthPt2 * horizontalPositionPt2));
    }
}
