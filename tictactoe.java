/*
 * Author: Cole Oliva
 * Date: 1/2024
 * Purpose: a simple tictactoe game to gain familiarity with coding on my own. 
 */

import java.io.*;
import java.util.*;

public class tictactoe {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    play(console);

  }

  // the actual mechanics of the game;
  private static void play(Scanner console) {
    char[][] table = new char[3][3];

    // makin every tile empty
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        table[i][j] = ' ';
      }
    }
    int count = 0;

    intro(console);

    while (!isWinner(table)) {
      for (int i = 1; i < 3; i++) {
        System.out.print("Player " + i + ", please select a row from 1 to 3: ");
        int row = console.nextInt();
        while (row < 1 || row > 3) {
          System.out.print("number is invalid! try again : ");
          row = console.nextInt();
        }
        System.out.print("please select a column from 1 to 3: ");
        int column = console.nextInt();
        while (column < 1 || column > 3) {
          System.out.print("number is invalid! try again: ");
          column = console.nextInt();
        }
        if (table[row-1][column-1] != ' ') {
          System.out.println("Sorry, that position is taken. try again");
          i--;
        } else {
          if (i == 1) {
            table[row-1][column-1] = 'X';
          } else {
            table[row-1][column-1] = 'O';
          }
          count++;
          printBoard(table);
        }

        // given a winner, or the board is full
        if (isWinner(table) || count == 9) {
          if (isWinner(table)) {
            System.out.print("Player " + i + " wins! press r to restart, or anything else to quit: ");
          } else {
            System.out.print("Scratch! Press r to restart, or anything else to quit: ");
          }
          String next = console.next();
          if (next.equalsIgnoreCase("r")) {
            play(console);
          } else {
            return;
          }
        }
      }
    }
  }

  // a method that uses the table given to figure out if anyone is a winner
  // returns true if so, false if no winner yet.
  private static boolean isWinner(char[][] table) {
    
    // all row matches
    for (int i = 0; i < table.length; i++) {
      if (table[i][0] != ' ' && table[i][0] == table[i][1] && table[i][1] == table[i][2]) {
        return true;
      }
    }

    // column matches
    for (int j = 0; j < table[0].length; j++) {
      if (table[0][j] != ' ' && table[0][j] == table[1][j] && table[1][j] == table[2][j]) {
        return true;
      }
    }

    // diagonal wins
    if (table[0][0] != ' ' && table[0][0] == table[1][1] && table[1][1] == table[2][2] ||
        table[0][2] != ' ' && table[0][2] == table[1][1] && table[1][1] == table[2][0]) {
          return true;
        }
    return false;
  }

  // prints out a visual representation of the board
  private static void printBoard(char[][] table) {
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        System.out.print(" " + table[i][j] + " ");
      }
      System.out.println();
    }
  }

  // beginning the game, making sure players know whether they are X or O
  private static void intro(Scanner console) {
    System.out.println("Player 1 is X, player 2 is O");

    // makes sure players know their role
    System.out.print("Player 1, type yes to confirm: ");
    String confirm = console.next();
    while (!confirm.equalsIgnoreCase("yes")) {
      System.out.print("Player 1, type yes to confirm: ");
      confirm = console.next();
    }

    System.out.print("Player 2, type yes to confirm: ");
    String confirm2 = console.next();
    while (!confirm2.equalsIgnoreCase("yes")) {
      System.out.print("Player 2, type yes to confirm: ");
      confirm2 = console.next();
    }
  }
}
