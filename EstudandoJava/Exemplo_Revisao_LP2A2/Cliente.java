package Exemplo_Revisao_LP2A2;
import java.time.LocalDate;

public interface Cliente {
    public String obterPedidosDoPeriodo(LocalDate inicio, LocalDate fim);

}
