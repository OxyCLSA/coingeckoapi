package br.com.coingeckoapi.controller;

import br.com.coingeckoapi.model.CoinData;
import br.com.coingeckoapi.service.CoinGeckoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coins")
public class CoinGeckoController {

    @Autowired
    private CoinGeckoService coinGeckoService;

    @GetMapping("/{coinId}")
    public CoinData getCoinData(@PathVariable String coinId) {
        return coinGeckoService.getCoinData(coinId);
    }
}