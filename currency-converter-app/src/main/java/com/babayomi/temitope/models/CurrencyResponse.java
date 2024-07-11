package com.babayomi.temitope.models;

import java.time.LocalDateTime;

public class CurrencyResponse {

	public CurrencyResponse() {
	}

	public CurrencyResponse(String baseCurrency, String targetCurrency, double conversionRate, double conversionResult) {
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;
		this.conversionRate = conversionRate;
		this.conversionResult = conversionResult;
		this.localDateTime = LocalDateTime.now();
	}

	private String baseCurrency;
	private String targetCurrency;
	private double conversionRate;
	private double conversionResult;
	private LocalDateTime localDateTime;
	
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
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

	public double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public double getConversionResult() {
		return conversionResult;
	}

	public void setConversionResult(double conversionResult) {
		this.conversionResult = conversionResult;
	}

}
