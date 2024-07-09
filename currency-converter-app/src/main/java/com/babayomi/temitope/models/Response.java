package com.babayomi.temitope.models;

public class Response {

	public Response() {
	}

	public Response(String baseCurrency, String targetCurrency, double conversion_rate, double conversion_result) {
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.conversion_rate = conversion_rate;
		this.conversion_result = conversion_result;
	}

	private String baseCurrency;
	private String targetCurrency;
	private double conversion_rate;
	private double conversion_result;

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

	public double getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(double conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public double getConversion_result() {
		return conversion_result;
	}

	public void setConversion_result(double conversion_result) {
		this.conversion_result = conversion_result;
	}

}
