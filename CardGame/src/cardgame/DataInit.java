package cardgame;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Been Touched
 */
public class DataInit {
    public void printMatchHistory() throws IOException, ArrayIndexOutOfBoundsException {
        String fileName = "history.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                System.out.println("\tMatch history:");
                stream.forEach((st) -> {
                    String[] sp = st.split(":");
                        System.out.println("Matchup : " + sp[0] + " vs " + sp[1] + " Winner: " + ((Integer.parseInt(sp[2]) == 0) ? sp[0] : (Integer.parseInt(sp[2]) == 1 ) ?  sp[1] : "Tie"));
                });
        }catch(ArrayIndexOutOfBoundsException e){
        }
    }
    
    public void saveMatch(String player1, String player2, int winner) throws IOException{
        String fileName = "history.txt";
        FileWriter fw = new FileWriter(fileName,true);
        fw.write(player1+":"+player2+":"+winner+"\n ");
        fw.close();
    }
    
}
