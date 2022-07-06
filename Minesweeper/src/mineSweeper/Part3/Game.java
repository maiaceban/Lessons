package mineSweeper.Part3;

import java.util.Arrays;
import java.util.Random;

public class Game {
    private static final int SIZE = 9;
    private static final char EMPTY = ".";
    private static final char MINE = "X";
    private static final Random RANDOM = new Random();
    private final char[][] fields = new char[SIZE][SIZE];

    public Game(int nrOfMines) {
        for (char[] chars : fields) {
            Arrays.fill(chars, EMPTY);
        }
        generateNMines(nrOfMines);
        showMinesAround();

    }

    private void showMinesAround() {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[j].length; j++) {
                char element = fields[i][j];

                if (fields[i][j] != MINE) {
                    int mines = 0;
                    for (int a = i - 1; a <= j + 1; a++) {
                        for (int b = j - 1; b <= j + 1; b++) {
                            if (a >= 0 && b >= 0 && a < SIZE && b < SIZE && !(a == i && b == j) && fields[a][b] == MINE) {
                                mines++;//de la zero pana la 8
                            }

                        }
                    }
                    if (mines != 0) {
                        fields[i][j] = Character.forDigit(mines, 10); //ne converteste din integer in character
                    }
                }

            }

        }


        private static void generateNMines ( int nrOfMines){
            // generating mines
            int count = 0;
            while (count < nrOfMines) {
                int i = RANDOM.nextInt(9);
                int j = RANDOM.nextInt(9);
                if (fields[i][j] != 'X') {
                    fields[i][j] = 'X';
                    count++;
                }
            }
        }
        @Override
                public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (char[] chars : fields) {
                for (char aChar: chars)
                stringBuilder.append(aChar);
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}