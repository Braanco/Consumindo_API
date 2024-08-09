package br.com.fipe.demo.service;

import java.util.List;

public interface IconverteDados {

    <T> T obterDados(String json, Class<T> Class );
    <T> List<T> obterLista(String json, Class<T> classe);
}
