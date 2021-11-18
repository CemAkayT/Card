package com.company;

public class Main {

    public static void main(String[] args) {
        Card c1 = new Card("Hearts",1);
        Card c2 = new Card("Hearts",1);
        Card c3 = new Card("Spades",3);
        Card c4 = new Card("Clubs",4);

        System.out.println(c1.beats(c2));
        System.out.println(c2.beats(c1));

    }
}