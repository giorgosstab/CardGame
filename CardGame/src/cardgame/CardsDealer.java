/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;

/**
 *
 * @author gtsax
 */
public class CardsDealer {
    private ArrayList<String> deck;
    
    public void showDeck(){
        for(int i=0;i<deck.size();i++)
        {
            System.out.println(deck.get(i));
        } 
    }
}
