package com.company;
/*
enum Suit{
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
}
*/
public class  Card {
    private String suit;
    private int value;


    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean beats(Card otherCard) {
        if (this.suit == "Hearts") {
            return true;

        } else if (this.suit == "Diamonds" && otherCard.suit != ("Hearts")) {
            return true;

        } else if (this.suit == "Spades" && otherCard.suit != ("Diamonds") && otherCard.suit != ("Hearts")) {
            return true;

        } else if (this.suit == "Clubs" && otherCard.suit != ("Spades") && otherCard.suit != "Diamonds" && otherCard.suit != "Hearts") {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Card: " + suit + ", " + value;
    }
}
