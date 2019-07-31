package org.erbyn.dennis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private  List<Card> myCards;

    public void setMyCards() {
        myCards = new ArrayList<>();
        for (Suit s: Suit.values()){
            for (FaceValue f: FaceValue.values()){
               final Card c = new Card(s,f);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(myCards);
    }
}
