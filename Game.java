
package ics3u.culminating.assignment;

import java.util.Scanner;

public class Game { 
    private static String[][] Board = new String [8][8];

    private static String player1="b";
    private static String player2="r";
    private static String currentPlayer=player1;
    
    public static void main(String[] args){

        initializeBoard(Board);
        while(checkWin(Board)==""){
            displayBoard(Board);
                if(currentPlayer==player1){
                    movenormalPiece(currentPlayer);
                    checkWin(Board);
                    currentPlayer=player2;

                }
                else{
                    movenormalPiece(currentPlayer);
                    checkWin(Board);
                    currentPlayer=player1;
                }
        }


        displayBoard(Board);

        System.out.print(checkWin(Board));
        System.out.print(" won the game");
        System.out.println("");
        System.exit(0);
    }
//==============================================================================

    public static void initializeBoard(String Board[][]){

        for(int column=0; column<8; column++){
            for(int row=0; row<8; row++){

                if((row==0 && column==0) || (row==2 && column==0) || (row==4 && column==0) || (row==6 && column==0)){
                    Board[column][row]="□";
                }
                if((row==1 && column==1) || (row==3 && column==1) || (row==5 && column==1) || (row==7 && column==1)){
                    Board[column][row]="□";
                }
                if((row==0 && column==2) || (row==2 && column==2) || (row==4 && column==2) || (row==6 && column==2)){
                    Board[column][row]="□";
                }
                if((row==1 && column==3) || (row==3 && column==3) || (row==5 && column==3) || (row==7 && column==3)){
                    Board[column][row]="□";
                }
                if((row==0 && column==4) || (row==2 && column==4) || (row==4 && column==4) || (row==6 && column==4)){
                    Board[column][row]="□";
                }
                if((row==1 && column==5) || (row==3 && column==5) || (row==5 && column==5) || (row==7 && column==5)){
                    Board[column][row]="□";
                }
                if((row==0 && column==6) || (row==2 && column==6) || (row==4 && column==6) || (row==6 && column==6)){
                    Board[column][row]="□";
                }
                if((row==1 && column==7) || (row==3 && column==7) || (row==5 && column==7) || (row==7 && column==7)){
                    Board[column][row]="□";
                }
            }
        }
        for(int column=0; column<8; column++){
            for(int row=0; row<8; row++){

                if((row==1 && column==0) || (row==3 && column==0) || (row==5 && column==0) || (row==7 && column==0)){
                    Board[column][row]="r";
                }
                if((row==0 && column==1) || (row==2 && column==1) || (row==4 && column==1) || (row==6 && column==1)){
                    Board[column][row]="r";
                }
                if((row==1 && column==2) || (row==3 && column==2) || (row==5 && column==2) || (row==7 && column==2)){
                    Board[column][row]="r";
                }
                if((row==0 && column==3) || (row==2 && column==3) || (row==4 && column==3) || (row==6 && column==3)){
                    Board[column][row]="■";
                }
                if((row==1 && column==4) || (row==3 && column==4) || (row==5 && column==4) || (row==7 && column==4)){
                    Board[column][row]="■";
                }
                if((row==0 && column==5) || (row==2 && column==5) || (row==4 && column==5) || (row==6 && column==5)){
                    Board[column][row]="b";
                }
                if((row==1 && column==6) || (row==3 && column==6) || (row==5 && column==6) || (row==7 && column==6)){
                    Board[column][row]="b";
                }
                if((row==0 && column==7) || (row==2 && column==7) || (row==4 && column==7) || (row==6 && column==7)){
                    Board[column][row]="b";
                }
            }
        }
        System.out.println("PLAY CHECKERS!");
        System.out.println("Player 1 is black(b) and moves first");
        System.out.println("Player 2 is red(r) and moves second");
        System.out.println("");
    }

//==============================================================================

    private static void displayBoard(String Board[][])
    {
        for (int i=1 ; i<9 ; i++)
        {
            System.out.print("   " + i) ;
        }
        System.out.print("\n  ") ;
        for (int i=0; i<8 ; i++) 
            System.out.print("+---") ;
        System.out.print("+\n") ;
        for (int i=0; i<8 ; i++) {
            System.out.print((i+1) + " ") ;
            for (int j=0; j<8 ; j++){
                System.out.print("| " + Board[i][j] + " ") ;
            }
            System.out.print("|\n  ") ;
            for (int i2=0; i2<8; i2++) 
                System.out.print("+---") ;
            System.out.print("+\n") ;
        }
    }

//==============================================================================

