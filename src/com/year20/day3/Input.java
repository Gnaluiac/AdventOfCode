package com.year20.day3;

import java.util.List;

public class Input {
    private static String input =
                    "..#.#...#.#.#.##.....###.#....#\n" +
                    "...........##.#...#.#..........\n" +
                    "....#.....#..#.............#...\n" +
                    ".#....###..##...#...##...#.#..#\n" +
                    "#.......#.........#..#.......#.\n" +
                    "...#.##..##...#.#......#.##.#..\n" +
                    "#.#..##.....#.....#..##........\n" +
                    "...#.####...#.##...#...........\n" +
                    ".#...#..#..#....#.#.#.#.##.....\n" +
                    "##.#..#.##..#......#..##.#.#..#\n" +
                    ".#.##.....#.#...............#.#\n" +
                    "..##.#.....#.....##..##.#....#.\n" +
                    "#..#..........#...##........#..\n" +
                    "#..##.#.#...............#..#...\n" +
                    "..#....#...#.......#.......#...\n" +
                    ".........#.#.##.#........#.....\n" +
                    "#...##....#..#.........#.#...##\n" +
                    "...#.#...#...........#..#...#..\n" +
                    "...#..#........#...#...........\n" +
                    ".#....##.#...#.#....#....##....\n" +
                    "...#...#......#.#.......#...##.\n" +
                    "####..........##....#..........\n" +
                    "#..#...........................\n" +
                    "#....#...####..##.#......#.#...\n" +
                    "..#..#.....##.....#...#....#..#\n" +
                    "#.##......#..##........#.......\n" +
                    "..........#.....#...#.#.#....##\n" +
                    "....##...##..#........#...#..#.\n" +
                    "#..#..#...##..............##...\n" +
                    "###.##..##.###...#....##.#..#..\n" +
                    ".#......#.................#.#..\n" +
                    "#.#..#.##.#.#.#.....#.........#\n" +
                    "..##......#.......##........#..\n" +
                    "#..............#.##.#.....#....\n" +
                    "............................##.\n" +
                    "..#.##......#..........#....#..\n" +
                    "..##.....#..##.#....#.......##.\n" +
                    "..#.#.##.#.........#...........\n" +
                    "...........##.#.#...#......###.\n" +
                    "#....#...#........#.#...#.#.###\n" +
                    "..............#...#.....##....#\n" +
                    "#...#...#..............#..#...#\n" +
                    ".##..#.........#.##.#..#...##..\n" +
                    ".....#.........#..#..#.......#.\n" +
                    ".#......#.#.#....##..#...#..##.\n" +
                    "#....................#.#....#..\n" +
                    "......#.....##............#....\n" +
                    ".#.....#......####.....#....##.\n" +
                    "##.####.#..#..........#......#.\n" +
                    "##....................#..##....\n" +
                    ".....#...#.#.##.#.###.....#....\n" +
                    ".#..#...####.#.#...#.#.....#...\n" +
                    "#.....##.........##.##.##.....#\n" +
                    "....#....##.###.........#...###\n" +
                    ".......#........#.##.....#####.\n" +
                    "...#.##..#...#...####.....##...\n" +
                    "..#....#....#......#......#.#..\n" +
                    "...#.#.#.........#.......#..#..\n" +
                    ".....#...........#.#........##.\n" +
                    "..##...#.#.##.#.#.#...###.#....\n" +
                    "..##.............###....#.#....\n" +
                    "#.......#....#..#...#..##..#...\n" +
                    "....##..#.......####....#..#.##\n" +
                    "##....#...#.#.#...#...#........\n" +
                    "....#.#................#...#...\n" +
                    "...#.....#.#.......##....#.#..#\n" +
                    "#....##.#...#.#..#.#.........#.\n" +
                    "#..##.........##.....#...#.....\n" +
                    "....#.....#.#..#..##..##.##...#\n" +
                    "#.....#...#.#.#.##....#.#.##...\n" +
                    ".#.#........#..##.......#...#.#\n" +
                    "..###.....#..#.##....#...#....#\n" +
                    "...#..###...#...#.......#..#...\n" +
                    ".#....##.......#.#..........##.\n" +
                    "...#.#.............##.....##...\n" +
                    "..#..#...#.....#...#...........\n" +
                    ".#.#......#.##....#.....#......\n" +
                    "........#.#.....#.#...#..#.#..#\n" +
                    "#.....#.#.....#.##..#.#....#.#.\n" +
                    "..#..###.#.#........#.....##..#\n" +
                    "#.#....#......#.#....###..#...#\n" +
                    "...#.#....#..#.##.....#...#....\n" +
                    "....##....#.#...#.........#..##\n" +
                    ".#......#...#.............#..#.\n" +
                    "#........#........#.#.....##...\n" +
                    "..##..#.##..#........#.........\n" +
                    ".....#...#...#..#.....#.#.##.#.\n" +
                    "..#..#..#.........#...#.......#\n" +
                    "....#.....#.......#.##.#.##..##\n" +
                    "......#.......##...#......#....\n" +
                    "....#....##.......###.#......#.\n" +
                    ".....#..#.#........#....#.....#\n" +
                    "#...#...#....#...###........#..\n" +
                    "#...........####.......#.#..#.#\n" +
                    "..###....#..........#...#.###..\n" +
                    "....#.#.....#....#..#.....#.##.\n" +
                    "...##.#..#..#.......#......#.#.\n" +
                    "....#......###..#.....#.....#..\n" +
                    ".....#.#.#.....#.##.#....####..\n" +
                    ".##....#.....#.#....##..#......\n" +
                    "#..#.....#..#...#....#.#.......\n" +
                    ".##.#..####..#.##.#......#.....\n" +
                    "......#....#.......##.##....#..\n" +
                    "...#....#....#..##.......##.###\n" +
                    "..##..........##.............#.\n" +
                    ".#...#.#...##..##.....#..#.....\n" +
                    "....#.#.##...................#.\n" +
                    ".......#.#..#....#.....#.......\n" +
                    ".#.#..#....####...#.#.##....#..\n" +
                    ".#.##...#..#..#...#.#.......#..\n" +
                    "##.#.....##.........#.......#..\n" +
                    ".##...#.....#.........##.#....#\n" +
                    ".............#..#............##\n" +
                    "...##.......#.....#.......#.##.\n" +
                    "##..##.........................\n" +
                    ".##.#........#........#........\n" +
                    ".....#................#.#......\n" +
                    ".............#....#....##....#.\n" +
                    "#..##...##...#..#.#............\n" +
                    ".......#...####.#..#..#.....##.\n" +
                    "..#.#..#......#.....#.#.#.....#\n" +
                    "...#..##........#..#.#....#.#..\n" +
                    ".#.....#..###..#....#.##.#...#.\n" +
                    "#.#..#.##.#..#......#.###...#..\n" +
                    "##..#.#..###....##.#...#...##.#\n" +
                    "##..#.........#...##......#....\n" +
                    "#.#...#.#..#..........#.......#\n" +
                    ".......#.#.......#.....##..#...\n" +
                    "........#..##............##.#..\n" +
                    "........##.....#........#..#...\n" +
                    "#..##.#..###......##...........\n" +
                    "..#.....#.#.#....#...#.#..#..##\n" +
                    "#...............#.......#.#.##.\n" +
                    "#..#.....#....#............#.#.\n" +
                    "...#....#...#....#..#..###.....\n" +
                    "..#....#.#.....#..#......##.#.#\n" +
                    ".#.#....#..#...#....#........#.\n" +
                    "..##....##....#.....#.#........\n" +
                    ".#...#....##..##.....##.....##.\n" +
                    ".#...........#....##...##.#....\n" +
                    "...#.....#......###.##.#.......\n" +
                    "......#.#..##.#.#....#...#...##\n" +
                    "....#...###.##....#.#.....#....\n" +
                    ".......#.....#......#.....##..#\n" +
                    ".####.#...##..#....#...........\n" +
                    "................###...#....#..#\n" +
                    "...#...#.....###.#.##.......#..\n" +
                    "..#....#...##...#.###......#.#.\n" +
                    "#...#......#............#.....#\n" +
                    "#.........#...............#..#.\n" +
                    "...#.##.....#............#.....\n" +
                    "........#......##..#..#..#.#..#\n" +
                    "....#....#.....#.#.....##..#...\n" +
                    ".....#....#..##.....#..........\n" +
                    ".##....#..#...........##.......\n" +
                    "#......##.....#...#.....#......\n" +
                    "...#.....#......#.#....#.......\n" +
                    "...#................##...#..#..\n" +
                    "........#..........#....#......\n" +
                    "......#....#.#.#...........#.#.\n" +
                    ".#............#....##.......##.\n" +
                    "#.......#.....#...##.#..##.....\n" +
                    ".#.....#.##..#..#....#.#..#.#.#\n" +
                    "....#...............###........\n" +
                    "#####...........#..#.......#..#\n" +
                    "...#.......#...#.#............#\n" +
                    "#...#..#.#...#.#...#.##.....##.\n" +
                    ".#..#..#..#.....#....#...#.....\n" +
                    ".#...#......#.......#.........#\n" +
                    ".#....#.....#...#...#..#....#..\n" +
                    "#....#....#.......#.....##.....\n" +
                    ".#...#.#.##.#....#..##........#\n" +
                    "..##...#............#..........\n" +
                    "..........#..#..#...#....#.....\n" +
                    "..#.......#....#.....##..##....\n" +
                    ".#...#......#...#..###...#...#.\n" +
                    "..##...#......#...#.#.#...#....\n" +
                    ".....#..#.#.#.#.#...#....##..#.\n" +
                    "##..#..##....#.#........##.#...\n" +
                    ".##..#.#...##..#....#..#.......\n" +
                    ".....#...#...#..#.#..#......#..\n" +
                    ".#.....##.##..#....####..#....#\n" +
                    "......##.................#....#\n" +
                    "....##.......###...#.##...##.#.\n" +
                    "...#...#.................##.#..\n" +
                    ".#.....##...#...#.....#.....##.\n" +
                    "##.........####..#...#...#....#\n" +
                    "...##.....#......#.###..#......\n" +
                    ".....###..##.#.......###..##...\n" +
                    "#....#...#.#...#...#.#....#..#.\n" +
                    "#...#.........##.#.........###.\n" +
                    "#....#..###..........##........\n" +
                    ".###.....#.#.....#........##..#\n" +
                    "....#.........##..#..#.#.#..#..\n" +
                    "..#......#...........#..##...#.\n" +
                    "...#.#..#..#...#.##..#..#.....#\n" +
                    ".#...#...#....................#\n" +
                    "..#..##..#.............#.....#.\n" +
                    ".....###.#.#.#...##..#.##....#.\n" +
                    "..#...####..##.#....#...#...#..\n" +
                    ".....#..#........#.#.#..#.##...\n" +
                    "#.#.........####..#...#.#......\n" +
                    "..............#..#........#....\n" +
                    "....#........#......#.........#\n" +
                    "#..#.##......#.#.......#....#..\n" +
                    "....#..............#.#.#..#....\n" +
                    "#.#......#.....##.......#..##..\n" +
                    ".#.#..........#....#......#....\n" +
                    ".....#.......#.##.....#......##\n" +
                    "...#...#.##.............####...\n" +
                    "..#....##...#...##..#.#..##.#..\n" +
                    "..#.........##.......###.#.....\n" +
                    "..#.........#####..##...#......\n" +
                    "..#.#...#.......#.####......##.\n" +
                    "......#.#.#....#......####....#\n" +
                    ".###...........#...#..#..#..##.\n" +
                    "..#...#..##.##...#.#.##.....#..\n" +
                    ".....#..#....##.......#...#....\n" +
                    "......#.....#.........#..#..#..\n" +
                    "...#..#.........##.....##.#...#\n" +
                    "....##...#......#..#.....#.....\n" +
                    "....#..#....#....#........##...\n" +
                    "##.....#.......#.....#.#.#..#..\n" +
                    ".....#..##.....##.##.#.........\n" +
                    ".#.#..##.............#.#.......\n" +
                    "......#.##.#.....#.#......#..#.\n" +
                    "..........#.#..#....#.#.#.#..##\n" +
                    "...##.....#..#...#...#...##....\n" +
                    "........#.#......#..###..#.....\n" +
                    "..#.##......#.......#.......#..\n" +
                    "...#....##.##.........#.#......\n" +
                    "......#....#.#.........#......#\n" +
                    ".....#...#....#...#......#..#..\n" +
                    ".##...#......#.........#...#.#.\n" +
                    "..#.#.#......#....#............\n" +
                    "..#.....##.............#.##.##.\n" +
                    "#......#......#...##.......#.#.\n" +
                    "##........#.....#..............\n" +
                    ".#.###.................#.#....#\n" +
                    "........##.#..##........#.#....\n" +
                    ".......###...#...##.#..#....#..\n" +
                    ".#..#....#..#......##......#...\n" +
                    ".#...#....#..........##..##.#..\n" +
                    ".#..###.......#............#...\n" +
                    "...#.....###.#..#........#.#.#.\n" +
                    "...#....#..#.##..........#.#.#.\n" +
                    ".#..##..#.....#...........#....\n" +
                    "#...#...##....#..#....##.......\n" +
                    "#..#......#................#...\n" +
                    "#..##....#.#..#......#.#.#.....\n" +
                    "##.#..#...#.....#.#...#......##\n" +
                    "#....#.#.#....#.....##.....##..\n" +
                    "....#...##.#...####.#.#.#.#..#.\n" +
                    ".....#.#....#..#.....#..#......\n" +
                    ".........#.#...................\n" +
                    "........#.....####......#..#..#\n" +
                    ".#.#.##.#...#.#......#...##.##.\n" +
                    ".#......#.#.#...#..#.......#...\n" +
                    "..#......#.##.##.#.#....#......\n" +
                    "..........#.#...###............\n" +
                    ".##..#..#.#.#..#.....#..#.#....\n" +
                    "......#.......#.#..#.#....#...#\n" +
                    ".#.......###......#...#.#.#....\n" +
                    ".............##..#..#...#....#.\n" +
                    "....#......#.#...#.#...#...#...\n" +
                    "..#....#.......#.#..#..#.#..#.#\n" +
                    ".#..#.#...#.....#.#...#####...#\n" +
                    ".##............#....#..........\n" +
                    "#.......####...#.#.#...........\n" +
                    "...#.......##.#..........#....#\n" +
                    "..#.#......#.......##.....#..##\n" +
                    "#......#.###..#......#......#.#\n" +
                    "##....#..#....#.##....#..#.....\n" +
                    "...##...#.#....#.#.......#.....\n" +
                    "#...####....#..#.#..#.##....###\n" +
                    ".....#..#..........###..#......\n" +
                    ".#..#..#...#....#.##..#..#.....\n" +
                    "#..#.....#....#..#.##...##.....\n" +
                    ".....###.#..#.......#...###.##.\n" +
                    "#..#........#.#..#.#.........#.\n" +
                    "....##........................#\n" +
                    ".#....#.#.#.#.#...#......#....#\n" +
                    "#....#...#.##.......#.#.###....\n" +
                    "..........###..##....#..##.#...\n" +
                    "...##..###...#.#.#.......##...#\n" +
                    "##.#...#..#.....###....#.......\n" +
                    "..#..##....###........##....###\n" +
                    ".....##..#...#..#.....#..#....#\n" +
                    "#................#....#...#..##\n" +
                    "#....#.#....#..###.#.#...#..#.#\n" +
                    "........##.#...#.#.#.#...#.....\n" +
                    "..#..###....#......##.#...##...\n" +
                    "..#..##....#.##..#.....#.....#.\n" +
                    ".#.#...#.....#..#..#......##.#.\n" +
                    "........#.#...#..##....#..#....\n" +
                    "...##...#...#...#...##...##..#.\n" +
                    ".......#..#..#....#.#..#...##..\n" +
                    ".#.....#.##........#...#.#.....\n" +
                    "##.#..#....#.#....#.#....#...#.\n" +
                    "..#.#......#.......##...#....#.\n" +
                    "#.#..####..#........#.......###\n" +
                    "....#.......#.......##.#...#.#.\n" +
                    "..#..#.#.............#..#......\n" +
                    "........###.....##....#.......#\n" +
                    "...#.....#...#...#....#.###....\n" +
                    "#...##.#........#..#...##..#..#\n" +
                    "...##..#....#....#.#.#...#.#...\n" +
                    "#......#.....#....###......##..\n" +
                    ".....#.........####...##..#....\n" +
                    ".......#...##...#..#..#.#......\n" +
                    ".#.#....#.....#.......#........\n" +
                    "...##...#....##..#.....###.....\n" +
                    ".#....#........##......#....#.#\n" +
                    ".........#.#.#.#...........#.#.\n" +
                    "....#.#..##......#.#.#..##.....\n" +
                    ".........#.....##....#.........\n" +
                    "....#.............#...........#\n" +
                    "...#..##........#.....###......\n" +
                    "#....#....#......#..#..#..#.#..\n" +
                    "#......##.....#..#....#..#.#...\n" +
                    "#..............#....#.#....###.\n" +
                    "..##..#..#...#...##........##..\n" +
                    "..#.##....#..#......###..#.....\n";

    private static String exampleInput =
                    "..##.......\n" +
                    "#...#...#..\n" +
                    ".#....#..#.\n" +
                    "..#.#...#.#\n" +
                    ".#...##..#.\n" +
                    "..#.##.....\n" +
                    ".#.#.#....#\n" +
                    ".#........#\n" +
                    "#.##...#...\n" +
                    "#...##....#\n" +
                    ".#..#...#.#";

    public static String[] getMap(){ return input.split("\n"); }
    public static String[] getExampleMap(){ return exampleInput.split("\n"); }
}
