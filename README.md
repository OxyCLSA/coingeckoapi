# CoinGeckoAPI

Este projeto demonstra o consumo da API da CoinGecko para obter informações sobre criptomoedas. Ele foi desenvolvido utilizando Spring Boot e expõe um endpoint REST para recuperar dados específicos de uma moeda.

## Funcionalidades

* **GET /api/coins/{coinId}**: Retorna dados detalhados sobre uma criptomoeda específica, utilizando o ID fornecido pela CoinGecko.
* http://localhost:8080/api/coins/bitcoin
* {
  "id": "bitcoin",
  "symbol": "btc",
  "name": "Bitcoin",
  "market_data": {
    "current_price": {
      "usd": 50000
    }
  }
}

## Tecnologias Utilizadas

* **Java**: Linguagem de programação principal.
* **Spring Boot**: Framework para desenvolvimento de aplicações Java Spring.
* **RestTemplate**: Utilizado para fazer requisições HTTP para a API da CoinGecko.
* **Maven**: Gerenciador de dependências e construção do projeto.

## Pré-requisitos

* **Java JDK**: Versão 17 ou superior.
* **Maven**: Versão 3.6 ou superior.
* **IDE (Opcional)**: IntelliJ IDEA, Eclipse ou outra IDE de sua preferência.

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git](https://www.google.com/search?q=https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git)  # Substitua pelo seu repositório
