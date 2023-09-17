package lotofacil;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Projeto_Lotofacil {

    public static void main(String[] args) throws IOException {
        menu();
    }

    private static void menu() throws IOException {
        int opcao = -1;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("******Menu LOTOFÁCIL******");
            System.out.println("Opção 1: Apostar de 0 a 100");
            System.out.println("Opção 2: Apostar de A a Z");
            System.out.println("Opção 3: Apostar em par ou ímpar");
            System.out.println("Opção 0: Sair");
            System.out.println("****************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("*****************************");
            switch (opcao) {
                case 1:
                    zeroCem();
                    break;
                case 2:
                    aZ();
                    break;
                case 3:
                    parImpar();
                    break;
                case 0:
                    System.out.println("Você encerrou a aposta!");
                    break;
                default:
                    System.out.println("O número escolhido é inválido!");
                    break;
            }
        } while (opcao != 0);
    }

    private static void zeroCem() {
        int aposta = 0;
        Scanner in = new Scanner(System.in);
        Random rdn = new Random();

        System.out.print("\nDigite o número de 0 a 100 para sua aposta: ");
        aposta = in.nextInt();

        // Sorteio
        int numeroAleatorio = rdn.nextInt(101);
        //System.out.println("\nO número sorteado foi: " + numeroAleatorio);

        if (numeroAleatorio == aposta) {
            System.out.println("\nVocê ganhou R$ 1.000,00");
        } else if (aposta < 0 || aposta > 100) {
            System.out.println("\nAposta inválida!\n");
        } else {
            System.out.println("Que pena o número sorteado foi: " + numeroAleatorio);
        }
    }

    private static void aZ() throws IOException {
        char chx;
        char chxSeuNome = 'J';
        System.out.print("\nDigite uma letra de A a Z para sua aposta: ");
        chx = (char) System.in.read(); // obtém um char
        System.out.println("\nSua letra é: " + chx);
        char chxMaiusculo = Character.toUpperCase(chx);

        if (chxSeuNome == chxMaiusculo) {
            System.out.println("\nVocê ganhou R$ 500,00!\n");
        } else {
            System.out.println("\nQue pena! A letra sorteada foi: " + chxSeuNome);
            System.out.println();
        }
    }

    private static void parImpar() {
        int opcaoparImpar = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("\nInsira um número: ");
        opcaoparImpar = in.nextInt();
        // Lendo o número do usuário

        int resultado = opcaoparImpar % 2;
        // Obtendo o resto da divisão do número por 2

        switch (resultado) {
            case 0:
                System.out.println("Você ganhou R$100,00 reais\n");
                break;
            default:
                System.out.println("\nQue pena!");
                System.out.println("\nO número digitado é ímpar e a premiação foi para números pares.");
                break;
        }
    }
}
