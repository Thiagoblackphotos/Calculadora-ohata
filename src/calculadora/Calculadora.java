package calculadora;

/**
 * Classe responsável por realizar cálculos matemáticos básicos para o FinançApp.
 * Esta versão passou pelo processo de refatoração para melhorar a legibilidade.
 *
 * @author Thiago Andrade
 * @version 2.0
 */
public class Calculadora {

    /**
     * Executa uma operação matemática básica entre dois números inteiros.
     *
     * @param valorA O primeiro número.
     * @param valorB O segundo número.
     * @param operacao O operador matemático (+, -, *, /).
     * @return O resultado da operação como um número de ponto flutuante (double).
     * @throws ArithmeticException Se ocorrer uma tentativa de divisão por zero.
     * @throws IllegalArgumentException Se a operação informada for inválida ou nula.
     */
    public double calc(int valorA, int valorB, String operacao) {
        if (operacao == null) {
            throw new IllegalArgumentException("Operação inválida: operação não pode ser nula.");
        }

        // Estrutura switch simplificada e mais legível
        switch (operacao) {
            case "+":
                return somar(valorA, valorB);
            case "-":
                return subtrair(valorA, valorB);
            case "*":
                return multiplicar(valorA, valorB);
            case "/":
                return dividir(valorA, valorB);
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }

    // --- Métodos extraídos para melhorar a legibilidade ---

    private double somar(int valorA, int valorB) {
        return valorA + valorB;
    }

    private double subtrair(int valorA, int valorB) {
        return valorA - valorB;
    }

    private double multiplicar(int valorA, int valorB) {
        return valorA * valorB;
    }

    private double dividir(int valorA, int valorB) {
        if (valorB == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return (double) valorA / valorB;
    }
}