package com.currency.converter;

import com.exchange.rates.ExchangeRateProvider;
import com.exchange.rates.ExchangeRateProviderImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        ExchangeRateProvider provider = new ExchangeRateProviderImpl();
        CurrencyConverter converter = new CurrencyConverter(provider);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from currency (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();
        System.out.print("Enter to currency (e.g., EUR): ");
        String toCurrency = scanner.next().toUpperCase();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, toCurrency);
    }
}
