package SistemaControleBancario;

import SistemaControleBancario.Modelo.ContaComum;
import SistemaControleBancario.Modelo.ContaEspecial;
import SistemaControleBancario.Modelo.Pessoa;
import SistemaControleBancario.Repositorio.ContaComumDao;
import SistemaControleBancario.Repositorio.ContaEspecialDAO;
import SistemaControleBancario.Repositorio.PessoaDao;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
      /*
        ContaComum cc = new ContaComum(0011, LocalDate.now(),null,1,1324,500.0);
        Movimento mv = new Movimento(1,1,LocalDateTime.now(),100.0,cc);
        mv.teste();
       ContaComumDao ccd = new ContaComumDao();
       ccd.atualizContaComum(cc);
      //  MovimentoDAO mvd = new MovimentoDAO();

      //  ccd.criarContaComum(cc);
      //  mvd.criarMovimento(mv);
      //  ccd.fecharConexão();

        ccd.atualizContaComum(cc);
         //   ContaEspecialDAO cedao = new ContaEspecialDAO();
*/


      //
       // ContaComum cc = new ContaComum(0011, LocalDate.now(),null,1,1324,500.0);
       // Pessoa pessoa = new Pessoa(1,"Guilherme Lima","Agua da Figueira",'1', "950898021", 2500.0, 1, cc);
/*
        PessoaDao pdao = new PessoaDao();
        ContaComumDao ccdao = new ContaComumDao();

      //  pdao.criarPessoa(pessoa);
        pdao.recuperarPessoa(1);
        pdao.fecharConexão();





     //  ccdao.apagarContaEspecialPorNumero(1);


        ContaComumDao ccd = new ContaComumDao();
        cedao.apagarContaEspecial(ce);

        //cedao.criarContaEspecial(ce);
        //cedao.atualizarContaEspecial(ce);
        //cedao.fecharConexão();

        //cedao.obterConta(1);

        ContaComum cc = new ContaComum(00, LocalDate.now(),null,1,1324,500.0);



        Pessoa obterConta = pdao.recuperarPessoa(1);
        try {
            if (obterConta != null){
                for (Pessoa p : pdao.recuperarPessoas()){
                    System.out.println(p.getContaComum());
                }
            }
        }catch (Exception e){
            System.out.printf("Erro ao recuperar" + e);
        }
        pdao.fecharConexão();




        ContaEspecialDAO cedao = new ContaEspecialDAO();
*/

        ContaEspecial ce = new ContaEspecial(1, LocalDate.now(), null, 1,4444,350.0,5000.0);
        ce.sacarValor(300);

        //Chamar UPDATE depois do saque!
    }
}
