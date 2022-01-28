package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CadastrarPessoaTest {
    CadastroPessoa cadastro;
    Pessoa pessoa;

    @Before
    public void executeAntes (){
        cadastro = new CadastroPessoa();
        pessoa = new Pessoa();
    }

    @Test
    public void criarPessoa(){

        //Valida se o método getPessoa não foi iniciado
        Assert.assertNotNull(cadastro.getPessoas());
    }

    @Test
    public void adicionarPessoa(){
        //Cenario
        pessoa.setNome("Guilherme"); //Seto o nome

        //Execução
        cadastro.adicionar(pessoa); // Adiciono uma nova pessoa com um nome setado

        //Verificação
        Assert.assertNotNull(cadastro.getPessoas().contains(pessoa)); // Valido se estou criando uma pessoa corretamente.

    }

    //Lança excessão se criar uma pessoa sem nome, teste deve passar.
    @Test(expected = PessoaSemNomeExeption.class) // Cria uma Expetion
    public void erroAoCriarPessoaSemNome() {
        cadastro.adicionar(pessoa);
    }

    @Test
    public void removerPessoaTeste (){
        //Cenário
        pessoa.setNome("Guilherme"); //Seto o nome
        cadastro.adicionar(pessoa); // Adiciono

        //Execução
        cadastro.remove(pessoa); //Removo

        //Verificação
            Assert.assertNull(cadastro.getPessoas()); // Valido se e nulo, o certo e validar se esta vazio.
    }
}
