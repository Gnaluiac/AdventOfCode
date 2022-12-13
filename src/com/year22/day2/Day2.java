package com.year22.day2;

import java.util.Arrays;

public class Day2 {
    /**
     * 1st column (what opponent plays): A for Rock, B for Paper, and C for Scissors.
     * 2nd column (what we play): X for Rock, Y for Paper, and Z for Scissors.
     *
     * @param args
     */
    public static void main(String[] args) {
        var rounds = Arrays.stream(ReadFile.getInput()).toArray();
        int totalScore = 0;

        // Part 1
        for (var round : rounds) {
            int roundOutcome = roundOutcome(String.valueOf(round));
            totalScore += calculateScore(roundOutcome, String.valueOf(round).charAt(2));
        }
        System.out.println(String.format("Answer Part 1: %s", totalScore));

        // Part 2
        totalScore = 0;
        for (var round : rounds) {
            char shapeToPlay = calculateShapeToPlay(String.valueOf(round));
            StringBuilder playedRound = new StringBuilder(String.valueOf(round));
            playedRound.setCharAt(2, shapeToPlay);
            int roundOutcome = roundOutcome(String.valueOf(playedRound));
            totalScore += calculateScore(roundOutcome, String.valueOf(String.valueOf(playedRound)).charAt(2));
        }
        System.out.println(String.format("Answer Part 2: %s", totalScore));
    }

    private static int roundOutcome(String round) {
        if ((round.charAt(0) == 'A' && round.charAt(2) == 'X')
                || (round.charAt(0) == 'B' && round.charAt(2) == 'Y')
                || (round.charAt(0) == 'C' && round.charAt(2) == 'Z')) {
            return 3; // draw
        } else if ((round.charAt(0) == 'A' && round.charAt(2) == 'Z')
                || (round.charAt(0) == 'B' && round.charAt(2) == 'X')
                || (round.charAt(0) == 'C' && round.charAt(2) == 'Y')) {
            return 0; // lost
        } else {
            return 6; // won
        }
    }

    /**
     * The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
     * plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).
     * @param roundOutcome if we draw/lost/won the current round
     * @param chosenShape our chosen shape during the current round
     * @return the total score for the current round
     */
    private static int calculateScore(int roundOutcome, char chosenShape) {
        switch(chosenShape) {
            case 'X':
                return roundOutcome + 1;
            case 'Y':
                return roundOutcome + 2;
            case 'Z':
                return roundOutcome + 3;
            default:
                throw new RuntimeException();
        }
    }

    /**
     * Calculated the shape to play based on the opponent's shape choice and expected round outcome
     * @param opponentShape
     * @param roundOutcome X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win.
     * @return
     */
    private static char calculateShapeToPlay(String round) {
        if (round.charAt(2) == 'X') {
            switch (round.charAt(0)) {
                case 'A':
                    return 'Z';
                case 'B':
                    return 'X';
                case 'C':
                    return 'Y';
                default:
                    throw new RuntimeException();
            }
        } else if(round.charAt(2) == 'Y') {
            switch (round.charAt(0)) {
                case 'A':
                    return 'X';
                case 'B':
                    return 'Y';
                case 'C':
                    return 'Z';
                default:
                    throw new RuntimeException();
            }
        } else {
            switch (round.charAt(0)) {
                case 'A':
                    return 'Y';
                case 'B':
                    return 'Z';
                case 'C':
                    return 'X';
                default:
                    throw new RuntimeException();
            }
        }
    }

}
