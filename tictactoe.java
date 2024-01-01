/*
 * Author: Cole Oliva
 * Date: 1/2024
 * Purpose: a simple tictactoe game to gain familiarity with coding on my own. 
 */

import java.io.*;
import java.util.*;

public class tictactoe {
  public static void main(String[] args) {

    char[][] table = new char[3][3];
    Scanner console = new Scanner(System.in);

    intro(console);

    while (!isWinner(table)) {
      System.out.print("Player 1, please select a row from 1 to 3, or q to quit");

    }

    
  }

  // a method that uses the table given to figure out if anyone is a winner
  // returns true if so, false if no winner yet.
  private static boolean isWinner(char[][] table) {
    return false;
  }

  // prints out a visual representation of the board
  private static void printBoard(char[][] table) {

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
