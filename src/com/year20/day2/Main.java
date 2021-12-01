package com.year20.day2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String[]> INPUT = new Input().getInputAsStringList();
        int validPasswordCountPt1 = 0;

        for (String[] element: INPUT) {
            String[] numberTimes = element[0].split("-");

            int min = Integer.valueOf(numberTimes[0]);
            int max = Integer.valueOf(numberTimes[1]);

            char charToCheck = element[1].charAt(0);
            char[] pwdAsChars = element[2].toCharArray();

            int charsFound = 0;
            for (char c: pwdAsChars) {
                if (c == charToCheck){
                    charsFound ++;
                }
            }

            if (charsFound <= max && charsFound >= min){
                validPasswordCountPt1++;
            }
        }

        System.out.println("==== PART 1=====");
        System.out.println("Amount of valid passwords: " + validPasswordCountPt1 + "\n");

        int validPasswordCountPt2 = 0;

        for (String[] element: INPUT) {
            String[] numberTimes = element[0].split("-");

            int charPositionOne = Integer.valueOf(numberTimes[0]) - 1;
            int charPositionTwo = Integer.valueOf(numberTimes[1]) - 1;

            char charToCheck = element[1].charAt(0);
            char[] pwdAsChars = element[2].toCharArray();

            if ((pwdAsChars[charPositionOne] == charToCheck && pwdAsChars[charPositionTwo] != charToCheck)
                || (pwdAsChars[charPositionOne] != charToCheck && pwdAsChars[charPositionTwo] == charToCheck)) {
                validPasswordCountPt2++;
            }
        }
        System.out.println("==== PART 2=====");
        System.out.println("Amount of valid passwords: " + validPasswordCountPt2);
    }
}