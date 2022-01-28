package Modelo_Biblioteca;

import java.util.Date;

public class Bibliotecario extends Pessoa {

    private Date dataAdmissao;
    private int idFuncionario;
    public Bibliotecario(long cpf, String email, String login, Date nascimento, String nome, String senha, String sobrenome, Date dataAdmissao, int idFuncionario) {
        super(cpf, email, login, nascimento, nome, senha, sobrenome);

        this.dataAdmissao = dataAdmissao;
        this.idFuncionario = idFuncionario;
    }
}
