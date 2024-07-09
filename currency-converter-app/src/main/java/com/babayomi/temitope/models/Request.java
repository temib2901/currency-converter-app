package com.babayomi.temitope.models;

public class Request {
	private String baseCurrency;
	private String targetCurrency;
	private double amount;

	public Request() {
	}

	public Request(String baseCurrency, String targetCurrency, double amount) {
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.amount = amount;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
