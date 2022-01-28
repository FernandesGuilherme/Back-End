package Modelo_Biblioteca;

import java.util.Date;

public class Autor extends  Pessoa {
    private String nomeCetacoes;
    private String orcid;

    public Autor(long cpf, String email, String login, Date nascimento, String nome, String senha, String sobrenome, String nomeCetacoes, String orcid) {
        super(cpf, email, login, nascimento, nome, senha, sobrenome);

        this.nomeCetacoes = nomeCetacoes;
        this.orcid = nome;
    }

    public String getNomeCetacoes() {
        return nomeCetacoes;
    }

    public void setNomeCetacoes(String nomeCetacoes) {
        this.nomeCetacoes = nomeCetacoes;
    }

    public String getOrcid() {
        return orcid;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }
}
