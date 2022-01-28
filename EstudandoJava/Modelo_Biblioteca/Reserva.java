package Modelo_Biblioteca;

import java.time.LocalDateTime;

public class Reserva {
    private LocalDateTime dataReserva;
    private LocalDateTime dataExpiracao;

    public  Reserva (LocalDateTime dataReserva, LocalDateTime dataExpiracao) {
        this.dataReserva = dataReserva;
        this.dataExpiracao = dataExpiracao;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDateTime getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDateTime dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
