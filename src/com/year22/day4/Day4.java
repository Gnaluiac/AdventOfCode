package com.year22.day4;

public class Day4 {
    public static void main(String[] args) {
        String[] input = ReadFile.getInput();
        int fullyContained = 0, overlaps = 0;

        // Part 1 & 2
        for (String pair : input) {
            String[] parts = pair.split(",");
            int[] elf1 = {Integer.parseInt(parts[0].split("-")[0]), Integer.parseInt(parts[0].split("-")[1])};
            int[] elf2 = {Integer.parseInt(parts[1].split("-")[0]), Integer.parseInt(parts[1].split("-")[1])};

            if ((elf1[0] >= elf2[0] && elf1[1] <= elf2[1]) || (elf2[0] >= elf1[0] && elf2[1] <= elf1[1])) {
                fullyContained++;
            }

            if ((elf1[0] >= elf2[0] && elf1[0] <= elf2[1]) || (elf1[1] >= elf2[0] && elf1[1] <= elf2[1])
                    || (elf2[0] >= elf1[0] && elf2[0] <= elf1[1]) || (elf2[1] >= elf1[0] && elf2[1] <= elf1[1])) {
                overlaps++;
            }
        }
        System.out.printf("Answer Part 1: %s%n", fullyContained);
        System.out.printf("Answer Part 2: %s%n", overlaps);
    }

}
