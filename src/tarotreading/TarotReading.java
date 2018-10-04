import java.util.Random;

public class TarotReading {

    public static void main(String[] args) {
        //for the reversed output on lines 24-32
        Random reverse = new Random();
        int rando;

        TarotDeck tarot = new TarotDeck();
        TarotDeck reading = new TarotDeck();
        
        tarot.createTarotDeck();
        tarot.shuffle();
        
        reading.threeCardReading(tarot);
        
        //creates a 50% chance the card drawn will be reversed or normal
        for(int i = 0; i < reading.getSize(); i++) {
            rando = reverse.nextInt(2);
            if(rando == 1){
                System.out.println("Reversed" + " " + reading.getCard(i).toString());
            } else{
            System.out.println(reading.getCard(i).toString());
                }
            }
    }
}
