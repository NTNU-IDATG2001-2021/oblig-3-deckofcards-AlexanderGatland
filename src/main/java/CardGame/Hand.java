package CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Hand.
 */
public class Hand {

    private ArrayList<PlayingCard> hand;

    /**
     * Instantiates a new Hand.
     */
    public Hand() {
        this.hand = new ArrayList<>();
    }

    /**
     * Add card.
     *
     * @param pc the pc
     */
    public void addCard(PlayingCard pc) {
        this.hand.add(pc);
    }

    /**
     * Hand sum int.
     *
     * @return the int
     */
    public int handSum() {
        Integer sum = this.hand.stream().map((card -> card.getFace())).reduce(0, Integer::sum);
        return sum;
    }

    /**
     * Hearts in hand string.
     *
     * @return the string
     */
    public String heartsInHand() {
        String heartsList = "No hearts";
        List hearts = this.hand.stream().filter(playingCard -> playingCard.getSuit() == 'H')
                .map(playingCard -> playingCard.getAsString()).collect(Collectors.toList());
        if (!hearts.isEmpty()) {
            heartsList = hearts.toString();
        }
        return heartsList;
    }

    /**
     * Queen of spades boolean.
     *
     * @return if queen of spades is in hadn
     */
    public boolean queenOfSpades() {
        boolean check = false;
        if(this.hand.stream()
                .filter(playingCard -> playingCard.getSuit() == 'S' && playingCard.getFace() == 12)
                .findAny().isPresent()) {
            check =true;
        }
        return check;
    }

    /**
     * Method to check if player has flush.
     *
     * @return if player has flush
     */
    public boolean checkFlush() {
        boolean check = false;
        char suit = hand.get(0).getSuit();
        if(this.hand.stream().allMatch(playingCard -> playingCard.getSuit() == suit)) {
            check = true;
        }
        return check;
    }

    /**
     * Gets hand of cards.
     *
     * @return the hand of cards
     */
    public ArrayList<PlayingCard> getHand() {
        return hand;
    }

}
