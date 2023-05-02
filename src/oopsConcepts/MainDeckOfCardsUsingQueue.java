package oopsConcepts;

public class MainDeckOfCardsUsingQueue {

	/**
	 * Using 2d arrays for storing suits and ranks.
	 */

	static String[] suits = { "Clubs", "Diamond", "Heart", "Spades" };
	static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	static String[][] deckCards = new String[suits.length][ranks.length];
	static String[] player1 = new String[9];
	static String[] player2 = new String[9];
	static String[] player3 = new String[9];
	static String[] player4 = new String[9];

	/**
	 * For sorting the cards.
	 * 
	 * @param arrays
	 * @return-arrays
	 */
	public static String[] sortingCards(String[] arrays) {
		for (int i = 0; i < arrays.length - 1; i++) {
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[i].compareTo(arrays[j]) > 0) {
					String temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp;
				}
			}
		}
		return arrays;
	}

	/**
	 * To distrubte the cards.
	 * 
	 * @param queueAll
	 * @param deckCards
	 */
	public static void distrubutingCards(DeckOfCardsUsingQueue<String> queueAll, String[][] deckCards) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0) {
					player1[j] = deckCards[i][j];
					queueAll.dequeue();
				} else if (i == 1) {
					player2[j] = deckCards[i][j];
					queueAll.dequeue();
				} else if (i == 2) {
					player3[j] = deckCards[i][j];
					queueAll.dequeue();
				} else {
					player4[j] = deckCards[i][j];
					queueAll.dequeue();
				}
			}
		}
	}

	/**
	 * To shuffle the cards.
	 * 
	 * @param deckCards
	 * @param suits
	 * @param ranks
	 * @return-deck
	 */
	public static String[][] shuffle(String[][] deckCards, String[] suits, String[] ranks) {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				int ran1 = (int) (Math.random() * suits.length);
				int ran2 = (int) (Math.random() * ranks.length);
				String temp = deckCards[ran1][ran2];
				deckCards[ran1][ran2] = deckCards[i][j];
				deckCards[i][j] = temp;
			}
		}
		return deckCards;
	}

	/**
	 * To insert the arrays into the queue
	 * 
	 * @param queue
	 * @param arrays
	 * @return
	 */
	public static DeckOfCardsUsingQueue<String> insertTo(DeckOfCardsUsingQueue<String> queue, String[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			queue.enqueue(arrays[i]);
		}
		return queue;
	}

	public static void main(String[] args) {
		/**
		 * Creating a new object of queue's.
		 */
		DeckOfCardsUsingQueue<String> playerQueue1 = new DeckOfCardsUsingQueue<>();
		DeckOfCardsUsingQueue<String> playerQueue2 = new DeckOfCardsUsingQueue<>();
		DeckOfCardsUsingQueue<String> playerQueue3 = new DeckOfCardsUsingQueue<>();
		DeckOfCardsUsingQueue<String> playerQueue4 = new DeckOfCardsUsingQueue<>();
		DeckOfCardsUsingQueue<String> playerQueueAll = new DeckOfCardsUsingQueue<>();
		/**
		 * To read the deck of cards.
		 */
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deckCards[i][j] = ranks[j] + " of " + suits[i];
			}
		}

		/**
		 * To shuffle the deck of cards by calling the shuffle method.
		 */
		deckCards = shuffle(deckCards, suits, ranks);
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				playerQueueAll.enqueue(deckCards[i][j]);
			}
		}
		/**
		 * Distrubuting the cards by calling distrubutingCards method . And sorting the
		 * deck of cards.
		 */
		distrubutingCards(playerQueueAll, deckCards);
		player1 = sortingCards(player1);
		player2 = sortingCards(player2);
		player3 = sortingCards(player3);
		player4 = sortingCards(player4);
		/**
		 * Inserting the arrays into queue
		 */
		playerQueue1 = insertTo(playerQueue1, player1);
		playerQueue2 = insertTo(playerQueue2, player2);
		playerQueue3 = insertTo(playerQueue3, player3);
		playerQueue4 = insertTo(playerQueue4, player4);

		System.out.println("Player 1 has got cards:");
		playerQueue1.display();
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Player 2 has got cards:");
		playerQueue2.display();
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Player 3 has got cards:");
		playerQueue3.display();
		System.out.println("\n--------------------------------------------------------");
		System.out.println("Player 4 has got cards:");
		playerQueue4.display();
		System.out.println("\n--------------------------------------------------------");
	}
}
