package oopsConcepts;

public class MainDeckOfCard {
	/**
	 * This method is created to Print the Cards received by the Players using 2D
	 * Array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Creating an object of Cards.
		 */
		DeckOfCards deckOfCard = new DeckOfCards();

		deckOfCard.deckOfCards();
		deckOfCard.noOfPlayers();
		deckOfCard.shuffle();
		System.out.println("-----------------------------");

	}

}
