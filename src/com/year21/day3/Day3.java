package com.year21.day3;

public class Day3 {
    public static void main(String[] args) {
        final String[] DIAGNOSTIC_REPORT = ReadFile.getDiagnosticReport();

        // Part 1
        final int BINARY_NUMBER_LENGTH = DIAGNOSTIC_REPORT != null ? DIAGNOSTIC_REPORT[0].length() : 0;
        StringBuilder gammaRate = new StringBuilder(), epsilonRate = new StringBuilder();

        for (int i = 0; i < BINARY_NUMBER_LENGTH; i++) {
            int zeroCount = 0, oneCount = 0;

            for (String binaryNumbers : DIAGNOSTIC_REPORT) {
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
        System.out.println("Power consumption: " + (gammaRateDecimal * epsilonRateDecimal));

        // Part 2
        //TODO


    }
}
