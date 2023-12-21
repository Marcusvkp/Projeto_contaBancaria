package com.mycompany.appcalculadora;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
    }

    public double calcularRaizQuadrada(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Erro: número inválido para cálculo de raiz quadrada.");
            return 0;
        }
    }
}
