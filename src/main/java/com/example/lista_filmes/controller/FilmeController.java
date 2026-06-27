package com.example.lista_filmes.controller;

import com.example.lista_filmes.model.Filme;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/filmes")

public class FilmeController {

    private List<Filme> meusFilmes = new ArrayList<>();

    public FilmeController() { //Apenas para adionar esses 3 filmes
        Filme filme1 = new Filme();
        filme1.setTitulo("O Rei Leão");
        filme1.setGenero("Animação");
        filme1.setBemAvaliado(true);

        meusFilmes.add(filme1);

        Filme filme2 = new Filme();
        filme2.setTitulo("O sonho da liberdade");
        filme2.setGenero("Drama");
        filme2.setBemAvaliado(false);

        meusFilmes.add(filme2);

        Filme filme3 = new Filme();
        filme3.setTitulo("O Poderoso Chefão");
        filme3.setGenero("Animação");
        filme3.setBemAvaliado(true);

        meusFilmes.add(filme3);

    }

    @GetMapping
    public List<Filme> enviarFilmesParaInternet() {
        return meusFilmes;
    } //Listagem de filmes

    @PostMapping("/criarFilme")
    public String criarFilme(@RequestBody Filme novoFilme) {
        meusFilmes.add(novoFilme);
        return "Sucesso";
    }

    @DeleteMapping("/deletarFilme/{titulo}")
    public String deletarFilme(@PathVariable String titulo) {
        meusFilmes.removeIf(filme -> filme.getTitulo().equalsIgnoreCase(titulo));
        return "Deletado";
    }
}