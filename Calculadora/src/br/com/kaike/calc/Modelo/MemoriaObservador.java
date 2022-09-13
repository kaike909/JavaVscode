package br.com.kaike.calc.Modelo;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);

}
