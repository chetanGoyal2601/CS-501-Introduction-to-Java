//Connect Four Game
//Chetan Goyal - CWID: 20005334
//Group name - CS 501 - Connect 4 Simulation
import java.util.*;
public class BackendForC4Connect {
    public static Scanner inp;
    private static HashMap<Integer, ArrayList<Integer>> board;
    private static int totalMoves;
    private static boolean redTurn;
    private static HashMap<Integer, Integer> totalMovesInEachColumn;
    private static boolean gameWon;
    
    //Constructor
    public BackendForC4Connect() {
        inp = new Scanner(System.in);
        board = new HashMap<>();
        totalMoves = 0;
        redTurn = true;
        totalMovesInEachColumn = new HashMap<>();
        gameWon = false;
    }

    public static void initializeTotalMovesInEachColumn() {
        for (int i = 1; i <= 7; i++)
                totalMovesInEachColumn.put(i, 0);
    }

    //This method is used for the creation of the board for the game
    public static void createBoard() {
        for (int i = 1; i <= 7; i++) {
            ArrayList<Integer> rows = new ArrayList<Integer>(8);
            for (int j = 1; j <= 6; j++)
                rows.add(0);
            board.put(i, rows);
        }
    }

    //The displayBoard method displays the board after every turn to show the progress of the game
    public static void displayBoard() {
        String b = "";
        for (int r = 5; r >= 0; r--) {
             b += '|';
            for (int c = 1; c < 8; c++) {
                if (board.get(c).get(r) == 0) {
                    b += " |";
                }
                else if (board.get(c).get(r) == 1) {
                    b += "R|";
                }
                else
                    b += "Y|";
            }
            b += "\n";
        }
        
        b += "----------------\n"; //to display the end of the board
        for (int i = 1; i <= 7; i++) {
            b += ' ' + Integer.toString(i);
        }
        System.out.println("\n" + b + "\n");
    }

    //This method checks on every move if the game is won or not, by checking horizontally, vertically and diagonally
    public static boolean checkIfWon(HashMap<Integer, ArrayList<Integer>> board, int row, int column) {
        if (checkHorizontal(board, row, column))
            return true;
        else if (checkVertical(board, row, column)) 
            return true;
        else if (checkDiagonal1(board, row, column))
            return true;
        else if (checkDiagonal2(board, row, column)) 
            return true;

        return false;
    }

    //this method checks if the game has been tied
    public static boolean checkIfTied(int moves) {
        if (moves == 42) {
            System.out.println("The game has tied!");
            return true;
        }
    
        return false;
    }

    //After every move we check the diagonal extending from upper right to lower left- if the player with the last turn got four consecutive colours diagonally
    public static boolean checkDiagonal2(HashMap<Integer, ArrayList<Integer>> board, int row, int column) {
        int countUR = 0;  //For counting same colour in the upper right or not
        int countDL = 0;  //For counting the same colour in lower left or not
        int rowUR = row;  //To navigate the right rows
        int rowDL = row;  //To navigate the left rows
        int columnDL = column;   //To navigate the upper columns
        int columnUR = column;   //To navigate the lower columns

        int p_check = board.get(column).get(row);   //Getting the current checkers value which needs to be checked
        int p_foundDL = p_check;    //to check the checker in lower left
        int p_foundUR = p_check;    //to check the checker in upper left

        //check upper right of the board
        while (rowUR <= 5 && columnUR <= 7) {
            p_foundUR = board.get(columnUR).get(rowUR);
            if (p_foundUR == p_check) {
                countUR += 1;
                rowUR += 1;
                columnUR += 1;
            }
            else
                break;
        }

        //check lower left of the board
        while (rowDL >= 0 && columnDL >= 1) {
            p_foundDL = board.get(columnDL).get(rowDL);
            if (p_foundDL == p_check) {
                countDL += 1;
                rowDL -= 1;
                columnDL -=1;
            }
            else
                break;
        }

        //if found consecutively same four colours, return true otherwise false
        if (countUR + countDL - 1 >= 4) {
            return true;
        }
        return false;
    }

    //After every move we check the diagonal extending from upper left to lower right- if the player with the last turn got four consecutive colours diagonally
    public static boolean checkDiagonal1(HashMap<Integer, ArrayList<Integer>> board, int row, int column) {
        int countUL = 0;   //Counting same colour in the upper left or not
        int countDR = 0;   //Counting the same colour in down right or not
        int rowUL = row;   //To navigate the left rows
        int rowDR = row;   //To navigate the right rows
        int columnUL = column;   //To navigate the upper columns
        int columnDR = column;   //To navigate the lower columns

        int p_check = board.get(column).get(row);   //Getting the current checkers value which needs to be checked
        int p_foundUL = p_check;   //to check the checker in upper left
        int p_foundDR = p_check;   //to check the checker in lower right

        //check upper left of the board
        while (rowUL <= 5 && columnUL >= 1) {
            p_foundUL = board.get(columnUL).get(rowUL);
            if (p_foundUL == p_check) {
                countUL += 1;
                rowUL += 1;
                columnUL -= 1;
            }
            else
                break;
        }

        //check lower right of the board
        while (rowDR >= 0 && columnDR <= 7) {
            p_foundDR = board.get(columnDR).get(rowDR);
            if (p_foundDR == p_check) {
                countDR += 1;
                rowDR -= 1;
                columnDR +=1;
            }
            else
                break;
        }

        //if found consecutively same four colours, return true otherwise false
        if (countDR + countUL - 1 >= 4) {
            return true;
        }
        return false;
    }

