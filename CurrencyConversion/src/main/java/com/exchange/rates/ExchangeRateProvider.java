package com.exchange.rates;

public interface ExchangeRateProvider {
    double getExchangeRate(String fromCurrency, String toCurrency);
}
