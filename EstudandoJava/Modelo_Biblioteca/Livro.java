package Modelo_Biblioteca;
import java.util.Date;
public class Livro extends ItemAcervo {
    private int edicao;
    private int isbn;

    public Livro(String areaConhecimento, String codigoCatalogacao, Date datapublicacao, Situacao situacao,
                 String subtitulo, String titulo, int edicao, int isbn) {
        super(areaConhecimento, codigoCatalogacao, datapublicacao, situacao, subtitulo, titulo);

        this.edicao = edicao;
        this.isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
