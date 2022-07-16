import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Stage 2/5: Flexible mines
 */
public class Minesweeper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //1p
        System.out.println("How many mine do you want on the field?");  //2p
        int numberOfMines = scanner.nextInt();//3p

        char[][] matrix = fillMatrixWithMultimple('*', 9); //7p

        generateMines(matrix, numberOfMines);//13p

        printMatrix(matrix); //8p

    }

    public static void printMatrix(char[][] matrix) {//4p
        //display the game
        for (char[] chars : matrix) {//5p
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static char[][] fillMatrixWithMultimple(char theChar, int n) {//6p
        //filling array with multiple simbol
        char[][] matrix = new char[n][n];
        for (char[] value : matrix) {
            Arrays.fill(value, theChar);
        }
        return matrix;
    }

    public static void generateMines(char[][] matrix, int nrOfMines) {//9p
        //generating mines
        Random random = new Random(); //10p
        int count = 0; //11p
        while (count < nrOfMines) {//12p
            int i = random.nextInt(9);
            int j = random.nextInt(9);
            if (matrix[i][j] != 'M') {
                matrix[i][j] = 'M';
                count++;
            }
        }

    }
}