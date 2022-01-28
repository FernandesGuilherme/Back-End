package SistemaControleBancario.Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContaComum {
    private int  numeroConta;
    private LocalDate aberturaConta;
    private LocalDate fechamentoConta;
    private  int situacaoConta;
    private int senhaConta;
    private double saldoConta;
    //private ArrayList<Movimento>movimentosConta;

    public ContaComum(int numeroConta, LocalDate aberturaConta, LocalDate fechamentoConta, int situacaoConta, int senhaConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.aberturaConta = aberturaConta;
        this.fechamentoConta = fechamentoConta;
        this.situacaoConta = situacaoConta;
        this.senhaConta = senhaConta;
        this.saldoConta = saldoConta;
    }
    public  ContaComum(){

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public LocalDate getAberturaConta() {
        return aberturaConta;
    }

    public void setAberturaConta(LocalDate aberturaConta) {
        this.aberturaConta = aberturaConta;
    }

    public LocalDate getFechamentoConta() {
        return fechamentoConta;
    }

    public void setFechamentoConta(LocalDate fechamentoConta) {
        this.fechamentoConta = fechamentoConta;
    }

    public int getSituacaoConta() {
        return situacaoConta;
    }

    public void setSituacaoConta(int situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    public int getSenhaConta() {
        return senhaConta;
    }

    public void setSenhaConta(int senhaConta) {
        this.senhaConta = senhaConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
