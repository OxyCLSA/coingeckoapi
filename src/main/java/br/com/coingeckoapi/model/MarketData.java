package br.com.coingeckoapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketData {

    @JsonProperty("current_price")
    private CurrentPrice currentPrice;

    // Getters e Setters
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }
}