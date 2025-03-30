package com.exchange.rates;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRateProviderImpl implements ExchangeRateProvider{
    private static final Map<String, Double> RATES = new HashMap<>();

    static {
        RATES.put("USD_EUR", 0.85);
        RATES.put("EUR_USD", 1.18);
        RATES.put("USD_GBP", 0.75);
        RATES.put("GBP_USD", 1.33);
    }

    @Override
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        return RATES.getOrDefault(fromCurrency + "_" + toCurrency, 1.0);
    }
}
