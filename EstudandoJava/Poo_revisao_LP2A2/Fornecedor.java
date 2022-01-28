package Poo_revisao_LP2A2;

import java.time.LocalDate;

public interface Fornecedor {
    public String emitirFaturaDoPeriodo (LocalDate inicio, LocalDate fim);
}
