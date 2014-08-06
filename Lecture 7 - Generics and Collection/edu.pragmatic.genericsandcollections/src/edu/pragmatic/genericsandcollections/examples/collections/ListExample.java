package edu.pragmatic.genericsandcollections.examples.collections;

import java.util.ArrayList;
import java.util.List;
import static edu.pragmatic.genericsandcollections.examples.collections.Color.*;
import static edu.pragmatic.genericsandcollections.examples.collections.Rank.*;

public class ListExample {

	public static void main(String[] args) {
		List<String> cards = buildACardDeck();
		
		System.out.println(cards);
	}

	public static List<String> buildACardDeck() {
		List<String> cards = new ArrayList<>();
		cards.add("2 of spades");    cards.add("2 of hearts");    cards.add("2 of diamond");    cards.add("2 of clubs");
		cards.add("3 of spades");    cards.add("3 of hearts");    cards.add("2 of diamond");    cards.add("2 of clubs");
		cards.add("4 of spades");    cards.add("4 of hearts");    cards.add("3 of diamond");    cards.add("3 of clubs");
		cards.add("5 of spades");    cards.add("5 of hearts");    cards.add("5 of diamond");    cards.add("4 of clubs");
		cards.add("6 of spades");    cards.add("6 of hearts");    cards.add("6 of diamond");    cards.add("5 of clubs");
		cards.add("7 of spades");    cards.add("7 of hearts");    cards.add("7 of diamond");    cards.add("6 of clubs");
		cards.add("8 of spades");    cards.add("8 of hearts");    cards.add("8 of diamond");    cards.add("7 of clubs");
		cards.add("9 of spades");    cards.add("9 of hearts");    cards.add("9 of diamond");    cards.add("8 of clubs");
		cards.add("10 of spades");   cards.add("10 of hearts");   cards.add("10 of diamond");   cards.add("9 of clubs");
		cards.add("Jack of spades"); cards.add("Jack of hearts"); cards.add("Jack of diamond"); cards.add("10 of clubs");
		cards.add("Queen of spades");cards.add("Queen of hearts");cards.add("Queen of diamond");cards.add("Queen of clubs");
		cards.add("King of spades"); cards.add("King of hearts"); cards.add("King of diamond"); cards.add("King of clubs");
		cards.add("Ace of spades");  cards.add("Ace of hearts");  cards.add("Ace of diamond");  cards.add("Ace of clubs");
		return cards;
	}
	
	public static List<Card> newCardDeck(){
		List<Card> cards = new ArrayList<>(52);
		cards.add(new Card(TWO, SPADE));  cards.add(new Card(TWO, HEART));  cards.add(new Card(TWO, DIAMOND));  cards.add(new Card(TWO, CLUB));
		cards.add(new Card(TREE, SPADE)); cards.add(new Card(TREE, HEART)); cards.add(new Card(TREE, DIAMOND)); cards.add(new Card(TREE, CLUB));
		cards.add(new Card(FOUR, SPADE)); cards.add(new Card(FOUR, HEART)); cards.add(new Card(FOUR, DIAMOND)); cards.add(new Card(FOUR, CLUB));
		cards.add(new Card(FIVE, SPADE)); cards.add(new Card(FIVE, HEART)); cards.add(new Card(FIVE, DIAMOND)); cards.add(new Card(FIVE, CLUB));
		cards.add(new Card(SIX, SPADE));  cards.add(new Card(SIX, HEART));  cards.add(new Card(SIX, DIAMOND));  cards.add(new Card(SIX, CLUB));
		cards.add(new Card(SEVEN, SPADE));cards.add(new Card(SEVEN, HEART));cards.add(new Card(SEVEN, DIAMOND));cards.add(new Card(SEVEN, CLUB));
		cards.add(new Card(EIGHT, SPADE));cards.add(new Card(EIGHT, HEART));cards.add(new Card(EIGHT, DIAMOND));cards.add(new Card(EIGHT, CLUB));
		cards.add(new Card(NINE, SPADE)); cards.add(new Card(NINE, HEART)); cards.add(new Card(NINE, DIAMOND)); cards.add(new Card(NINE, CLUB));
		cards.add(new Card(TEN, SPADE));  cards.add(new Card(TEN, HEART));  cards.add(new Card(TEN, DIAMOND));  cards.add(new Card(TEN, CLUB));
		cards.add(new Card(JACK, SPADE)); cards.add(new Card(JACK, HEART)); cards.add(new Card(JACK, DIAMOND)); cards.add(new Card(JACK, CLUB));
		cards.add(new Card(QUEEN, SPADE));cards.add(new Card(QUEEN, HEART));cards.add(new Card(QUEEN, DIAMOND));cards.add(new Card(QUEEN, CLUB));
		cards.add(new Card(KING, SPADE)); cards.add(new Card(KING, HEART)); cards.add(new Card(KING, DIAMOND)); cards.add(new Card(KING, CLUB));
		cards.add(new Card(ACE, SPADE));  cards.add(new Card(ACE, HEART));  cards.add(new Card(ACE, DIAMOND));  cards.add(new Card(ACE, CLUB));
		
		return cards;
	}
	
}
