package Poo_revisao_LP2A2;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
    private long cnpj;
    private  String nomeFantasia;

    public PessoaJuridica (String nome,String telefoneFixo, double rendaBruta, String login,  String senha, long cnpj, String nomeFantasia){
        super (nome, telefoneFixo,  rendaBruta, login,  senha);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


}
