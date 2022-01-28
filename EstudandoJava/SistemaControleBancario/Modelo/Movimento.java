package SistemaControleBancario.Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movimento {

    private int id;
    private int tipoMovimento;
    private LocalDateTime dataHoraMovimento;
    private double valorMovimento;
    private ContaComum conta;

    public Movimento(int id, int tipoMovimento, LocalDateTime dataHoraMovimento, double valorMovimento, ContaComum conta) {
        this.id = id;
        this.tipoMovimento = tipoMovimento;
        this.dataHoraMovimento = dataHoraMovimento;
        this.valorMovimento = valorMovimento;
        this.conta = conta;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int gettipoMovimento() {
        return tipoMovimento;
    }

    public void settipoMovimento(int tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public LocalDateTime getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public double getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(double valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public ContaComum getContaMovimento() {
        return conta;
    }

    public void setContaMovimento(ContaComum conta) {
        this.conta = conta;
    }

    public void validarMovimento() {
        if (this.conta != null) {
            if (this.tipoMovimento == 1) { // 1 Deposito
                this.conta.setSaldoConta(this.conta.getSaldoConta() + this.valorMovimento);
                System.out.println("Deposito realizado, obrigado!");

            } else if (this.tipoMovimento == 2) { // 2 Saque
                if (this.conta.getSaldoConta() >= this.valorMovimento) {
                    this.conta.setSaldoConta(this.conta.getSaldoConta() - this.valorMovimento);
                    System.out.printf("Saque realizado, saldo atual é : " + this.conta.getSaldoConta());
                } else {
                    System.out.println("Seu saldo é de: " + this.conta.getSaldoConta());
                    throw new IllegalArgumentException("Você não tem " + this.valorMovimento+" R$ para saque");
                }
            }
        }
    }
}
