

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Guilherme Fernandes
 */
public class teste {


    static int CartelaDoJogador[][] = new int[5][5];
    static int CartelaDaMaquina[][] = new int[5][5];

    static int[] NumerosSorteados = new int[100];
    static int NumeroGerado = 0, cont, contAcertosDaMaquina = 1, contAcertosDoJogador = 1;
    static String IniciarJogo, ProximoNumero, respostaSeGanhou;

    static BufferedReader RespostaSeganhou = new BufferedReader(new InputStreamReader(System.in));
    static BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println(" ");
        System.out.println("  \t\t JOGO    DO    BINGO   ");

        System.out.println("");

        System.out.println("\t Sua cartela; Boa sorte. ");
        CartelaDoJogador();
        OrdenandoCartelaDoJogador();

        System.out.println(" ");

        System.out.println("\t Cartela de outro jogador.");
        CartelaDaMaquina();
        OrdenandoCartelaDaMaquina();

        System.out.println(" ");

        System.out.println("\t Iniciar jogo? (s/n)");
        IniciarJogo = leitura.readLine();
        ComeçandoOBingo();
    }

    public static void CartelaDoJogador() {
        OrdenandoCartelaDoJogador();
        System.out.println("________________________________________________________________________");
        System.out.println("B       |       I       |       N       |       G       |       O       |");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                CartelaDoJogador[i][j] = (int) (Math.random() * 99 + 1);

                if ((i == 2) && (j == 2)) {
                    CartelaDoJogador[i][j] = 00;
                }

                if (CartelaDoJogador[i][j] < 10) {
                    System.out.print("0" + CartelaDoJogador[i][j] + "\t|\t");

                } else {
                    System.out.print(CartelaDoJogador[i][j] + "\t|\t");
                }
            }
            System.out.println("");
        }
        System.out.println("________________________________________________________________________|");
        OrdenandoCartelaDoJogador();
    }

    public static void CartelaDaMaquina() {
        OrdenandoCartelaDaMaquina();
        System.out.println("________________________________________________________________________");
        System.out.println("B       |       I       |       N       |       G       |       O       |");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                CartelaDaMaquina[i][j] = (int) (Math.random() * 99) + 1;

                if ((i == 2) && (j == 2)) {
                    CartelaDaMaquina[i][j] = 00;
                }

                if (CartelaDaMaquina[i][j] < 10) {
                    System.out.print("0" + CartelaDaMaquina[i][j] + "\t|\t");

                } else {
                    System.out.print(CartelaDaMaquina[i][j] + "\t|\t");

                }
            }
            System.out.println("");
        }
        System.out.println("________________________________________________________________________|");
        OrdenandoCartelaDaMaquina();
    }

    public static void OrdenandoCartelaDoJogador() {
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 4) {
                    linha = i + 1;
                    coluna = 0;
                } else {
                    linha = i;
                    coluna = j + 1;
                }

                if ((i == 2) && (j == 2)) {
                    coluna++;
                }
                for (int k = linha; k < 5; k++) {
                    for (int l = coluna; l < 5; l++) {
                        if (!((k == 2) && (l == 2))) {
                            if (CartelaDoJogador[i][j] > CartelaDoJogador[k][l]) {
                                int aux = CartelaDoJogador[k][l];
                                CartelaDoJogador[k][l] = CartelaDoJogador[i][j];
                                CartelaDoJogador[i][j] = aux;
                            }
                        }
                    }
                    coluna = 0;
                }
            }
        }
    }
    public static void OrdenandoCartelaDaMaquina() {
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (j == 4) {
                    linha = i + 1;
                    coluna = 0;

                } else {
                    linha = i;
                    coluna = j + 1;
                }
                if ((i == 2) && (j == 2)) {
                    coluna++;
                }
                for (int k = linha; k < 5; k++) {
                    for (int l = coluna; l < 5; l++) {

                        if (!((k == 2) && (l == 2))) {
                            if (CartelaDaMaquina[i][j] > CartelaDaMaquina[k][l]) {

                                int aux = CartelaDaMaquina[k][l];
                                CartelaDaMaquina[k][l] = CartelaDaMaquina[i][j];
                                CartelaDaMaquina[i][j] = aux;
                            }
                        }
                    }
                    coluna = 0;
                }
            }
        }
    }
    public static void ComeçandoOBingo() throws IOException {
        if (IniciarJogo.equals("s")) {
            System.out.println("\t Gerar número? (s/n)");
            ProximoNumero = leitura.readLine();

            if (ProximoNumero.equals("s")) {
                cont++;
            }

            if (ProximoNumero.equals("n")) {
                System.out.println("Sair do jogo? (s) ");
                respostaSeGanhou = RespostaSeganhou.readLine();

                if (respostaSeGanhou.equals("s")) {
                    System.out.println(" Obrigado por ter jogado!");
                }
            }
            while (ProximoNumero.equals("s")) {
                System.out.println(" ");

                System.out.println("____________________________________________________________________________");
                System.out.println("  \t\t\t JOGO    DO    BINGO   ");

                System.out.println("");
                verificaAcerto(SortNum());
                System.out.println("||----------------------||");
                System.out.println("|  O Número é : " + NumerosSorteados[NumeroGerado - 1] + "      ||                " + "Rodada: " + cont);
                System.out.println("||----------------------||");

                System.out.println(" ");

                System.out.println("\t Sua Cartela");
                System.out.println("________________________________________________________________________");
                System.out.println("B       |       I       |       N       |       G       |       O       |");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (CartelaDoJogador[i][j] < 10) {
                            System.out.print("0" + CartelaDoJogador[i][j] + " \t|\t");
                        } else {
                            System.out.print(CartelaDoJogador[i][j] + "\t|\t");
                        }
                    }
                    System.out.println(" ");
                }
                System.out.println("________________________________________________________________________|");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("\t Cartela da Máquina");
                System.out.println("________________________________________________________________________");
                System.out.println("B       |       I       |       N       |       G       |       O       |");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {

                        if (CartelaDaMaquina[i][j] < 10) {
                            System.out.print("0" + CartelaDaMaquina[i][j] + " \t|\t");
                        } else {
                            System.out.print(CartelaDaMaquina[i][j] + "\t|\t");
                        }
                    }
                    System.out.println(" ");
                }
                System.out.println("________________________________________________________________________|");
                System.out.println("");
                verificandoOGanhador();
                ComeçandoOBingo();
                break;
            }
        }
    }
    public static String SortNum() {
        int NumeroDoBingo = ((int) (Math.random() * 99) + 1);
        NumerosSorteados[NumeroGerado] = NumeroDoBingo;
        if (NumeroGerado > 0) {
            NumerosSorteados[NumeroGerado] = NumeroDoBingo;
            for (int j = 0; j < NumeroGerado; j++) {
                while (NumerosSorteados[j] == NumerosSorteados[NumeroGerado]) {
                    NumerosSorteados[NumeroGerado] = (NumeroDoBingo = ((int) (Math.random() * 99) + 1));
                    j = 0;
                }
            }
        }
        NumeroGerado++;
        String sorteio2;
        if (NumeroDoBingo < 10) {
            sorteio2 = "0" + NumeroDoBingo;
        } else {
            sorteio2 = "" + NumeroDoBingo;
        }
        return sorteio2;
    }
    public static void verificaAcerto(String Num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (CartelaDoJogador[i][j]==Integer.parseInt(Num)) {
                    CartelaDoJogador[i][j] = 00;
                    contAcertosDoJogador++;
                }
                if (CartelaDaMaquina[i][j]==Integer.parseInt(Num)) {
                    CartelaDaMaquina[i][j] = 00;
                    contAcertosDaMaquina++;
                }
            }
        }
    }
    public static void verificandoOGanhador() {
        if (contAcertosDoJogador == 25 && contAcertosDaMaquina == 25) {
            System.out.println(" \t BINGO; O JOGO EMPATOU");
            System.exit(0);
        }
        if (contAcertosDoJogador == 25) {
            System.out.println("\t BINGO; VOCÊ VENCEU, PARABÉNS!");
            System.exit(0);
        }
        if (contAcertosDaMaquina == 25) {
            System.out.println("\t BINGO, QUE PENA VOCÊ PERDEU, MAIS SORTE NA PRÓXIMA");
            System.exit(0);
        }
    }
}
