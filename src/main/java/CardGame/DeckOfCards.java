package CardGame;

import java.util.Collections;
import java.util.ArrayList;

public class DeckOfCards {
    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private ArrayList<PlayingCard> DeckOfCards;

    public DeckOfCards() {
        DeckOfCards = new ArrayList<>();

        for (char suit: suit) {
            for(int i = 1; i <= 13; i++) {
                DeckOfCards.add(new PlayingCard(suit,i));
            }
        }
        Collections.shuffle(DeckOfCards);
    }

    public ArrayList<PlayingCard> getDeckOfCards() {
        return this.DeckOfCards;
    }

    public Hand dealHand(int n) {
        Hand hand = new Hand();
        for(int i = 0; i<n; i++) {
            hand.addCard(this.DeckOfCards.get(0));
            this.DeckOfCards.remove(0);
        }
        return hand;
    }

    public static void main(String[] args) {
        CardGame.DeckOfCards deckOfCards = new DeckOfCards();
        System.out.println(deckOfCards.getDeckOfCards().get(12).getAsString());
    }

}
