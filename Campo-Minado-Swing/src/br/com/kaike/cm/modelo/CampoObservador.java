package br.com.kaike.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

    public void eventoOcorreu(Campo campo, CampoEvento evento);

}
