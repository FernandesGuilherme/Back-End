package Modelo_Biblioteca;

import java.util.Date;

public class UsuarioComum  extends  Pessoa {
    private Date dataCadastro;
    private int idUsuario;

    public UsuarioComum(long cpf, String email, String login, Date nascimento, String nome, String senha, String sobrenome, Date dataCadastro, int idUsuario) {
        super(cpf, email, login, nascimento, nome, senha, sobrenome);

        this.dataCadastro = dataCadastro;
        this.idUsuario = idUsuario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
