package br.com.coingeckoapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinGeckoService {

    private final String API_URL = "https://api.coingecko.com/api/v3";

    public String getCoinData(String coinId) {
        String url = API_URL + "/coins/" + coinId;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}