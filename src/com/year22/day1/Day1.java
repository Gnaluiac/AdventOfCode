package com.year22.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        String[] input = ReadFile.getInput();
        List<Integer> caloriesPerElf = new ArrayList<>();
        Integer totalCaloriesForElf = 0;

        for(String calories : input) {
            if(!calories.equals("")) {
                totalCaloriesForElf += Integer.parseInt(calories);
            } else {
                caloriesPerElf.add(totalCaloriesForElf);
                totalCaloriesForElf = 0;
            }
        }
        Collections.sort(caloriesPerElf, Collections.reverseOrder());
        System.out.println(String.format("Answer Part 1: %s", caloriesPerElf.get(0)));

        Integer totalTop3Calories = caloriesPerElf.get(0) + caloriesPerElf.get(1) + caloriesPerElf.get(2);
        System.out.println(String.format("Answer Part 2: %s", totalTop3Calories));

    }

}
