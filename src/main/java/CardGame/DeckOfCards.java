package CardGame;

import java.util.ArrayList;

public class DeckOfCards {
    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private ArrayList<PlayingCard> DeckOfCards;

    public DeckOfCards() {
        DeckOfCards = new ArrayList<>();

        for (char suit: suit) {
            for(int i = 0; i >13; i++) {
                DeckOfCards.add(new PlayingCard(suit,i));
            }
        }
    }



}
