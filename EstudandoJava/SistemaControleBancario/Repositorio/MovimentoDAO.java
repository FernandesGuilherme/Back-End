package SistemaControleBancario.Repositorio;

import SistemaControleBancario.Modelo.Movimento;

import java.sql.PreparedStatement;

public class MovimentoDAO extends FabricaConexao{

    public boolean criarMovimento (Movimento movimento){
            boolean result = true;
            try {
                String insert = "INSERT INTO movimentos (id, tipomovimento, datahoramovimento, valormovimento, numeroconta) VALUES (?,?,?,?,?) ";
                PreparedStatement pst = this.conexao.prepareStatement(insert);
                pst.setInt(1,movimento.getId());
                pst.setInt(2,movimento.gettipoMovimento());
                pst.setObject(3,movimento.getDataHoraMovimento());
                pst.setDouble(4, movimento.getValorMovimento());
                pst.setObject(5,movimento.getContaMovimento().getNumeroConta());

                pst.execute();
                System.out.println("Dados inseridos com sucesso.");

            }catch (Exception e){
                System.out.println("Erro ao inserir dados em movimen" + e.getMessage());
            }
            return result;
    }
    public int editarMovimento (Movimento movimento){
        int resultado = 0;

        try {
            String update = "UPDATE movimentos set  tipomovimento = ?, datahoramovimento = ?, valormovimento = ?, numeroconta = ?" +
                    "WHERE  id = ? ";

            PreparedStatement pstm = conexao.prepareStatement(update);
            pstm.setInt(1, movimento.gettipoMovimento());
            pstm.setObject(2,movimento.getDataHoraMovimento().toLocalDate());
            pstm.setDouble(3,movimento.getValorMovimento());
            pstm.setInt(4,movimento.getContaMovimento().getNumeroConta());
            resultado = pstm.executeUpdate();

            System.out.println("Dado(s) atualizado(s) com sucesso");
        }catch (Exception e){
            System.out.println("Erro ao editar" + e);
        }
        return resultado;
    }
    public int removerMovimento (Movimento movimento){
        int resultado = 0;

        try {
            String delete = "DELETE FROM movimentos Where id = ?";
            PreparedStatement pstm = conexao.prepareStatement(delete);

            pstm.setInt(1,movimento.getId());
            resultado = pstm.executeUpdate();

        }catch (Exception e){
            System.out.println("Erro ao excluir" + e);
        }
        return resultado;
    }
}
