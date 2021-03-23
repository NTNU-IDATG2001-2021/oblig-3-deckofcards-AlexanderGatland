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

    @FXML
    public HBox hBox;




    @FXML
    public void dealHand(ActionEvent actionEvent) {
        int n = 5;
        deckOfCards = new DeckOfCards();
        actionEvent.consume();
        hBox.getChildren().clear();
        Hand hand = deckOfCards.dealHand(n);

        for(int i = 0; i < n; i++) {
            Label label = new Label(hand.getHand().get(i).getAsString());
            label.setPrefHeight(300);
            label.setPrefWidth(600/n);
            hBox.getChildren().add(label);
            System.out.println(hand.getHand().get(i).getAsString());
        }
    }
}
