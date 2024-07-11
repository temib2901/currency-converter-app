package com.babayomi.temitope;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.babayomi.temitope.controllers.ExchangeService;
import com.babayomi.temitope.models.CurrencyRequest;
import com.babayomi.temitope.models.CurrencyResponse;

class ExchangeMainTest {

	@Test
	void test() throws IOException {
		ExchangeService exchangeService = new ExchangeService();
        CurrencyRequest currencyRequest = new CurrencyRequest("USD", "NGN", 1.0);
        String expectedResponse = exchangeService.exchangeCurrencies(currencyRequest).toString();
        String actualResponse = new CurrencyResponse("USD", "NGN", 1538.1815, 1538.1815).toString();
        assertEquals(expectedResponse, actualResponse);
	}

}
