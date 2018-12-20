public enum Card {

    HEARTS_SEVEN("Seven of Hearts", Suit.HEARTS, 0, 0),
    HEARTS_EIGHT("Eight of Hearts", Suit.HEARTS, 1, 0),
    HEARTS_NINE("Nine of Hearts", Suit.HEARTS, 2, 0),
    HEARTS_KING("King of Hearts", Suit.HEARTS, 3, 4),
    HEARTS_TEN("Ten of Hearts", Suit.HEARTS, 4, 10),
    HEARTS_ACE("Ace of Hearts", Suit.HEARTS, 5, 11),
    SPADES_SEVEN("Seven of Spades", Suit.SPADES, 0, 0),
    SPADES_EIGHT("Eight of Spades", Suit.SPADES, 1, 0),
    SPADES_NINE("Nine of Spades", Suit.SPADES, 2, 0),
    SPADES_KING("King of Spades", Suit.SPADES, 3, 4),
    SPADES_TEN("Ten of Spades", Suit.SPADES, 4, 10),
    SPADES_ACE("Ace of Spades", Suit.SPADES, 5, 11),
    CLUBS_SEVEN("Seven of Clubs", Suit.CLUBS, 0, 0),
    CLUBS_EIGHT("Eight of Clubs", Suit.CLUBS, 1, 0),
    CLUBS_NINE("Nine of Clubs", Suit.CLUBS, 2, 0),
    CLUBS_KING("King of Clubs", Suit.CLUBS, 3, 4),
    CLUBS_TEN("Ten of Clubs", Suit.CLUBS, 4, 10),
    CLUBS_ACE("Ace of Clubs", Suit.CLUBS, 5, 11),
    DIAMONDS_SEVEN("Seven of Diamonds", Suit.TRUMP, 0, 0),
    DIAMONDS_EIGHT("Eight of Diamonds", Suit.TRUMP, 1, 0),
    DIAMONDS_NINE("Nine of Diamonds", Suit.TRUMP, 2, 0),
    DIAMONDS_KING("King of Diamonds", Suit.TRUMP, 3, 4),
    DIAMONDS_TEN("Ten of Diamonds", Suit.TRUMP, 4, 10),
    DIAMONDS_ACE("Ace of Diamonds", Suit.TRUMP, 5, 11),
    DIAMONDS_JACK("Jack of Diamonds", Suit.TRUMP, 6, 2),
    HEARTS_JACK("Jack of Diamonds", Suit.TRUMP, 7, 2),
    SPADES_JACK("Jack of Diamonds", Suit.TRUMP, 8, 2),
    CLUBS_JACK("Jack of Diamonds", Suit.TRUMP, 9, 2),
    DIAMONDS_QUEEN("Queen of Diamonds", Suit.TRUMP, 10, 3),
    HEARTS_QUEEN("Queen of Diamonds", Suit.TRUMP, 11, 3),
    SPADES_QUEEN("Queen of Diamonds", Suit.TRUMP, 12, 3),
    CLUBS_QUEEN("Queen of Diamonds", Suit.TRUMP, 13, 3);

    Card(String name, Suit suit, int rank, int points) {
        this.name = name;
        this.suit = suit;
        this.rank = rank;
        this.points = points;
    }

    String name;
    Suit suit;
    int rank;
    int points;

}
