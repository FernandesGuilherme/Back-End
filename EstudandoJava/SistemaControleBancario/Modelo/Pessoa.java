package SistemaControleBancario.Modelo;

public class Pessoa {
    protected int idPessoa;
    protected  String  nomePessoa;
    protected  String enderecoPessoa;
    protected int cepPessoa;
    protected String telefonePessoa;
    protected double rendaPessoa;
    protected int situacaoPessoa;
    protected ContaComum contaComum;

    public Pessoa() {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.cepPessoa = cepPessoa;
        this.telefonePessoa = telefonePessoa;
        this.rendaPessoa = rendaPessoa;
        this.situacaoPessoa = situacaoPessoa;
        this.contaComum = contaComum;
    }

    public Pessoa(int idPessoa, String nomePessoa, String enderecoPessoa, int cepPessoa, String telefonePessoa, double rendaPessoa, int situacaoPessoa, ContaComum contaComum) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.cepPessoa = cepPessoa;
        this.telefonePessoa = telefonePessoa;
        this.rendaPessoa = rendaPessoa;
        this.situacaoPessoa = situacaoPessoa;
        this.contaComum = contaComum;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public long getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(int cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public double getRendaPessoa() {
        return rendaPessoa;
    }

    public void setRendaPessoa(double rendaPessoa) {
        this.rendaPessoa = rendaPessoa;
    }

    public int getSituacaoPessoa() {
        return situacaoPessoa;
    }

    public void setSituacaoPessoa(int situacaoPessoa) {
        this.situacaoPessoa = situacaoPessoa;
    }

    public ContaComum getContaComum() {
        return contaComum;
    }

    public void setContaComum(ContaComum contaComum) {
        this.contaComum = contaComum;
    }
}
