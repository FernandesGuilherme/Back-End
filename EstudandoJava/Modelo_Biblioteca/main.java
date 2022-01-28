package Modelo_Biblioteca;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date data = new Date();
        Revista r = new Revista("Ciência","ABC123", data, Situacao.Disponivel, "12324", "234",1,10000,10000);
        System.out.println(r.retornoDeDados());

        System.out.println("teste: ");
        System.out.println(r.getDatapublicacao());;

    }
}
