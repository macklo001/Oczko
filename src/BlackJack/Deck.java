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

//    public static void main(String[] args) {
//        String[] karty = {"2_PIK", "2_TREFL", "2_KARO", "2_KIER", "3_PIK", "3_TREFL", "3_KARO", "3_KIER",
//                "4_PIK", "4_TREFL", "4_KARO", "4_KIER", "5_PIK", "5_TREFL", "5_KARO", "5_KIER",
//                "6_PIK", "6_TREFL", "6_KARO", "6_KIER", "7_PIK", "7_TREFL", "7_KARO", "7_KIER",
//                "8_PIK", "8_TREFL", "8_KARO", "8_KIER", "9_PIK", "9_TREFL", "9_KARO", "9_KIER",
//                "10_PIK", "10_TREFL", "10_KARO", "10_KIER", "J_PIK", "J_TREFL", "J_KARO", "J_KIER",
//                "D_PIK", "D_TREFL", "D_KARO", "D_KIER", "K_PIK", "K_TREFL", "K_KARO", "K_KIER",
//                "A_PIK", "A_TREFL", "A_KARO", "A_KIER"};
//        for (String karta : karty) {
//            System.out.println(karta);
//        }
//    }
//
