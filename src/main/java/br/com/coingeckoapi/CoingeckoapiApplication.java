package br.com.coingeckoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CoingeckoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoingeckoapiApplication.class, args);
	}
}