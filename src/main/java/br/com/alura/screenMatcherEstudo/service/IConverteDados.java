package br.com.alura.screenMatcherEstudo.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
