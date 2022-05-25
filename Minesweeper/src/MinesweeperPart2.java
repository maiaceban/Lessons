import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinesweeperPart2 {
    /*
    Description
It is not interesting when the field has exactly the same setup every time, and you
know where all the mines are located, isn't it? To avoid that, let's generate a new random
configuration every time the user wants to play the game.
Let's improve the program and let the user choose how many mines she wants to
play with on the field. The user just needs to input a number from the keyboard.

The program should ask the user how many mines he wants to see on the field and
then display the field with mines. The mines must still be visible to the user, you will hide
them in the following stages. Make sure that mines are marked with the 'X' character
and safe fields are marked with the '.' character. Also, use a 9x9 field, the tests check
the field of this size.
In this stage, you need to use a random number generator. The class you need is
java.util.Random.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many mines do you want on the field? ");
        int nrOfMines = scanner.nextInt();

        char[][] matrix = fillMatrixWithDots('.', 20);

        generateNMines(matrix, nrOfMines);

        printMatrix(matrix);

    }

    public static void printMatrix(char[][] matrix) {
        // display the game
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static char[][] fillMatrixWithDots(char theChar, int n) {
        // filling array with dots
        char[][] matrix = new char[n][n];
        for (char[] value : matrix) {
            Arrays.fill(value, theChar);
        }
        return matrix;
    }

    public static void generateNMines(char[][] matrix, int nrOfMines) {
        // generating mines
        Random random = new Random();
        int count = 0;
        while (count < nrOfMines) {
            int i = random.nextInt(9);
            int j = random.nextInt(9);
            if (matrix[i][j] != 'X') {
                matrix[i][j] = 'X';
                count++;
            }
        }
    }
}
