package CardGame;

import java.util.Collections;
import java.util.ArrayList;

/**
 * The type Deck of cards.
 */
public class DeckOfCards {
    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private ArrayList<PlayingCard> DeckOfCards;

    /**
     * Instantiates a new Deck of cards.
     */
    public DeckOfCards() {
        DeckOfCards = new ArrayList<>();

        for (char suit: suit) {
            for(int i = 1; i <= 13; i++) {
                DeckOfCards.add(new PlayingCard(suit,i));
            }
        }
        Collections.shuffle(DeckOfCards);
    }

    /**
     * Gets deck of cards.
     *
     * @return the deck of cards
     */
    public ArrayList<PlayingCard> getDeckOfCards() {
        return this.DeckOfCards;
    }

    /**
     * Deal hand method.
     *
     * @param n the number of cards
     * @return the hand of cards
     */
    public Hand dealHand(int n) {
        Hand hand = new Hand();
        for(int i = 0; i<n; i++) {
            hand.addCard(this.DeckOfCards.get(0));
            this.DeckOfCards.remove(0);
        }
        return hand;
    }

}
