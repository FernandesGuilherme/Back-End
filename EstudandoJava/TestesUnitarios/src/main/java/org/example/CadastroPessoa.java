package org.example;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private List <Pessoa> pessoas;

    public CadastroPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public List <Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void adicionar(Pessoa pessoa) {
        // Caso não seja passa um nome ao instânciar uma nova pessoa eu lanço uma excessão.
        if (pessoa.getNome() == null){
            throw new PessoaSemNomeExeption(); // Essa aqui que é uma classe que.
        }
        this.pessoas.add(pessoa);
        //Adiciona na lista de pessoas uma pessoa
    }

    public void remove (Pessoa pessoa){
       this.pessoas.remove(pessoa);
       pessoas = null;
    }
}
