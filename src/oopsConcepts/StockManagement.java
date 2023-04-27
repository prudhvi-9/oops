package oopsConcepts;

public class StockManagement {
	/**
	 * Declaring Variables
	 */
	private static String stockName;
	private static int numberOfShares;
	private static int sharePrice;
	private int TotalValueOfEachStock;
	private int getNumberOfShares;
	private static int total;
	private static int totalStocks;

	/**
	 * Constructor
	 * 
	 * @param stockName
	 * @param numberOfShares
	 * @param sharePrice
	 * @param total
	 */
	StockManagement(String stockName, int numberOfShares, int sharePrice, int total) {
		super();
		this.stockName = stockName;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
		this.total = total;
	}

	/**
	 * Getter and Setter methods.
	 * 
	 * @return
	 */
	public static String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public static int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public static int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public static int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "StockAccountManagement [stockName=" + stockName + ", numberOfShares=" + numberOfShares + ", sharePrice="
				+ sharePrice + "]";
	}

	/**
	 * To find total value of each stock.
	 */
	public void TotalValueOfEachStock() {
		int share = StockManagement.getNumberOfShares();
		int price = StockManagement.getSharePrice();
		total = share * price;
		System.out.println("Total Value Of  " + getStockName() + "  is  " + total);
	}

	/**
	 * To find total value of all stocks.
	 */
	public static void TotalValueStocks() {
		totalStocks += getTotal();
		System.out.println("Total Value Of Stocks are " + totalStocks);
	}
}
