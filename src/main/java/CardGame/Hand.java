package CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {

    private ArrayList<PlayingCard> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void addCard(PlayingCard pc) {
        this.hand.add(pc);
    }

    public int handSum() {
        Integer sum = this.hand.stream().map((card -> card.getFace())).reduce(0, Integer::sum);
        return sum;
    }

    public String heartsInHand() {
        List hearts = this.hand.stream().filter(playingCard -> playingCard.getSuit() == 'H')
                .map(playingCard -> playingCard.getAsString()).collect(Collectors.toList());
        return hearts.toString();
    }

    public ArrayList<PlayingCard> getHand() {
        return hand;
    }
}
