
package tarotreading;
import java.util.Random;

public class TarotReading {

    

    public static void main(String[] args) {
        Random reverse = new Random();
        int rando;

        TarotDeck tarot = new TarotDeck();
        TarotDeck reading = new TarotDeck();
        
        tarot.createMinorArcana();
        tarot.createMajorArcana();

        
        for(int i = 0; i < 4; i ++){
        tarot.shuffle();
        }
        
        reading.drawFromDeck(tarot);
        
        for(int i = 0; i < reading.getSize(); i++) {
            rando = reverse.nextInt(2);
            if(rando == 1){
                System.out.println("Reversed" + " " + reading.getCard(i).toString());
            } else{
            System.out.println(reading.getCard(i).toString());
                }
            }
}
