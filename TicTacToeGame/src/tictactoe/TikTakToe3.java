package tictactoe;
import java.util.Scanner;
/*
PART NR.3
 */
public class TikTakToe3 {
    public static void main(String[] args) {
        System.out.print("Enter cells:  ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        print(chars);

        int nrOfXs = countChar(chars, 'X');
        int nrOfOs = countChar(chars, 'O');
        boolean xHasWon = hasWon(chars, 'X');
        boolean oHasWon = hasWon(chars, 'O');
        int difference = Math.abs(nrOfXs - nrOfOs);

        if (difference > 1 || (xHasWon && oHasWon)) {
            System.out.println("Impossible");
        } else if (xHasWon) {
            System.out.println("X wins");
        } else if (oHasWon) {
            System.out.println("O wins");
        } else if (!input.contains("_")) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }

    }

    public static int countChar(char[] array, char ch) {
        int count = 0;
        for (char c : array) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasWon(char[] array, char ch) {
        return checkColumns(array, ch) || checkRows(array, ch) || checkDiagonals(array, ch);
    }

    public static boolean checkRows(char[] array, char ch) {
        return array[0] == ch && array[1] == ch && array[2] == ch ||
                array[3] == ch && array[4] == ch && array[5] == ch ||
                array[6] == ch && array[7] == ch && array[8] == ch;
    }

    public static boolean checkColumns(char[] array, char ch) {
        return array[0] == ch && array[3] == ch && array[6] == ch ||
                array[1] == ch && array[4] == ch && array[7] == ch ||
                array[2] == ch && array[5] == ch && array[8] == ch;
    }

    public static boolean checkDiagonals(char[] array, char ch) {
        return array[0] == ch && array[4] == ch && array[8] == ch ||
                array[2] == ch && array[4] == ch && array[6] == ch;
    }

    private static void print(char[] array) {
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1] + " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4] + " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7] + " " + array[8] + " |");
        System.out.println("---------");
    }

}
//XXXOO__O_
//XOXOXOXXO
//XOOOXOXXO
//XOXOOXXXO
//XO_OOX_X_
//XO_XO_XOX
//_O_X__X_X
//_OOOO_X_X