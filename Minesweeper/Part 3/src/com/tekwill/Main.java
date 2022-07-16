package com.tekwill;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many MINES do you want on the field?  ");
        int nrOfMines = SCANNER.nextInt();

        Minesweeper3 minesweeper3 = new Minesweeper3(nrOfMines);
        System.out.println(minesweeper3);
    }
}