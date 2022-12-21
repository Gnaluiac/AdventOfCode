package com.year22.day3;

import java.util.ArrayList;
import java.util.List;

public class Day3 {
    public static void main(String[] args) {
        String[] input = ReadFile.getInput();
        List<String[]> splitInputList = new ArrayList<>();
        int sumOfPriorities = 0;

        // Part 1
        for (String i : input) {
            splitInputList.add(splitStringEqually(i));
        }

        for (String[] s : splitInputList) {
            boolean itemFound = false;
            for (int i = 0; i < s[0].length(); i++) {
                for (int n = 0; n < s[1].length(); n++) {
                    if (s[0].charAt(i) == s[1].charAt(n)) {
                        sumOfPriorities += calculatePriority(s[0].charAt(i));
                        itemFound = true;
                        break;
                    }
                }
                if (itemFound) {
                    break;
                }
            }
        }
        System.out.printf("Answer Part 1: %s%n", sumOfPriorities);

        // Part 2
        sumOfPriorities = 0;
        for (int i = 0; i < input.length; i = i + 3) {
            for (int n = 0; n < input[i].length(); n++) {
                if (input[i + 1].contains(String.valueOf(input[i].charAt(n)))
                        && input[i + 2].contains(String.valueOf(input[i].charAt(n)))) {
                    sumOfPriorities += calculatePriority(input[i].charAt(n));
                    break;
                }
            }
        }
        System.out.printf("Answer Part 2: %s%n", sumOfPriorities);
    }

    private static String[] splitStringEqually(String value) {
        int size = value.length();
        String[] splitValue = {value.substring(0, size / 2), value.substring(size / 2, size)};
        return splitValue;
    }

    /**
     * If ASCII value of char < 97 --> upper case letter (from 65 to 90)
     * else --> lower case letter
     *
     * @param item
     * @return
     */
    private static int calculatePriority(char item) {
        return (int) item < 97 ? (int) item - 38 : (int) item - 96;
    }
}
