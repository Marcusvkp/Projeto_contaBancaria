
package com.mycompany.gerenciabanco2;

import java.util.Scanner;

public class GerenciaBanco2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ContaBancaria conta = new ContaBancaria();

            System.out.println("Bem-vindo ao sistema de gerenciamento bancário.");

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite seu CPF: ");
            String cpf = scanner.nextLine();

            System.out.println("Cliente: " + nome + " " + sobrenome);
            System.out.println("CPF: " + cpf);

            boolean continuar = true;
            do {
                exibirMenuPrincipal();
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        realizarTransacao(conta);
                        break;
                    case 2:
                        AplicarBanco.executar(conta);
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (continuar);
        }
        System.out.println("Obrigado por utilizar o sistema de gerenciamento bancário.");
    }

    public static void exibirMenuPrincipal() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Transações comuns");
        System.out.println("2 - Investimentos");
        System.out.println("0 - Sair");
    }

    public static void realizarTransacao(ContaBancaria conta) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            do {
                exibirMenuTransacao();
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo: R$" + conta.getSaldo());
                        break;
                    case 2:
                        System.out.print("Digite o valor do depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso.");
                        break;
                    case 3:
                        System.out.print("Digite o valor do saque: ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso.");
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (continuar);
        }
    }

    public static void exibirMenuTransacao() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Verificar saldo");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar saque");
        System.out.println("0 - Voltar");
    }
}
