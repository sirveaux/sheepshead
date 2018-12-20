import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.cards = Arrays.asList(
                Card.HEARTS_SEVEN,
                Card.HEARTS_EIGHT,
                Card.HEARTS_NINE,
                Card.HEARTS_KING,
                Card.HEARTS_TEN,
                Card.HEARTS_ACE,
                Card.SPADES_SEVEN,
                Card.SPADES_EIGHT,
                Card.SPADES_NINE,
                Card.SPADES_KING,
                Card.SPADES_TEN,
                Card.SPADES_ACE,
                Card.CLUBS_SEVEN,
                Card.CLUBS_EIGHT,
                Card.CLUBS_NINE,
                Card.CLUBS_KING,
                Card.CLUBS_TEN,
                Card.CLUBS_ACE,
                Card.DIAMONDS_SEVEN,
                Card.DIAMONDS_EIGHT,
                Card.DIAMONDS_NINE,
                Card.DIAMONDS_KING,
                Card.DIAMONDS_TEN,
                Card.DIAMONDS_ACE,
                Card.DIAMONDS_JACK,
                Card.HEARTS_JACK,
                Card.SPADES_JACK,
                Card.CLUBS_JACK,
                Card.DIAMONDS_QUEEN,
                Card.HEARTS_QUEEN,
                Card.SPADES_QUEEN,
                Card.CLUBS_QUEEN
        );
    }

    public void shuffle() {
        for (int i = 0; 0 < cards.size() - 2; i++) {
            int j = ThreadLocalRandom.current().nextInt(i, cards.size());
            Card swapCard = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, swapCard);
        }
    }

    public Card getTopCard() {
        return null;
    }




}
