package cardgame;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Been Touched
 */
public class Player {
    private String name;
    private ArrayList<String> deck;
    
    public Player(String name){
        this.name = name;
        Cards tmpCards = new Cards();
        this.deck = tmpCards.getUniqueSet();
    }
    
    public String getName() {
        return name;
    }
    
    public void printDeck(){
        System.out.println("Players " + this.name +" deck:");
        this.deck.forEach((card) -> {
            System.out.println("\t" + card);
        });
    }
    
    public int getDeckHeartsCount(){
        int i = 0;
         for(String card : this.deck){
             if(card.contains("#")){
                 i++;
             }
         }
         return i;
    }
    
}
