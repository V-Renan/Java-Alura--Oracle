package br.com.victor.servico;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateService {
    private static final String API_KEY = "226ccffdecccc588672b06c3";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {
        String urlStr = BASE_URL + API_KEY + "/latest/" + baseCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonObject root = jp.parse(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();
        JsonObject rates = root.getAsJsonObject("conversion_rates");
        return rates.get(targetCurrency).getAsDouble();
    }
}
