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
public class CardGame {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//      GameInit newGame = new GameInit();
        while(true){
            System.out.println("\t--Menu\n1 to play.\n2 to history.\n3 to exit."); // P1
            Scanner reader = new Scanner(System.in);
            int menuOpt = reader.nextInt();
            switch(menuOpt){
                case 1: 
                    GameInit newGame = new GameInit();                   
                case 2: 
                    DataInit data = new DataInit();
                    data.printMatchHistory();
                default: 
                    break;
            }
        }
    }
    
}
