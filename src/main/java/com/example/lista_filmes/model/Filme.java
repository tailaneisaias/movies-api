package com.example.lista_filmes.model;

public class Filme {
    private String titulo;
    private String genero;
    private boolean bemAvaliado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isBemAvaliado() {
        return bemAvaliado;
    }

    public void setBemAvaliado(boolean bemAvaliado) {
        this.bemAvaliado = bemAvaliado;
    }
}