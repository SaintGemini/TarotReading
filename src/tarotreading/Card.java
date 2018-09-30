package tarotreading;

public class Card {
    private Suit suit;
    private Value value;
    private Name name;
    
public Card(Suit suit, Value value){
    this.value = value;
    this.suit = suit;
}
    
public Card(Name name){
    this.name = name;
}

public String toString(){
    if(this.name instanceof Name){
        return this.name.toString();
    } else {
        return this.value.toString() + " of  " + this.suit.toString();
        }
    }
}
