package com.babayomi.temitope.models;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class CurrencyResponseTest {

	@Test
	public void test() {
		CurrencyResponse currencyResponse = new CurrencyResponse();
        assertEquals(currencyResponse.getDateTime(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

	}

}
