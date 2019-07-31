package org.erbyn.dennis;

public final class Card {
  private Suit nameOfSuits;
  private FaceValue value;

    public Card(Suit nameOfSuits, FaceValue value) {
        this.nameOfSuits = nameOfSuits;
        this.value = value;
    }

    public Suit getNameOfSuits() {
        return nameOfSuits;
    }

    public void setNameOfSuits(Suit nameOfSuits) {
        this.nameOfSuits = nameOfSuits;
    }

    public FaceValue getValue() {
        return value;
    }

    public void setValue(FaceValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "nameOfSuits=" + nameOfSuits +
                ", value=" + value +
                '}';
    }
}
