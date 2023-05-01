package oopsConcepts;

import java.util.ArrayList;

public class DeckOfCards {
	public ArrayList<String> cardDeck = new ArrayList<String>();

	/*
	 * Using 2d arrays for storing suits and ranks.
	 */

	public void deckOfCards() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		String[][] card = new String[suits.length][ranks.length];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardDeck.add(suits[j] + "-->" + ranks[i] + " ");
			}
		}
	}

	/*
	 * no of players.
	 */
	public void noOfPlayers() {
		int player = 4;
		sequenceOfPlay(player);
	}

	/**
	 * To play the game in sequential order.
	 */
	public void sequenceOfPlay(int player) {
		shuffle(cardDeck, player);
	}

	/*
	 * Shuffling the cards by using Math.random .
	 * 
	 */
	public void shuffle() {
		return;
	}

	public static ArrayList<String> shuffle(ArrayList<String> cardDeck, int player) {
		ArrayList<String> forInstant = new ArrayList<String>();
		while (!cardDeck.isEmpty()) {
			int random = (int) (Math.random() * cardDeck.size());
			forInstant.add(cardDeck.get(random));
			cardDeck.remove(random);
		}
		cardDeck = forInstant;
		cardDistribution(cardDeck, player);
		return cardDeck;
	}

	/*
	 * To distribute cards to the players.
	 * 
	 */
	public static void cardDistribution(ArrayList<String> cardDeck, int player) {
		for (int i = 0; i < 4; i++) {
			System.out.println("----------------------------------------");
			System.out.println("Player " + (i + 1) + " has got cards:");
			for (int j = 0; j < 9; j++) {
				System.out.println("" + cardDeck.get(i + j * player));
			}
		}
	}
}
