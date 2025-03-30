package com.currency.converter;

import com.exchange.rates.ExchangeRateProvider;
import com.exchange.rates.ExchangeRateProviderImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {
    @Test
    public void testConversion() {
        ExchangeRateProvider provider = new ExchangeRateProviderImpl();
        CurrencyConverter converter = new CurrencyConverter(provider);

        assertEquals(85.0, converter.convert("USD", "EUR", 100), 0.01);
        assertEquals(118.0, converter.convert("EUR", "USD", 100), 0.01);
        assertEquals(75.0, converter.convert("USD", "GBP", 100), 0.01);
        assertEquals(133.0, converter.convert("GBP", "USD", 100), 0.01);

    }
}
