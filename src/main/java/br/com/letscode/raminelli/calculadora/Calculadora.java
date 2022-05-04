package br.com.letscode.raminelli.calculadora;


public class Calculadora {

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double dividir(double valor1, double valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Valor2 nao pode ser zero");
        }
        return valor1 / valor2;
    }


    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }
}