    public static void movenormalPiece(String currentPlayer){

        Scanner input=new Scanner(System.in);

        int column=0;
        int row=0;
        int column2=0;
        int row2=0;

        int column3, row3;
        
        int x, y, x2, y2;

        System.out.println("");

        System.out.print("Enter column of piece to move(0,1,2,3,4,5,6,7): ");
        row=input.nextInt();

        System.out.print("Enter row of piece to move (0,1,2,3,4,5,6,7): ");
        column=input.nextInt();

        System.out.print("Enter column of location to move (0,1,2,3,4,5,6,7): ");
        row2=input.nextInt();

        System.out.print("Enter row of location to move (0,1,2,3,4,5,6,7): ");
        column2=input.nextInt();

        System.out.println(Board[column][row]);
        System.out.println(Board[column2][row2]);

//Move normal piece ============================================================

        if(Board[column][row].equals("□") || Board[column2][row2].equals("□")){
            System.out.println("Input is invalid - enter valid column and row values");
        }
        x=column-2;
        y=row-2;
        x2=column+2;
        y2=row+2;

        column3=(column+column2)/2;
        row3=(row+row2)/2;
        
        if((column>=0 && column<8) && (row>=0 && row<8) && (column2>=0 && column2<8) && (row2>=0 && row2<8)){
            if(currentPlayer==player1 && Board[column][row].equals("b")){
                if(column>column2 && row>row2 && Board[column2][row2].equals("■")){
                    if(column2-column==2 || column2-column ==-2 || row2-row==2 || row2-row==-2){
                        Board[column2][row2] = "b";
                        Board[column][row] = "■";
                        Board[column3][row3] = "■";
                    }
                    else if(column2<column){
                    Board[column2][row2] = "b";
                    Board[column][row] = "■";
                }
                }
                else if(column>column2 && row<row2 && Board[column2][row2].equals("■")){
                    if(column2-column==2 || column2-column ==-2 || row2-row==2 || row2-row==-2){
                        Board[column2][row2] = "b";
                        Board[column][row] = "■";
                        Board[column3][row3] = "■";
                    }
                    else if(column2<column){
                    Board[column2][row2] = "b";
                    Board[column][row] = "■";
                }
                }
                else{
                    System.out.println("Input is invalid - enter valid column and row values");
                }
            }
            if(currentPlayer==player2 && Board[column][row].equals("r")){
                if(column<column2 && row>row2 && Board[column2][row2].equals("■")){
                    if(column2-column==2 || column2-column ==-2 || row2-row==2 || row2-row==-2){
                        Board[column2][row2] = "r";
                        Board[column][row] = "■";
                        Board[column3][row3] = "■";
                    }
                    else if(column2>column){
                    Board[column2][row2] = "r";
                    Board[column][row] = "■";
                }
                }
                else if(column<column2 && row<row2 && Board[column2][row2].equals("■")){
                    if(column2-column==2 || column2-column ==-2 || row2-row==2 || row2-row==-2){
                        Board[column2][row2] = "r";
                        Board[column][row] = "■";
                        Board[column3][row3] = "■";
                    }
                    else if(column2>column){
                    Board[column2][row2] = "r";
                    Board[column][row] = "■";
                }
                }
                else{
                    System.out.println("Input is invalid - enter valid column and row values");
                }
            }
            
        }
        

//Make normal piece into king ==================================================

        if(currentPlayer==player1 && (column2==0 && row2==1) || (column2==0 && row2==3) || (column2==0 && row2==5) || (column2==0 && row2==7)){
            Board[column2][row2]="B";
        }
        if(currentPlayer==player2 && (column2==7 && row2==0) || (column2==7 && row2==2) || (column2==7 && row2==4) || (column2==7 && row2==6)){
            Board[column2][row2]="R";
        }

//Move king piece ==============================================================

         if(Board[column][row].equals("□") || Board[column2][row2].equals("□")){
            System.out.println("Input is invalid - enter valid column and row values");
        }
        x=column-2;
        y=row-2;
        x2=column+2;
        y2=row+2;

        column3=(column+column2)/2;
        row3=(row+row2)/2;
        
        if((column>=0 && column<8) && (row>=0 && row<8) && (column2>=0 && column2<8) && (row2>=0 && row2<8)){
            if(currentPlayer==player1 && Board[column][row].equals("B")){
                if(Board[column2][row2].equals("■")){
                    if(column2-column==2 || column2-column ==-2 || row2-row==2 || row2-row==-2){
                        Board[column2][row2] = "B";
                        Board[column][row] = "■";
                        Board[column3][row3] = "■";
                    }
                    else{
                    Board[column2][row2] = "B";
                    Board[column][row] = "■";
                }
                }
                else{
                    System.out.println("Input is invalid - enter valid column and row values");
                }
            }
            
            if(currentPlayer==player2 && Board[column][row].equals("R")){
                if(Board[column2][row2].equals("■")){
                    if(column2-column==2 || column2-column ==-2 || row2-row==2 || row2-row==-2){
                        Board[column2][row2] = "R";
                        Board[column][row] = "■";
                        Board[column3][row3] = "■";
                    }
                    else{
                    Board[column2][row2] = "R";
                    Board[column][row] = "■";
                }
                }
                else{
                    System.out.println("Input is invalid - enter valid column and row values");
                }
            }
            
        }


    }

//==============================================================================