    //After every move we check the Vertical, if the player with the last turn has got four same coloured checkers vertically
    public static boolean checkVertical(HashMap<Integer, ArrayList<Integer>> board, int row, int column) {
        int countU = 0;   //For counting same colour up or not
        int countD = 0;   //For counting same colour down or not
        int rowU = row;   //To navigate the upper rows
        int rowD = row;   //To navigate the lower rows

        int p_check = board.get(column).get(row);   //Getting the current checker's value
        int p_foundU = p_check;   //to check the checker on the upper rows
        int p_foundD = p_check;   //to check the checker in lower rows

        // check up
        while(rowU <= 5) {
            p_foundU = board.get(column).get(rowU);
            if (p_foundU == p_check) {
                countU += 1;
                rowU += 1;
            }
            else
                break;
        }

        // check down
        while (rowD >= 0) {
            p_foundD = board.get(column).get(rowD);
            if (p_foundD == p_check) {
                countD += 1;
                rowD -= 1;
            }
            else
                break;
        }

        //if found consecutively same four colours, return true otherwise false
        if (countU + countD - 1 >= 4) {
            return true;
        }
        
        return false;
    }

    //After every move we check in horizontal direction, if the player with the last turn has got four consecutive checkers horizontally or not
    public static boolean checkHorizontal(HashMap<Integer, ArrayList<Integer>> board, int row, int column) {
        //System.out.println(board);
        int countR = 0;     //For counting same colour right or not
        int countL = 0;     //For counting same colour left or not
        int columnR = column;       //To navigate the right rows
        int columnL = column;       //To navigate the lower rows
        
        int p_check = board.get(column).get(row);  //Getting the current checker's value
        int p_foundR = p_check;     //to check the checker on the right columns
        int p_foundL = p_check;     //to check the checker on the left columns
        
        // check right
        while (columnR <= 7) {
            p_foundR = board.get(columnR).get(row);
            if (p_foundR == p_check) {
                countR += 1;
                columnR += 1;
            }
            else
                break;
        }

        // check left
        while (columnL >= 1) {
            p_foundL = board.get(columnL).get(row);
            if (p_foundL == p_check) {
                countL += 1;
                columnL -= 1;
            }
            else
                break;
        }

        //if found consecutively same four colours, return true otherwise false
        if (countL + countR - 1 >= 4) {
            return true;
        }

        return false;
    }

    //This method runs the complete game
    public void playGame() {
        System.out.println("\nThe board is shown below: ");
        createBoard();
        displayBoard();
        initializeTotalMovesInEachColumn(); //Counting number of checkers filled in each column so that if any column is filled

        while (totalMoves <= 42 && gameWon == false) {
            int checkersInColumn = 6; //initialising the row to which we have to put to 6 and then check in the loop
            int column = 0;

            while (checkersInColumn >= 6) {
                if (redTurn == true){
                    System.out.print("Red's Turn! ");
                }
                else
                    System.out.print("Yellow's Turn! ");
                
                boolean validColumn = false;
                while (validColumn == false) {
                    System.out.print("Enter the column you want to fill (an integer value between 1 to 7): ");
                    column = inp.nextInt();
                    
                    //to check if a valid column integer is entered
                    if (column == -1) {
                        break;
                    }
                    else if (column <=7 && column >= 1) {
                        validColumn = true;
                    }
                    else {
                        System.out.println("Invalid column entered. Will ask to reenter!");
                    }
                }

                if (column == -1)
                    break;

                checkersInColumn = totalMovesInEachColumn.get(column);

                if (checkersInColumn == 6) {
                    System.out.println("This column is already filled. Please try again with a different column.");
                }
            }

            if (column == -1)
                break;

            totalMovesInEachColumn.put(column, checkersInColumn + 1); //updating the row of that coulmn when it is filled with a checker
            int rowToPutIn = checkersInColumn;

            if (redTurn == true) {
                board.get(column).set(rowToPutIn, 1); //We use the value of 1 to store in our board which is 0 initially
            }
            else {
                board.get(column).set(rowToPutIn, -1); //We use the value of -1 to store in our board which is 0 initially
            }

            displayBoard(); //to display the board after every move

            //On every move we check if the game is won or still in play
            if (checkIfWon(board, rowToPutIn, column)) {
                if (redTurn)
                    System.out.println("RED HAS WON!");
                else
                    System.out.println("YELLOW HAS WON!");

                gameWon = true;
                break;
            }

            //to keep account of next player's turn - yellow or red
            if (redTurn)
                redTurn = false;
            else
                redTurn = true;

            totalMoves += 1; // to count total moves as they should not exceed 42, if they reach 42 and if no player wins on the last move then the game is tied
            if (checkIfTied(totalMoves))
                break;
        }
    }
}