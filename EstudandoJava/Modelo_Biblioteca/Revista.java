package Modelo_Biblioteca;

import java.util.Date;

public class Revista extends  ItemAcervo {
    private int issn;
    private int numero;
    private int volume;


    public Revista(String areaConhecimento, String codigoCatalogacao, Date datapublicacao, Situacao situacao, String subtitulo, String titulo,
                   int issn, int numero, int volume) {
        super(areaConhecimento, codigoCatalogacao, datapublicacao, situacao, subtitulo, titulo);


        this.issn = issn;
        this.numero = numero;
        this.volume = volume;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public char retornoDeDados (){
        System.out.println(getAreaConhecimento() + getCodigoCatalogacao() + getDatapublicacao() + getSituacao() + getDatapublicacao() + getIssn() + getSubtitulo()
                + getTitulo() + getNumero() + getVolume());

        return 0;
    }
}
