package Modelo_Biblioteca;

import java.time.LocalDateTime;
import java.util.Date;

public class Emprestimo {
    private LocalDateTime dataRetirada;
    private LocalDateTime DataDevolucao;
    private Date DataDevolucaoPrevista;

    public Emprestimo(LocalDateTime dataRetirada, LocalDateTime dataDevolucao, Date dataDevolucaoPrevista) {
        this.dataRetirada = dataRetirada;
        DataDevolucao = dataDevolucao;
        DataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDateTime getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDateTime dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDateTime getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public Date getDataDevolucaoPrevista() {
        return DataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(Date dataDevolucaoPrevista) {
        DataDevolucaoPrevista = dataDevolucaoPrevista;
    }
}
