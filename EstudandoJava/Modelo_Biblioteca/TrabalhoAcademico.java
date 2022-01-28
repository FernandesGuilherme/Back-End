package Modelo_Biblioteca;

import java.util.Date;

public class TrabalhoAcademico extends ItemAcervo {
    private Date dataDefesa;
    private String nomeCurso;
    private TipoTrabalho tipoTrabalho;

    public TrabalhoAcademico(String areaConhecimento, String codigoCatalogacao, Date datapublicacao, Situacao situacao, String subtitulo, String titulo,
                               Date dataDefesa, String nomeCurso, TipoTrabalho tipoTrabalho) {
        super (areaConhecimento, codigoCatalogacao, datapublicacao, situacao, subtitulo, titulo);
        this.dataDefesa = dataDefesa;
        this.nomeCurso = nomeCurso;
        this.tipoTrabalho = tipoTrabalho;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public TipoTrabalho getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(TipoTrabalho tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }
}
