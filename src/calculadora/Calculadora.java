package calculadora;

/**
 * Classe responsável por operações matemáticas básicas.
 * @author Thiago Andrade
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza operações matemáticas básicas.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @param op A operação (+, -, *, /).
     * @return O resultado da operação.
     */
    public double calc(int a, int b, String op) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        if (op.equals("/")) {
            if (b == 0) throw new ArithmeticException("Divisão por zero não permitida");
            return (double) a / b;
        }
        throw new IllegalArgumentException("Operação inválida: " + op);
    }
}