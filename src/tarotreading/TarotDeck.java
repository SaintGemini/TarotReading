import java.util.ArrayList;
import java.util.Collections;

public class TarotDeck{
        
public final ArrayList<Card> cards; //instance variable
    
public TarotDeck(){
    
    this.cards = new ArrayList<>();
    
    }

public void addCard(Card addCard){
    this.cards.add(addCard);
    }
    
public void removeCard(int x){
    this.cards.remove(x);
    }


public void shuffle(){
    for(int i = 0; i < 19; i++){
        Collections.shuffle(this.cards);
        i++;
        }
    }

public Card getCard(int x){
    return this.cards.get(x);
}

public int getSize() {
    int size = this.cards.size();
    return  size;
     
}
    
public void threeCardReading(TarotDeck anyDeck){

    for(int i = 77; i >74; i--){        
        this.cards.add(anyDeck.getCard(i));  
        anyDeck.removeCard(i);
    }

} 
   
public void createTarotDeck(){
    //creates minor arcana
    for(Suit cardSuit : Suit.values()){
        for(Value cardValue : Value.values()){
            this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    //creates major arcana
    for(Name name : Name.values()){
        this.cards.add(new Card(name));
        } 
    }
        
}
