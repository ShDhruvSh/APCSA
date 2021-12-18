/**
 * TicTacToeGame.java
 * When provided with two players, this class can play a game of Tic-Tac-Toe.
 * Authors: Dhruv Sharma
 * Date: 1/30/2020
 * On My Honor: DS
 **/


public class TicTacToeGame
{
    private TicTacToeBoard board;
    Player p1, p2;

    public TicTacToeGame(Player p1, Player p2)
    {
        board = new TicTacToeBoard();
        this.p1 = p1;
        this.p2 = p2;


    }

    public void playGame()
    {
        //Player 1 gets to go first and then keep alternating
        //turns until either the game is over or the board becomes
        //full.
        boolean p1LastTurn = true; //Player 1 plays first turn
        while(!board.gameOver() && !board.isBoardFull())
        {
            board.printBoard();
            p1.takeTurn(board);
            if (!board.gameOver() && !board.isBoardFull()) {
                board.printBoard();
                p2.takeTurn(board);
                p1LastTurn = false; //when Player 2 played last turn
            }
            else
            {
                p1LastTurn = true;
            }
        }

        //Displays a final message of who won or if it was a cats game.
        if (board.isBoardFull() && !board.gameOver())
        {
            System.out.println("Cats game.");
        }
        else if(p1LastTurn)
        {
            System.out.println("P1 won!");
        }
        else
        {
            System.out.println("P2 won!");
        }
    }
}