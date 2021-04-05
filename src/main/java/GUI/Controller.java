package GUI;
import CardGame.PlayingCard;
import CardGame.DeckOfCards;
import CardGame.Hand;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class Controller {
    DeckOfCards deckOfCards;
    Hand hand;

    @FXML
    public HBox hBox;

    @FXML
    public Label handSum;

    @FXML
    public Label heartsInHand;

    @FXML
    public Label queenOfSpades;

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

        } catch (NullPointerException npe) {
            heartsInHand.setText("No hearts");
            handSum.setText("Hand sum: 0");
            queenOfSpades.setText("Queen Of Spades: No");
        }

    }


    @FXML
    public void dealHand(ActionEvent actionEvent) {
        int n = 5;
        deckOfCards = new DeckOfCards();
        actionEvent.consume();
        hBox.getChildren().clear();
        hand = deckOfCards.dealHand(n);

        for(int i = 0; i < n; i++) {
            Label label = new Label(hand.getHand().get(i).getAsString());
            label.setPrefHeight(300);
            label.setPrefWidth(600/n);
            hBox.getChildren().add(label);
        }
    }
}
