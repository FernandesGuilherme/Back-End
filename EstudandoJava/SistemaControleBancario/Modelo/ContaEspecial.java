package SistemaControleBancario.Modelo;

import java.time.LocalDate;

public class ContaEspecial extends  ContaComum {
    private double limiteConta;

    public ContaEspecial(int numeroConta, LocalDate aberturaConta, LocalDate fechamentoConta, int situacaoConta, int senhaConta, double saldoConta, double limiteConta) {
        super(numeroConta, aberturaConta, fechamentoConta, situacaoConta, senhaConta, saldoConta);
        this.limiteConta = limiteConta;
    }

    public ContaEspecial() {
        this.limiteConta = limiteConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public void sacarValor (double valor){
        if (this.getSaldoConta() != 0) {
            if (valor < this.getSaldoConta()) {
                this.setSaldoConta(getSaldoConta() - valor);
                System.out.println("Sacado com sucesso");
            } else {
                throw new IllegalArgumentException("Valor superior ao saldo");
            }
        } else {
            throw new IllegalArgumentException("Sem saldo para saque");
        }
    }
}
