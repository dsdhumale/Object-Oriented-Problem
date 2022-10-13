package com.Bridgelabz.Day11;

public class StockAccount {

	String stockName;
	float LTP;
	float Quantity;

	StockAccount(String stockName, float LTP, float Quantity) {
		this.stockName = stockName;
		this.LTP = LTP;
		this.Quantity = Quantity;
	}

	public void toGetTotalValue() {
		float total = LTP * Quantity;
		System.out.println("Value of each stock " + stockName + " is " + LTP);
		System.out.println("Total value require for investment of " + stockName + " for number of share " + Quantity
				+ " is " + total);

	}

	public static void main(String[] args) {
		StockAccount DMART = new StockAccount("DMART", 4115.64f, 10f);
		StockAccount ZEEL = new StockAccount("Zeel", 263.90f, 100f);
		DMART.toGetTotalValue();
		ZEEL.toGetTotalValue();

	}
}
