package com.tekwill;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Stage 4/5: Prepare for battle
 */
public class Minesweeper4 {
    private static final int SIZE = 9;//1
    private static final char EMPTY = '_';//2
    private static final char FLAG = '*';//3
    private static final Random RANDOM = new Random();//4
    private final char[][] fields = new char[SIZE][SIZE];//5
    private final Set<String> mines = new HashSet<>();//6
    private final Set<String> flags = new HashSet<>();//7

    public Minesweeper4(int numberOfMines) {//8
        for (char[] chars : fields) {
            Arrays.fill(chars, EMPTY);
        }
        generateMines(numberOfMines);
        showMinesAround();
    }

    public boolean findMine(int x, int y) {//9
        int i = x - 1;
        int j = y - 1;
        if (i < 0 || i > SIZE - 1 || j < 0 || j > SIZE - 1) {
            throw new IllegalArgumentException();
        }

        char field = fields[i][j];//12
        if (field == EMPTY) {
            fields[i][j] = FLAG;
            flags.add(coordsToString(i, j));
        } else if (field == FLAG) {
            fields[i][j] = EMPTY;
            flags.remove(coordsToString(i, j));
        } else {
            System.out.println("There is a number here!");
        }
        return flags.equals(mines);
    }

    private void showMinesAround() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!mines.contains(coordsToString(i, j))) {
                    int numberOfMines = getNrOfMineAround(i, j);
                    if (numberOfMines != 0) {
                        fields[i][j] = Character.forDigit(numberOfMines, 10);
                    }
                }
            }
        }
    }

    private int getNrOfMineAround(int i, int j) {
        int numberOfMines = 0;
        for (int a = i - 1; a <= i + 1; a++) {
            for (int b = j - 1; b <= j + 1; b++) {
                if (a >= 0 && b >= 0 && a < SIZE && b < SIZE && !(a == i && b == j) && mines.contains(coordsToString(a, b))) {
                    numberOfMines++;
                }
            }
        }
        return numberOfMines;
    }

    private void generateMines(int numberOfMines) {
        while (mines.size() < numberOfMines) {
            int i = RANDOM.nextInt(SIZE);
            int j = RANDOM.nextInt(SIZE);
            String coords = coordsToString(i, j);
            mines.add(coords);
        }
    }

    private String coordsToString(int i, int j) { //11
        return String.valueOf(i) + j;
    }

    @Override
    public String toString() { //10
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" |123456789|")
                .append(System.lineSeparator())
                .append("—│—————————│")
                .append(System.lineSeparator());

        for (int i = 0, fieldsLenght = fields.length; i < fieldsLenght; i++) {
            char[] chars = fields[i];
            stringBuilder.append(i + 1).append("|");
            for (char aChar : chars) {
                stringBuilder.append(aChar);
            }
            stringBuilder.append("|").append(System.lineSeparator());
        }
        return stringBuilder.append("—│—————————│").toString();
    }
}