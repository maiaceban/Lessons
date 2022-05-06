package lesson5.exercise2;

import java.util.Scanner;

/**
 * 2.The army of units
 */
/*
In a computer game, each gamer has an army of units. Write a program that will
classify the army corresponding to the following rules:
less than 1: no army
from 1 to 19: pack
from 20 to 249: throng
from 250 to 999: zounds
1000 and more: legion
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int army = sc.nextInt();

        if (army < 1) {
            System.out.println("no army");
        } else if (army <= 19) {
            System.out.println("pack");
        } else if (army <= 249) {
            System.out.println("throng");
        } else if (army <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}



