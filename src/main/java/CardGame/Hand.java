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

    public int handSum() {
        int sum = 0;
        sum = this.hand.stream().map((card -> card.getFace())).reduce(0, Integer::sum);
        return sum;
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }
}
