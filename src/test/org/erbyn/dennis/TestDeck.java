package org.erbyn.dennis;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDeck {

    @Test
    public void onDeckUpTo52(){
            Deck.setMyCards();
            assertEquals("It should be 52", 16, Deck.getMyCards().size());
    }

}
