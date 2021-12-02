package com.year21.day1;

public class Day1 {
    public static void main(String[] args) {
        final int[] SONAR_READINGS = ReadFile.getSonarReadings();

        // PART 1
        int increaseCountPt1 = 0;

        // Start with i = 1 (= 2nd reading) to compare with first reading (i = 0)
        for (int i = 1; i < SONAR_READINGS.length; i++){
            if (SONAR_READINGS[i] > SONAR_READINGS[i - 1])
                increaseCountPt1++;
        }

        System.out.println("====PART 1=====");
        System.out.println("Increases: " + increaseCountPt1 + "\n");

        // PART 2
        int sumCurrent = 0, sumPrevious = 0;
        int increaseCountPt2 = 0;

        for (int i = 0; i < SONAR_READINGS.length; i++){
            if (SONAR_READINGS.length - i >= 3) {
                sumCurrent = SONAR_READINGS[i] + SONAR_READINGS[i + 1] + SONAR_READINGS[i + 2];

                if ((sumCurrent > sumPrevious) && sumPrevious > 0) {
                    increaseCountPt2++;
                }

                sumPrevious = sumCurrent;
            } else {
                break;
            }
        }

        System.out.println("====PART 2=====");
        System.out.println("Increases: " + increaseCountPt2);
    }
}
