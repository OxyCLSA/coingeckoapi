package br.com.coingeckoapi.service;

import br.com.coingeckoapi.exception.CoinNotFoundException;
import br.com.coingeckoapi.model.CoinData;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class CoinGeckoService {

    private final String API_URL = "https://api.coingecko.com/api/v3";

    @Cacheable("coinData")
    public CoinData getCoinData(String coinId) {
        String url = API_URL + "/coins/" + coinId;
        RestTemplate restTemplate = new RestTemplate();

        try {
            return restTemplate.getForObject(url, CoinData.class);
        } catch (HttpClientErrorException.NotFound e) {
            throw new CoinNotFoundException("Criptomoeda não encontrada: " + coinId);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao acessar a API do CoinGecko", e);
        }
    }
}