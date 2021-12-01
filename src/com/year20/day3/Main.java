package com.year20.day3;

public class Main {
    public static void main(String[] args) {
        System.out.println("====PART 1=====");
        int trajectory1 = Travel.TobogganTrajectory(3, 1);

        System.out.println("\n====PART 2=====");
        int trajectory2 = Travel.TobogganTrajectory(1, 1);
        int trajectory3 = Travel.TobogganTrajectory(5, 1);
        int trajectory4 = Travel.TobogganTrajectory(7, 1);
        int trajectory5 = Travel.TobogganTrajectory(1, 2);

        long sum = (long) trajectory1 * trajectory2 * trajectory3 * trajectory4 * trajectory5;

        System.out.println("\nResult ==> " + sum);
    }
}

class Travel {
    public static int TobogganTrajectory(int rightMovement, int downMovement) {
        String[] map = Input.getMap();
//        String[] map = Input.getExampleMap();
        final int HORIZONTAL_LENGTH = map[0].length();
        int currentHorizontalPosition = 0;
        int treeCount = 0;

        for (int verticalMovement = downMovement; verticalMovement <= map.length - 1; verticalMovement += downMovement) {
            if ((currentHorizontalPosition + rightMovement) <= HORIZONTAL_LENGTH - 1) {
                currentHorizontalPosition += rightMovement;
            } else {
                currentHorizontalPosition = (currentHorizontalPosition + rightMovement) - HORIZONTAL_LENGTH;
            }

            if (map[verticalMovement].charAt(currentHorizontalPosition) == '#') {
                StringBuilder s = new StringBuilder(map[verticalMovement]);
                s.setCharAt(currentHorizontalPosition, 'X');
                map[verticalMovement] = s.toString();

                treeCount++;
            } else {
                StringBuilder s = new StringBuilder(map[verticalMovement]);
                s.setCharAt(currentHorizontalPosition, 'O');
                map[verticalMovement] = s.toString();
            }

            char test = map[verticalMovement].charAt(currentHorizontalPosition);
        }

        System.out.printf("Right %d, down %d: %d%n", rightMovement, downMovement, treeCount);

        // Draw map with trajectory
//        for (String line:map) {
//            System.out.println(line);
//        }

        return treeCount;
    }
}