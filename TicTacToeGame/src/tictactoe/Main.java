package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("");
        char[][] state = new char[3][3];
        int i = 0;
        int j = 0;
        int size = state.length - 1;
        System.out.print("Enter cells: ");
        while (scanner.hasNext()) {
            state[i][j] = scanner.next().charAt(0);
            if (j < size) {
                j++;
            } else if (i < size) {
                j = 0;
                i++;
            } else {
                break;
            }

            TikTakToeGame game = new TikTakToeGame(state);
            System.out.println(game.getState());
            System.out.println(game.getStatus());
        }
    }
}
