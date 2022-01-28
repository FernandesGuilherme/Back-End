package SistemaControleBancario.Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class FabricaConexao {
    protected Connection conexao;   //1° passo: Criar o aributo de conexão


    /*Construtor para abrir conexão*/

    public FabricaConexao() {
        try {
            String caminhoBanco = "jdbc:postgresql://localhost/controlebancariodb";// 2° Criar a String de conexão

            //Credênciais
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "551527011");
            props.setProperty("ssl", "false");

            //Atribuir caminho e credenciais a Conexão
            this.conexao = DriverManager.getConnection(caminhoBanco, props);
            System.out.println("Conexão Estabelecida");
        }catch (Exception e) {
            System.out.println("Erro ao abrir conexão" + e.getMessage());
        }

    }


    public void fecharConexão(){
        try {
            if (this.conexao != null) { //Verifica se existe uma conexão
                System.out.println("Fechando conexão com o banco...\n");
                this.conexao.close(); // Mata qualquer conexão aberta
                System.out.println("Conexão fechada com sucesso");
            }
        }catch (Exception e){
            System.out.println("ERRO, conexão não finalizada/" + e.getMessage());
        }
    }

}
