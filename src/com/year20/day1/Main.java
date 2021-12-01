package com.year20.day1;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final List<Integer> INPUT = new Input().getInputAsIntegerList();
        final int VALUE_TO_FIND = 2020;

        System.out.println("====PART 1====");
        for (int i = 0; i < INPUT.size(); i++) {
            for (int n = i + 1; n < INPUT.size(); n++) {
                if (INPUT.get(i) + INPUT.get(n) == VALUE_TO_FIND) {
                    System.out.println("Number 1: " + INPUT.get(i));
                    System.out.println("Number 2: " + INPUT.get(n));
                    System.out.println("Answer: " + (INPUT.get(i) * INPUT.get(n)) + "\n");
                }
            }
        }

        System.out.println("====PART 2====");
        for (int i = 0; i < INPUT.size(); i++) {
            for (int n = i + 1; n < INPUT.size(); n++) {
                for (int x = n + 1; x < INPUT.size(); x++) {
                    if ((INPUT.get(i) + INPUT.get(n) + INPUT.get(x)) == VALUE_TO_FIND) {
                        System.out.println("Number 1: " + INPUT.get(i));
                        System.out.println("Number 2: " + INPUT.get(n));
                        System.out.println("Number 3: " + INPUT.get(x));
                        System.out.println("Answer: " + (INPUT.get(i) * INPUT.get(n) * INPUT.get(x)));
                    }
                }
            }
        }
    }
}