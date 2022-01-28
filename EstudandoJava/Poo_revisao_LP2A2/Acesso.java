package Poo_revisao_LP2A2;

import java.time.LocalDate;

public class Acesso {

    private LocalDate login;
    private  LocalDate logout;
    private Pessoa pessoa;

    public Acesso(LocalDate login, Pessoa pessoa) {
        this.login = login;
        this.logout = logout;
        this.pessoa = pessoa;
    }

    public LocalDate getLogin() {
        return login;
    }

    public void setLogin(LocalDate login) {
        this.login = login;
    }

    public LocalDate getLogout() {
        return logout;
    }

    public void setLogout(LocalDate logout) {
        this.logout = logout;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
