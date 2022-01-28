package Poo_revisao_LP2A2;

import java.time.LocalDate;
import java.util.Date;

public class PessoaFisica extends Pessoa implements Funcionario {
    private long cpf;
    private String telefoneCelular;
    private LocalDate nascimento;
    private String naturalidade;
    private boolean valeTransporte;
    private  double valorValeTransporte;
    private boolean valeAlimentacao;
    private  double valorValeAlimentacao;

    public  PessoaFisica (String nome, String telefoneFixo, double rendaBruta, String login,  String senha, long cpf, LocalDate nascimento, String naturalidade,
                          String telefoneCelular){
        super (nome,  telefoneFixo, rendaBruta,  login,  senha); // Chamada do contrutor da classe mãe
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.naturalidade = naturalidade;
        this.telefoneCelular = telefoneCelular;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public boolean isValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(boolean valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getValorValeTransporte() {
        return valorValeTransporte;
    }

    public void setValorValeTransporte(double valorValeTransporte) {
        this.valorValeTransporte = valorValeTransporte;
    }

    public boolean isValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(boolean valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getValorValeAlimentacao() {
        return valorValeAlimentacao;
    }

    public void setValorValeAlimentacao(double valorValeAlimentacao) {
        this.valorValeAlimentacao = valorValeAlimentacao;
    }
    @Override
    public double calcularRendaLiquida() {
        return 0;
    }
}
