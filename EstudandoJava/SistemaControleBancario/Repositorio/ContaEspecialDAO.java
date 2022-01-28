package SistemaControleBancario.Repositorio;

import SistemaControleBancario.Modelo.ContaComum;
import SistemaControleBancario.Modelo.ContaEspecial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContaEspecialDAO extends FabricaConexao {

    public boolean criarContaEspecial (ContaEspecial contaespecial){
        boolean resultado = true;

        try {
            String insert = "INSERT INTO contasespeciais (numeroconta, aberturaconta, fechamentoconta, " +
                    "situacaoconta, senhaconta, saldoconta, limiteconta) VALUES (?,?,?,?,?,?,?)";

            PreparedStatement pstm = this.conexao.prepareStatement(insert);
            pstm.setInt(1,contaespecial.getNumeroConta());
            pstm.setObject(2,contaespecial.getAberturaConta());
            pstm.setObject(3, contaespecial.getFechamentoConta());
            pstm.setInt(4, contaespecial.getSituacaoConta());
            pstm.setInt(5,contaespecial.getSenhaConta());
            pstm.setDouble(6,contaespecial.getSaldoConta());
            pstm.setDouble(7,contaespecial.getLimiteConta());

            pstm.execute();

            System.out.println("Dado(s) inserido(s) com sucesso.");

        }catch (Exception e){
            System.out.println("Erro na inserção"+ e);
            resultado = false;
        }
        return resultado;
    }

    public int atualizarContaEspecial (ContaEspecial contaespecial){
        int resultado = 0;

        try {
            String update = " UPDATE contasespeciais set aberturaconta = ?, fechamentoconta = ? " +
                    ",situacaoconta = ? , senhaconta = ? , saldoconta = ? , limiteconta = ? WHERE numeroconta = ? ";

            PreparedStatement pstm = this.conexao.prepareStatement(update);

            pstm.setObject(1,contaespecial.getAberturaConta());
            pstm.setObject(2, contaespecial.getFechamentoConta());
            pstm.setInt(3, contaespecial.getSituacaoConta());
            pstm.setInt(4,contaespecial.getSenhaConta());
            pstm.setDouble(5,contaespecial.getSaldoConta());
            pstm.setDouble(6,contaespecial.getLimiteConta());
            pstm.setInt(7,contaespecial.getNumeroConta());
            resultado = pstm.executeUpdate();

            System.out.println("Dado (s) atualizados com sucesso ");

        }catch (Exception e){
            System.out.println("Erro ao atualizar " + e.getMessage());
        }
        return resultado;
    }
    public ContaEspecial obterConta (int numeroConta){
        ContaEspecial resultado = null;

        try {
            String select = "SELECT * FROM contasespeciais WHERE numeroconta = ?;";
            PreparedStatement pstm = this.conexao.prepareStatement(select);
            pstm.setInt(1,numeroConta);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {

                resultado = new ContaEspecial();
                resultado.setNumeroConta(rs.getInt("numeroconta"));
                resultado.setAberturaConta(rs.getDate("aberturaconta").toLocalDate());
                if (rs.getDate("fechamentoconta") != null) {
                    resultado.setFechamentoConta(rs.getDate("fechamentoconta").toLocalDate());
                }
                resultado.setSituacaoConta(rs.getInt("situacaoconta"));
                resultado.setSenhaConta(rs.getInt("senhaconta"));
                resultado.setSaldoConta(rs.getDouble("saldoconta"));
                resultado.setLimiteConta(rs.getDouble("limiteconta"));

                System.out.println("Teste");
            }
        }catch (Exception e){
            System.out.println("Não a doda(s) a serem exibidos" + e);
        }
        return  resultado;
    }
    public  void apagarContaEspecial (ContaEspecial contaespecial){

        try {
            String delete = "DELETE FROM contasespeciais WHERE numeroconta= ? ";
            PreparedStatement stm = conexao.prepareStatement(delete);
            stm.setInt(1,contaespecial.getNumeroConta());
            stm.executeUpdate();

        }catch (Exception e){
            System.out.printf("Erroa oa realizar exlusão" + e);
        }

    }
    public int deleteID (int numero){
        int resultado = 0;

        try {
            String delete = "DELETE FROM contasespeciais WHERE numeroconta= ? ";
            PreparedStatement stm = conexao.prepareStatement(delete);
            stm.setInt(1,numero);

            resultado = stm.executeUpdate();
            System.out.println("Pessoa excluída");

        }catch (Exception e){
            System.out.println("Erro ao realizar exclusão" + e);
        }
        return resultado;
    }
}
