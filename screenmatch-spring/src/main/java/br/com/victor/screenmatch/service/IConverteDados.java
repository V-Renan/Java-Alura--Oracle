package br.com.victor.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
