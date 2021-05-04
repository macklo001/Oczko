package BlackJack;

public class Deck {
    enum Suit {
       DIAMONDS, SPADES, HEARTS, CLUBS

    }
    enum Rank {
        ACE, TWO, TREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public class Card {
        Suit suit;
        Rank rank;
    }
}
