package CardGame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    private static Hand hand;
    private static Hand hand1;


    @DisplayName("Creating Hand")
    @BeforeAll
    static void createTestValues() {
        hand = new Hand();
        hand1 = new Hand();

        hand.addCard(new PlayingCard('H',11));
        hand.addCard(new PlayingCard('S',12));
        hand.addCard(new PlayingCard('H',9));
        hand.addCard(new PlayingCard('C',8));
        hand.addCard(new PlayingCard('D',10));

        hand1.addCard(new PlayingCard('H',11));
        hand1.addCard(new PlayingCard('H',12));
        hand1.addCard(new PlayingCard('H',9));
        hand1.addCard(new PlayingCard('H',8));
        hand1.addCard(new PlayingCard('H',10));
    }

    @DisplayName("Testing handSum")
    @Test
    void handSum() {
        int sum = 0;
        try {
            sum = hand.handSum();
        } catch (Exception e) {
            e.getMessage();
        }
        assertEquals(50,sum);
    }

    @DisplayName("Testing heartsInHand")
    @Test
    void heartsInHand() {
        String heartList = "";
        try {
            heartList = hand.heartsInHand();
        } catch (Exception e) {
            e.getMessage();
        }
        assertEquals("[H11, H9]",heartList);
    }

    @DisplayName("Testing queenOfSpades")
    @Test
    void queenOfSpades() {
        boolean check = false;
        try {
            check = hand.queenOfSpades();
        } catch (Exception e) {
            e.getMessage();
        }
        assertTrue(check);
    }

    @DisplayName("Testing checkFlush")
    @Test
    void checkFlush() {
        boolean check = false;
        try {
            check = hand1.checkFlush();
        } catch (Exception e) {
            e.getMessage();
        }
        assertTrue(check);
    }
}