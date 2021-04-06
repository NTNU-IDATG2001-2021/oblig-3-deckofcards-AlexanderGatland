package GUI;
import CardGame.PlayingCard;
import CardGame.DeckOfCards;
import CardGame.Hand;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


/**
 * The type Controller.
 */
public class Controller {
    /**
     * The Deck of cards object.
     */
    DeckOfCards deckOfCards;
    /**
     * The Hand object.
     */
    Hand hand;

    /**
     * The Hand box.
     */
    @FXML
    public HBox handBox;

    /**
     * The Hand sum label.
     */
    @FXML
    public Label handSum;

    /**
     * The Hearts in hand label.
     */
    @FXML
    public Label heartsInHand;

    /**
     * The Queen of spades label.
     */
    @FXML
    public Label queenOfSpades;

    /**
     * The flush label
     */
    @FXML
    public Label flush;

    /**
     * The method that checks what the player has in hand.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void checkHand(ActionEvent actionEvent) {
        try {
            handSum.setText("Hand sum: " + this.hand.handSum());

            heartsInHand.setText("Hearts: " + this.hand.heartsInHand());

            if(hand.queenOfSpades()) {
                queenOfSpades.setText("Queen Of Spades: Yes");
            } else {
                queenOfSpades.setText("Queen Of Spades: No");
            }

            if(hand.checkFlush()) {
                flush.setText("5-flush: Yes");
            } else {
                flush.setText("5-flush: No");
            }

        } catch (NullPointerException npe) {
            heartsInHand.setText("No hearts");
            handSum.setText("Hand sum: 0");
            queenOfSpades.setText("Queen Of Spades: No");
            flush.setText("5-flush: No");
        }

    }


    /**
     * Method for dealing the player a hand.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void dealHand(ActionEvent actionEvent) {
        int n = 5;
        deckOfCards = new DeckOfCards();
        actionEvent.consume();
        handBox.getChildren().clear();
        hand = deckOfCards.dealHand(n);

        for(int i = 0; i < n; i++) {
            Label label = new Label(hand.getHand().get(i).getAsString());
            label.setPrefHeight(300);
            label.setPrefWidth(600/n);
            handBox.getChildren().add(label);
        }
    }
}
