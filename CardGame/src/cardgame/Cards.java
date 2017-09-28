package cardgame;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Been Touched on 10/14/2016.
 */
public class Cards {

    private ArrayList<String> cards = new ArrayList<>();
    private String[] symbols = {"$", "&", "#", "%"};

    public Cards() {
        for(int j = 0; j < 4; j++){
            for(int i = 2; i < 15; i++){
                if(i < 11){
                    this.cards.add(this.symbols[j] + i);
                }else{
                    switch(i){
                        case 11: this.cards.add(this.symbols[j] + "J");
                            break;
                        case 12: this.cards.add(this.symbols[j] + "Q");
                            break;
                        case 13: this.cards.add(this.symbols[j] + "K");
                            break;
                        case 14: this.cards.add(this.symbols[j] + "A");   
                        default:
                            break;
                    }
                }
            }
        }
    }

    public void printCards(){
        int i = 0;
        for(String card : this.cards){
            System.out.println(++i + ": " + card);
        }
    }
    
    public ArrayList<String> getUniqueSet(){
        ArrayList<String> tmpDeck = new ArrayList<>();
        while(tmpDeck.size() < 5){
            String item = this.cards.get(ThreadLocalRandom.current().nextInt(this.cards.size()));
            if(!tmpDeck.contains(item)){
                tmpDeck.add(item);
            }
        }
        return tmpDeck;
    }


}
