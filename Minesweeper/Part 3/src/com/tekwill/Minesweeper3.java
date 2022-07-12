package com.tekwill;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Stage 3/5: Look around you
 */
public class Minesweeper3 {
    private static final int SIZE = 9;//1P
    public static final char MINE = 'M';//2P
    private static final char EMPTY = '*';//3P
    private static final Random RANDOM = new Random();//4P
    private final char[][] fields = new char[SIZE][SIZE];//5P
    private final Set<String> mines = new HashSet<>();//6p

    public Minesweeper3(int nrOfMines) {//7p
        for (char[] chars : fields) {
            Arrays.fill(chars, EMPTY);
        }
        generateMines(nrOfMines);
        showMinesAround();
    }

    private void showMinesAround() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!mines.contains(coordsToString(i, j))) {
                    int nrOfMines = getNrOfMinesAround(i, j);
                    if (nrOfMines != 0) {
                        fields[i][j] = Character.forDigit(nrOfMines, 10);
                    }
                }

            }
        }
    }

    private int getNrOfMinesAround(int i, int j) {//11p
        int nrOfMines = 0;
        for (int a = i - 1; a <= i + 1; a++) {
            for (int b = j - 1; b <= j + 1; b++) {
                if (a >= 0 && b >= 0 && a < SIZE && b < SIZE && !(a == i && b == j) && mines.contains(coordsToString(a, b))) {
                    nrOfMines++;
                }
            }

        }
        return nrOfMines;
    }

    private void generateMines(int nrOfMines) {//10p
        while (mines.size() < nrOfMines) {
            int i = RANDOM.nextInt(SIZE);
            int j = RANDOM.nextInt(SIZE);
            String coords = coordsToString(i, j);
            mines.add(coords);
        }
        for (String mine : mines) {
            String[] split = mine.split("");
            int i = Integer.parseInt(split[0]);
            int j = Integer.parseInt(split[1]);
            fields[i][j] = MINE;
        }
    }

    private String coordsToString(int i, int j) {//9p
        return String.valueOf(i) + j;
    }

    @Override //8p
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] chars : fields) {
            for (char aChar : chars) {
                stringBuilder.append(aChar);
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}