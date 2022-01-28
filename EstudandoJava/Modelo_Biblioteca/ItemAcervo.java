package Modelo_Biblioteca;

import java.util.Date;

public abstract class ItemAcervo {
    private String areaConhecimento;
    private String codigoCatalogacao;
    private Date datapublicacao;
    private Situacao situacao;
    private String subtitulo;
    private String titulo;

public ItemAcervo (String areaConhecimento, String codigoCatalogacao,
                   Date datapublicacao, Situacao situacao, String subtitulo, String titulo){

    this.areaConhecimento = areaConhecimento;
    this.codigoCatalogacao = codigoCatalogacao;
    this.datapublicacao = datapublicacao;
    this.situacao = situacao;
    this.subtitulo = subtitulo;
    this.titulo = titulo;
}

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public String getCodigoCatalogacao() {
        return codigoCatalogacao;
    }

    public void setCodigoCatalogacao(String codigoCatalogacao) {
        this.codigoCatalogacao = codigoCatalogacao;
    }

    public Date getDatapublicacao() {
        return datapublicacao;
    }

    public void setDatapublicacao(Date datapublicacao) {
        this.datapublicacao = datapublicacao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
