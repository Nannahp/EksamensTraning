package card;

import java.util.Random;

public class Card {
    private Suit suit;
    private int value;
    Random random = new Random();

    public Card(){
      setValue();
      setSuit();
    }
    public int getValue(){
        return value;
    }
    public Suit getSuit(){
        return suit;
    }
    private void  setValue(){
        this.value = random.nextInt(1,14);
    }
    private void setSuit(){
        Suit[] suits = Suit.values();
        this.suit =  suits[random.nextInt(suits.length)];
    }
    public boolean beats(Card anotherCard){
        if (this.value > anotherCard.getValue()){
            if(this.suit.equals(anotherCard.getSuit())){
                return  true;
            } else if (this.suit.getValue() > anotherCard.getSuit().getValue()) {
                return true;
            }
            else return  false;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }
}
