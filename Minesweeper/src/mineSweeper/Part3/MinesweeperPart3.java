package mineSweeper.Part3;

import java.util.Scanner;

public class MinesweeperPart3 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("");
        int nrOfMines = SCANNER.nextInt();

        Game game = new Game(nrOfMines);
        System.out.println(game);

    }
}