package com.currency.converter;

import com.exchange.rates.ExchangeRateProvider;

public class CurrencyConverter {
    private final ExchangeRateProvider exchangeRateProvider;

    public CurrencyConverter(ExchangeRateProvider exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double rate = exchangeRateProvider.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
