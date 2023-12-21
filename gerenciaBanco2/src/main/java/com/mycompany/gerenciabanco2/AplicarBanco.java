
package com.mycompany.gerenciabanco2;

import java.util.Scanner;

public class AplicarBanco {
    public static void executar(ContaBancaria conta) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - CDB");
            System.out.println("2 - LCI");
            System.out.println("0 - Voltar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    investirCDB(conta);
                    break;
                case 2:
                    investirLCI(conta);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void investirCDB(ContaBancaria conta) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor a ser investido: ");
            double valorInvestido = scanner.nextDouble();

            System.out.print("Digite a quantidade de parcelas (meses): ");
            int quantidadeParcelas = scanner.nextInt();

            double rendimentoMensal = 0.10 / 12; // Rendimento mensal de 10% ao ano
            double rendimentoTotal = valorInvestido * rendimentoMensal * quantidadeParcelas;

            conta.depositar(valorInvestido + rendimentoTotal);

            System.out.println("Investimento em CDB realizado com sucesso.");
            System.out.println("Rendimento total: R$" + rendimentoTotal);
        }
    }

    public static void investirLCI(ContaBancaria conta) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor a ser investido: ");
            double valorInvestido = scanner.nextDouble();

            System.out.print("Digite a quantidade de parcelas (meses): ");
            int quantidadeParcelas = scanner.nextInt();

            double rendimentoMensal = 0.08 / 12; // Rendimento mensal de 8% ao ano
            double rendimentoTotal = valorInvestido * rendimentoMensal * quantidadeParcelas;

            conta.depositar(valorInvestido + rendimentoTotal);

            System.out.println("Investimento em LCI realizado com sucesso.");
            System.out.println("Rendimento total: R$" + rendimentoTotal);
        }
    }
}
