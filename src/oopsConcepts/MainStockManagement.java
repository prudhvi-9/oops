package oopsConcepts;
import java.util.ArrayList;
import java.util.Scanner;

public class MainStockManagement {
	/**
	 * Creating new Arraylist stockList.
	 */
	static ArrayList<StockManagement> stocksList = new ArrayList<>();
	static Scanner cs = new Scanner(System.in);
	static int option;

	/**
	 * This method is created to know total value of each Stock and the total value
	 * of Stocks.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		addStock();
		mainmenu();
		int option = sc.nextInt();
		switch (option) {
		case 1:
			addStock();
			menu();
			int choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Exiting..");
				break;
			case 1:
				addStock();
				break;
			}
			break;
		case 2:
			System.out.println("Exiting..");

		}
		sc.close();
	}

	/**
	 * To know what activity user want to perform.
	 */
	public static void mainmenu() {
		System.out.println("What would you like to do\n1)Add 2)Exit");

	}

	public static void menu() {
		System.out.println("What would you like to do\n1)Add 0)Exit");

	}

	/**
	 * To add stock name,shares and share price of different stocks.
	 */
	public static void addStock() {
		/**
		 * Creating new object stock.
		 */
		StockManagement stock = new StockManagement(null, option, option, option);

		System.out.println("Enter Stock Name:");
		stock.setStockName(cs.next());

		System.out.println("Enter Number of shares:");
		stock.setNumberOfShares(cs.nextInt());

		System.out.println("Enter Share Price:");
		stock.setSharePrice(cs.nextInt());

		/**
		 * Adding elements to the arraylist.
		 */
		stocksList.add(stock);
		System.out.println("Stock Report:");
		System.out.println(stocksList);

		/**
		 * Finding total value of each stock.
		 */
		stock.TotalValueOfEachStock();
		System.out.println("-------------------------------------------------------------------------------");
		/**
		 * Finding total value of all stocks.
		 */
		stock.TotalValueStocks();
		System.out.println("-------------------------------------------------------------------------------");

	}

}
