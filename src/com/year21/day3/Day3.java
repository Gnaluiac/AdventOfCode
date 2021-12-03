package com.year21.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Day3 {
    final static String[] DIAGNOSTIC_REPORT = ReadFile.getDiagnosticReport();
    final static int BINARY_NUMBER_LENGTH = DIAGNOSTIC_REPORT != null ? DIAGNOSTIC_REPORT[0].length() : 0;

    public static void main(String[] args) {
        // Part 1
        StringBuilder gammaRate = new StringBuilder(), epsilonRate = new StringBuilder();

        for (int i = 0; i < BINARY_NUMBER_LENGTH; i++) {
            int zeroCount = 0, oneCount = 0;

            for (String binaryNumbers : DIAGNOSTIC_REPORT != null ? DIAGNOSTIC_REPORT : new String[0]) {
                if (binaryNumbers.charAt(i) == '0')
                    zeroCount++;
                else
                    oneCount++;
            }

            if (zeroCount > oneCount) {
                gammaRate.append("0");
                epsilonRate.append("1");
            } else {
                gammaRate.append("1");
                epsilonRate.append("0");
            }
        }

        int gammaRateDecimal = Integer.parseInt(String.valueOf(gammaRate), 2);
        int epsilonRateDecimal = Integer.parseInt(String.valueOf(epsilonRate), 2);

        System.out.println("====PART 1====");
        System.out.println("Gamma rate: " + gammaRate + " = " + gammaRateDecimal);
        System.out.println("Epsilon rate: " + epsilonRate + " = " + epsilonRateDecimal);
        System.out.println("Power consumption: " + (gammaRateDecimal * epsilonRateDecimal) + "\n");

        // Part 2

        int oxygenGeneratorRating = getRating("Oxygen");
        int co2ScrubberRating = getRating("CO2");

        System.out.println("====PART 2====");
        System.out.println("Oxygen generator rating: " + oxygenGeneratorRating + "\n"
                + "CO2 scrubber rating: " + co2ScrubberRating + "\n"
                + "Life support rating: " + (oxygenGeneratorRating * co2ScrubberRating));
    }

    public static int getRating(String type) {
        List<String> binaryNumbersToKeep = Arrays.stream(DIAGNOSTIC_REPORT != null ?
                DIAGNOSTIC_REPORT : new String[0]).toList();

        for (int i = 0; i < BINARY_NUMBER_LENGTH; i++) {
            List<String> buffer = new ArrayList<>();
            int zeroCount = 0, oneCount = 0;

            for (String binaryNumbers : binaryNumbersToKeep) {
                if (binaryNumbers.charAt(i) == '0')
                    zeroCount++;
                else
                    oneCount++;
            }

            if (zeroCount > oneCount) {
                for (String binaryNumbers : binaryNumbersToKeep) {
                    if (Objects.equals(type, "Oxygen")) {
                        if (binaryNumbers.charAt(i) == '0') {
                            buffer.add(binaryNumbers);
                        }
                    } else if (Objects.equals(type, "CO2")) {
                        if (binaryNumbers.charAt(i) == '1') {
                            buffer.add(binaryNumbers);
                        }
                    }
                }
            } else {
                for (String binaryNumbers : binaryNumbersToKeep) {
                    if (Objects.equals(type, "Oxygen")) {
                        if (binaryNumbers.charAt(i) == '1') {
                            buffer.add(binaryNumbers);
                        }
                    } else if (Objects.equals(type, "CO2")) {
                        if (binaryNumbers.charAt(i) == '0') {
                            buffer.add(binaryNumbers);
                        }
                    }
                }
            }

            binaryNumbersToKeep = buffer;

            if (buffer.size() == 1)
                break;
        }

        return Integer.parseInt(String.valueOf(binaryNumbersToKeep.get(0)), 2);
    }
}
