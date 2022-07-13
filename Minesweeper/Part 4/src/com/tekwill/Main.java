package com.tekwill;

import java.util.Scanner;

public class Main {
    private  static  final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many mines do you want on the field? ");
        int numberOfMines = SCANNER.nextInt();

        Minesweeper4 minesweeper4 = new Minesweeper4(numberOfMines);
        System.out.println(minesweeper4);

        boolean hasWon = false;
        while (!hasWon){
            System.out.print("Set/delete mines marks (x and Y coordinates): ");
            int x = SCANNER.nextInt();
            int y = SCANNER.nextInt();
            hasWon = minesweeper4.findMine(x,y);
            System.out.println(minesweeper4);
            if (hasWon){
                System.out.println("Felicitări! Ai găsit toate minele!");
            }
        }
    }
}