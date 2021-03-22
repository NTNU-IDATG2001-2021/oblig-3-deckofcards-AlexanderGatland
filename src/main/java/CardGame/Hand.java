package CardGame;

import java.util.ArrayList;

public class Hand {

    private ArrayList<PlayingCard> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void addCard(PlayingCard pc) {
        this.hand.add(pc);
    }

}
