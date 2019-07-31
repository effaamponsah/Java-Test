package org.erbyn.dennis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static List<Card> myCards = new ArrayList<>();

    public static void setMyCards() {
//        myCards = new ArrayList<>();
        for (Suit s: Suit.values()){
            for (FaceValue f: FaceValue.values()){
               Card c = new Card(s,f);
               myCards.add(c);
            }
        }
    }

    public static void shuffle() {
        Collections.shuffle(myCards);
    }

    public static List<Card> getMyCards() {
        return myCards;
    }
}
