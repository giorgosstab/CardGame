package cardgame;


import java.io.IOException;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Been Touched
 */
public class GameInit {
    private Player player1;
    private Player player2;
    private String gameName;
    private int winner;

    public GameInit() throws IOException{
        this.gameName = "Hearts";
        System.out.println("Initializing new round of " + this.gameName);
        //showDeck();
        createPlayers();
        printDecks();
        getWinner();
    }

    private void createPlayers(){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Player one (1) name:"); // P1
        String name = reader.next();
        this.player1 = new Player(name);

        System.out.println("Player two (2) name:"); // P2
        name = reader.next();
        this.player2 = new Player(name);
    }

    public void printDecks(){
        this.player1.printDeck();
        this.player2.printDeck();
    }
    /*public void showDeck(){
        this.showDeck();
    }*/

    private void getWinner() throws IOException{
        if(this.player1.getDeckHeartsCount() > this.player2.getDeckHeartsCount()){
            System.out.println("Player " + this.player1.getName()+" wins the round with a total sum of " + this.player1.getDeckHeartsCount());
            this.winner = 0;
            saveMatchUp();
        } else if(this.player1.getDeckHeartsCount() < this.player2.getDeckHeartsCount()){
            System.out.println("Player " + this.player2.getName()+" wins the round with a total sum of " + this.player2.getDeckHeartsCount());
            this.winner = 1;
            saveMatchUp();
        }else{
            System.out.println("Both players have an equal amount of hearts on their deck resulting in a tie.");
            this.winner = 2;
            saveMatchUp();
        }
    }
    
    private void saveMatchUp() throws IOException{
        DataInit data = new DataInit();
        data.saveMatch(this.player1.getName(), this.player2.getName(), this.winner);
    }
    
    
    
   

}
