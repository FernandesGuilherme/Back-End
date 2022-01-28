package Modelo_Biblioteca;

import java.util.Date;

public  abstract class  Pessoa {
        private long cpf;
        private String email;
        private String login;
        private Date nascimento;
        private String nome;
        private String senha;
        private String sobrenome;

    public Pessoa(long cpf, String email, String login, Date nascimento, String nome, String senha, String sobrenome) {
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.nascimento = nascimento;
        this.nome = nome;
        this.senha = senha;
        this.sobrenome = sobrenome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
