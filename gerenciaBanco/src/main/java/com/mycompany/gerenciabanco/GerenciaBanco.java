
package com.mycompany.gerenciabanco;

import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaBancaria();

            System.out.println("Bem-vindo ao sistema de gerenciamento bancário.");

            System.out.print("Digite seu nome: ");
            cliente.setNome(scanner.nextLine());

            System.out.print("Digite seu sobrenome: ");
            cliente.setSobrenome(scanner.nextLine());

            System.out.print("Digite seu CPF: ");
            cliente.setCpf(scanner.nextLine());

            System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getSobrenome());
            System.out.println("CPF: " + cliente.getCpf());

            boolean continuar = true;
            do {
                exibirMenu();
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
        System.out.println("Obrigado por utilizar o sistema de gerenciamento bancário.");
    }

    public static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar saque");
        System.out.println("0 - Encerrar");
    }
}

class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
