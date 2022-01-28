package SistemaControleBancario.Repositorio;

import SistemaControleBancario.Modelo.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PessoaDao extends  FabricaConexao {
    public int criarPessoa (Pessoa pessoa) {
        int id = 0;

        try {
            String insercao = "INSERT INTO PESSOAS (idpessoa, nomepessoa, enderecopessoa, ceppessoa, telefonepessoa, rendapessoa, situacaopessoa, numeroconta) VALUES (?,?,?,?,?,?,?, ?) ";
            PreparedStatement statement = conexao.prepareStatement(insercao);
            statement.setInt(1, pessoa.getIdPessoa());
            statement.setString(2, pessoa.getNomePessoa());
            statement.setString(3, pessoa.getEnderecoPessoa());
            statement.setLong(4, pessoa.getCepPessoa());
            statement.setString(5, pessoa.getTelefonePessoa());
            statement.setDouble(6, pessoa.getRendaPessoa());
            statement.setInt(7, pessoa.getSituacaoPessoa());
            statement.setObject(8,pessoa.getContaComum().getNumeroConta());

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.printf("Erro de inserção" + e.getMessage());
        }
        return id;
    }

    public ArrayList<Pessoa> recuperarPessoas(){
        ArrayList<Pessoa> resultado = null;

        try {
            String selecao = "SELECT id, nome, endereco, cep, telefone, renda, situacao FROM pessoas ";
            PreparedStatement statement = conexao.prepareStatement(selecao);
            ResultSet rs = statement.executeQuery();
            resultado = new ArrayList<Pessoa>();

            while (rs.next()){
                Pessoa p = new Pessoa();
                p.setIdPessoa(rs.getInt("id"));
                p.setNomePessoa(rs.getString("nome"));
                p.setEnderecoPessoa(rs.getString("Endereço"));
                p.setCepPessoa(rs.getInt("cep"));
                p.setTelefonePessoa(rs.getString("Telefone"));
                p.setRendaPessoa(rs.getDouble("Renda"));
                p.setSituacaoPessoa(rs.getInt("Situação"));

                resultado.add(p);
            }
        }catch (Exception e){
                System.out.printf("Erro ao recuperar dados " +e);
        }
        return resultado;
    }

    public Pessoa recuperarPessoa(int id){
     Pessoa resultado = null;

        try {
            String selecao = "SELECT id, nome, endereco, cep, telefone, renda, situacao FROM pessoas where id ? ";
            PreparedStatement statement = conexao.prepareStatement(selecao);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()){
                resultado = new Pessoa();
                resultado.setIdPessoa(rs.getInt("id"));
                resultado.setNomePessoa(rs.getString("nome"));
                resultado.setEnderecoPessoa(rs.getString("Endereço"));
                resultado.setCepPessoa(rs.getInt("cep"));
                resultado.setTelefonePessoa(rs.getString("Telefone"));
                resultado.setRendaPessoa(rs.getDouble("Renda"));
                resultado.setSituacaoPessoa(rs.getInt("Situação"));
            }
        } catch (Exception e){
            System.out.printf("Erro ao recuperar dados ");
        }
        return resultado;
    }
    public int editarPessoa(Pessoa pessoa) {
        int resultado = 0;

        try {
            String update = "UPDATE pessoa SET nome ?, endereco ?, cep ?, telefone ?, renda ?, situacao ? where id = ? ";
            PreparedStatement statement = conexao.prepareStatement(update);

            statement.setString(1, pessoa.getNomePessoa());
            statement.setString(2, pessoa.getEnderecoPessoa());
            statement.setLong(3, pessoa.getCepPessoa());
            statement.setString(4, pessoa.getTelefonePessoa());
            statement.setDouble(5, pessoa.getRendaPessoa());
            statement.setInt(6, pessoa.getSituacaoPessoa());
            statement.setInt(7, pessoa.getIdPessoa());

            resultado = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    public int removerPessoa(int id){
        int resultado = 0;

        try {
            String delete = "DELETE FROM pessoa where id = ?";
            PreparedStatement statement = conexao.prepareStatement(delete);
            statement.setInt(1,id);

            resultado = statement.executeUpdate();
            
        }catch (Exception e){
            System.out.println(e);
        }
        return  resultado;
    }
}
