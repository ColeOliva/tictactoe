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

    intro(table, console);
    
  }

  // a method that uses the table given to figure out if anyone is a winner
  // returns true if so, false if no winner yet.
  private static boolean isWinner(char[][] table) {
    return false;
  }

  private static void intro(char[][] table, Scanner console) {
    System.out.println("Player 1 is X, player 2 is O");
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
