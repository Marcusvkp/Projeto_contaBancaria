package com.mycompany.appcalculadora;

import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculadora calculadora = new Calculadora();

            System.out.println("Calculadora - Operações disponíveis:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Raiz Quadrada");

            System.out.print("Escolha uma operação (1-5): ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = scanner.nextInt();
                    int resultadoSoma = calculadora.somar(num1, num2);
                    System.out.println("Resultado da adição: " + resultadoSoma);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num4 = scanner.nextInt();
                    int resultadoSubtracao = calculadora.subtrair(num3, num4);
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    int num5 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num6 = scanner.nextInt();
                    int resultadoMultiplicacao = calculadora.multiplicar(num5, num6);
                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    int num7 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num8 = scanner.nextInt();
                    double resultadoDivisao = calculadora.dividir(num7, num8);
                    System.out.println("Resultado da divisão: " + resultadoDivisao);
                    break;
                case 5:
                    System.out.print("Digite o número: ");
                    double num9 = scanner.nextDouble();
                    double resultadoRaizQuadrada = calculadora.calcularRaizQuadrada(num9);
                    System.out.println("Resultado da raiz quadrada: " + resultadoRaizQuadrada);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