    public static String checkWin(String Board[][]){

        if(!Board[0][0].equals("b") && !Board[0][1].equals("b") && !Board[0][2].equals("b") && !Board[0][3].equals("b") && !Board[0][4].equals("b") && !Board[0][5].equals("b") && !Board[0][6].equals("b") && !Board[0][7].equals("b")){
            if(!Board[1][0].equals("b") && !Board[1][1].equals("b") && !Board[1][2].equals("b") && !Board[1][3].equals("b") && !Board[1][4].equals("b") && !Board[1][5].equals("b") && !Board[1][6].equals("b") && !Board[1][7].equals("b")){
                if(!Board[2][0].equals("b") && !Board[2][1].equals("b") && !Board[2][2].equals("b") && !Board[2][3].equals("b") && !Board[2][4].equals("b") && !Board[2][5].equals("b") && !Board[2][6].equals("b") && !Board[2][7].equals("b")){
                    if(!Board[3][0].equals("b") && !Board[3][1].equals("b") && !Board[3][2].equals("b") && !Board[3][3].equals("b") && !Board[3][4].equals("b") && !Board[3][5].equals("b") && !Board[3][6].equals("b") && !Board[3][7].equals("b")){
                        if(!Board[4][0].equals("b") && !Board[4][1].equals("b") && !Board[4][2].equals("b") && !Board[4][3].equals("b") && !Board[4][4].equals("b") && !Board[4][5].equals("b") && !Board[4][6].equals("b") && !Board[4][7].equals("b")){
                            if(!Board[5][0].equals("b") && !Board[5][1].equals("b") && !Board[5][2].equals("b") && !Board[5][3].equals("b") && !Board[5][4].equals("b") && !Board[5][5].equals("b") && !Board[5][6].equals("b") && !Board[5][7].equals("b")){
                                if(!Board[6][0].equals("b") && !Board[6][1].equals("b") && !Board[6][2].equals("b") && !Board[6][3].equals("b") && !Board[6][4].equals("b") && !Board[6][5].equals("b") && !Board[6][6].equals("b") && !Board[6][7].equals("b")){
                                    if(!Board[7][0].equals("b") && !Board[7][1].equals("b") && !Board[7][2].equals("b") && !Board[7][3].equals("b") && !Board[7][4].equals("b") && !Board[7][5].equals("b") && !Board[7][6].equals("b") && !Board[7][7].equals("b")){
                                        return "r";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(!Board[0][0].equals("r") && !Board[0][1].equals("r") && !Board[0][2].equals("r") && !Board[0][3].equals("r") && !Board[0][4].equals("r") && !Board[0][5].equals("r") && !Board[0][6].equals("r") && !Board[0][7].equals("r")){
            if(!Board[1][0].equals("r") && !Board[1][1].equals("r") && !Board[1][2].equals("r") && !Board[1][3].equals("r") && !Board[1][4].equals("r") && !Board[1][5].equals("r") && !Board[1][6].equals("r") && !Board[1][7].equals("r")){
                if(!Board[2][0].equals("r") && !Board[2][1].equals("r") && !Board[2][2].equals("r") && !Board[2][3].equals("r") && !Board[2][4].equals("r") && !Board[2][5].equals("r") && !Board[2][6].equals("r") && !Board[2][7].equals("r")){
                    if(!Board[3][0].equals("r") && !Board[3][1].equals("r") && !Board[3][2].equals("r") && !Board[3][3].equals("r") && !Board[3][4].equals("r") && !Board[3][5].equals("r") && !Board[3][6].equals("r") && !Board[3][7].equals("r")){
                        if(!Board[4][0].equals("r") && !Board[4][1].equals("r") && !Board[4][2].equals("r") && !Board[4][3].equals("r") && !Board[4][4].equals("r") && !Board[4][5].equals("r") && !Board[4][6].equals("r") && !Board[4][7].equals("r")){
                            if(!Board[5][0].equals("r") && !Board[5][1].equals("r") && !Board[5][2].equals("r") && !Board[5][3].equals("r") && !Board[5][4].equals("r") && !Board[5][5].equals("r") && !Board[5][6].equals("r") && !Board[5][7].equals("r")){
                                if(!Board[6][0].equals("r") && !Board[6][1].equals("r") && !Board[6][2].equals("r") && !Board[6][3].equals("r") && !Board[6][4].equals("r") && !Board[6][5].equals("r") && !Board[6][6].equals("r") && !Board[6][7].equals("r")){
                                    if(!Board[7][0].equals("r") && !Board[7][1].equals("r") && !Board[7][2].equals("r") && !Board[7][3].equals("r") && !Board[7][4].equals("r") && !Board[7][5].equals("r") && !Board[7][6].equals("r") && !Board[7][7].equals("r")){
                                        return "b";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return "";
    }

//==============================================================================

}

