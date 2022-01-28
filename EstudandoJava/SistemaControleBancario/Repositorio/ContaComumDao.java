package SistemaControleBancario.Repositorio;

import SistemaControleBancario.Modelo.*;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContaComumDao extends FabricaConexao {

    public boolean criarContaComum(ContaComum contaComum){
        boolean resultado = true;

        try {
                String insert = "INSERT INTO contasComuns (numeroconta,aberturaconta,fechamentoconta,situacaoconta,senhaconta,saldoconta) VALUES (?,?,?,?,?,?) ";
                PreparedStatement pst = this.conexao.prepareStatement(insert);

                pst.setInt(1,contaComum.getNumeroConta());
                pst.setObject(2,contaComum.getAberturaConta());
                pst.setObject(3, contaComum.getFechamentoConta());
                pst.setInt(4, contaComum.getSituacaoConta());
                pst.setInt(5,contaComum.getSenhaConta());
                pst.setDouble(6,contaComum.getSaldoConta());
                pst.execute();

            System.out.println("Dados inseridos com sucesso");

            }catch (Exception e){
                System.out.println("Erro na inserção" + e.getMessage());
                resultado = false;
            }
        return resultado;
    }

    public int atualizContaComum (ContaComum contaComum){
        int resultado = 0;

        try {
        String update = "UPDATE contasComuns set aberturaconta = ?, fechamentoconta = ? ,situacaoconta = ? , senhaconta = ? , saldoconta = ? WHERE numeroconta = ?; ";
        PreparedStatement pst = this.conexao.prepareStatement(update);

        pst.setObject(1,contaComum.getAberturaConta());
        pst.setObject(2, contaComum.getFechamentoConta());
        pst.setInt(3, contaComum.getSituacaoConta());
        pst.setInt(4,contaComum.getSenhaConta());
        pst.setDouble(5,contaComum.getSaldoConta());
        pst.setInt(6,contaComum.getNumeroConta());
        resultado = pst.executeUpdate();

        System.out.println("Dado (s) atualizados com sucesso");

    }catch (Exception e){
        System.out.println("Erro ao atualizar" + e.getMessage());
    }
        return resultado;
    }

    public ContaComum obterContaComum (int numeroConta){
        ContaComum  resultado = null;

        try {
            String select = "Select numeroconta, aberturaconta, fechamentoconta, situacaoconta, senhaconta" +
                    ", saldoconta from contasComuns  WHERE numeroconta = ?; ";
            PreparedStatement pst = this.conexao.prepareStatement(select);

            pst.setInt(1,numeroConta);
            ResultSet rs = pst.executeQuery();

            if (rs.next()){
                resultado = new ContaComum();
                resultado.setNumeroConta(rs.getInt("numeroconta"));
                resultado.setAberturaConta(rs.getDate("aberturaconta").toLocalDate());
                if (rs.getDate("fechamentoconta") != null) {
                    resultado.setFechamentoConta(rs.getDate("fechamentoconta").toLocalDate());
                }
                resultado.setSituacaoConta(rs.getInt("situacaoconta"));
                resultado.setSenhaConta(rs.getInt("senhaconta"));
                resultado.setSaldoConta(rs.getDouble("saldoconta"));
            }
        }catch (Exception e){
            System.out.println("Não há dados a serem exebidos" + e.getMessage());
        }
        return resultado;
    }

    public ContaComum obterTodasContaComum (int numeroConta){
        ContaComum  resultado = null;

        try {
            String select = "Select numeroconta, aberturaconta, fechamentoconta, situacaoconta, senhaconta" +
                    ", saldoconta from contasComuns  WHERE numeroconta = ?; ";
            PreparedStatement pst = this.conexao.prepareStatement(select);

            pst.setInt(1,numeroConta);
            ResultSet rs = pst.executeQuery();

            if (rs.next()){
                resultado = new ContaComum();
                resultado.setNumeroConta(rs.getInt("numeroconta"));
                resultado.setAberturaConta(rs.getDate("aberturaconta").toLocalDate());
                if (rs.getDate("fechamentoconta") != null) {
                    resultado.setFechamentoConta(rs.getDate("fechamentoconta").toLocalDate());
                }
                resultado.setSituacaoConta(rs.getInt("situacaoconta"));
                resultado.setSenhaConta(rs.getInt("senhaconta"));
                resultado.setSaldoConta(rs.getDouble("saldoconta"));
            }
        }catch (Exception e){
            System.out.println("Não há dados a serem exebidos" + e.getMessage());
        }
        return resultado;
    }

    public  void apagarContaEspecial (ContaComum contacomum){

        try {
            String delete = "DELETE FROM contascomuns WHERE numeroconta = ? ";
            PreparedStatement stm = conexao.prepareStatement(delete);
            stm.setInt(1,contacomum.getNumeroConta());
            stm.executeUpdate();

        }catch (Exception e){
            System.out.printf("Erroa oa realizar exlusão" + e);
        }

    }
    public void apagarContaEspecialPorNumero (int numero){
        int resultado = 0;
        try {
            String delete = "DELETE FROM contascomuns WHERE numeroconta = ? ";
            PreparedStatement stm = conexao.prepareStatement(delete);
            stm.setInt(1,numero);
            stm.executeQuery();
        }catch (Exception e){

        }

    }






}
