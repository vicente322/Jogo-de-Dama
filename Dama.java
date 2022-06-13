import java.util.Scanner;

/**Jogo de Damas
*A classe Damas é um jogo de damas conforme as regras da wikipédia https://pt.wikipedia.org/wiki/Damas
*
*@author v.hofmeister@edu.pucrs.br
*@author DevDoDedinho
*@version 2022-06-13
*/

public class Damas{

      public static String[][] init() {
            String[][] b = new String[8][8];
            for (int i = 0; i < b.length; i++) {
                  for (int j = 0; j < b[i].length; j++) {
                        if (i % 2 == 0 && j % 2 == 0){
                              b[i][j] = "*";
                        }
                        else if(i % 2 != 0 && j % 2 != 0){
                              b[i][j] = "*";
                        }
                        else if(i == 0 || i == 1){
                              b[i][j] = "W";
                        }
                        else if(i == 6 || i == 7){
                              b[i][j] = "B";
                        }
                        else {
                              b[i][j] = " ";
                        }
                  }
            }
            return b;
      }
      /* public static void DisplayBoard(String [][] b){
            System.out.printf("   0 1 2 3 4 5 6 7 \n");
            System.out.printf("0 |*| |*| |*| |*| |\n");
            System.out.printf("1 | |*| |*| |*| |*|\n");
            System.out.printf("2 |*| |*| |*| |*| |\n");
            System.out.printf("3 | |*| |*| |*| |*|\n");
            System.out.printf("4 |*| |*| |*| |*| |\n");
            System.out.printf("5 | |*| |*| |*| |*|\n");
            System.out.printf("6 |*| |*| |*| |*| |\n");
            System.out.printf("7 | |*| |*| |*| |*|\n");

      } */

      public static void DisplayBoard(String [][] b){

            String board = "";
            board += "   0 1 2 3 4 5 6 7 \n";

            for (int i = 0; i < b.length; i++){
                  board += i + " |";
                  for (int j = 0; j < b.length; j++){
                        board += b[i][j] + "|";
                  }
                  board += "\n";
            }

            System.out.printf(board);
      }

      public static void main(String args[]){

            String b[][] = init();
            DisplayBoard(b);

      }
}
