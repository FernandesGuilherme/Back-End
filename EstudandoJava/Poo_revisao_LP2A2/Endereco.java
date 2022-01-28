package Poo_revisao_LP2A2;

public class Endereco {
    private TipoLogradouro tipo;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private long cep;
    private boolean principal;
    private  Pessoa pessoa;

    public Endereco (TipoLogradouro tipo, String logradouro, int numero, String bairro,String cidade, String estado, String pais, long cep, boolean principal, Pessoa pessoa ){
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.principal = principal;
        this.pessoa = pessoa;
    }

    public TipoLogradouro getTipo() {
        return tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
