public class Card {
    private Suit suit;
    private Value value;
    private Name name;
    
    //card structure for minor arcana
public Card(Suit suit, Value value){
    this.value = value;
    this.suit = suit;
}
    //card structure for major arcana
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
