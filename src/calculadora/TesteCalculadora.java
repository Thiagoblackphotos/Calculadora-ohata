package calculadora;

/**
 * Classe de testes da {@link Calculadora}.
 * Executa os seis casos exigidos pela atividade e exibe,
 * para cada um, a entrada utilizada, o resultado esperado
 * e o resultado obtido.
 *
 * @author Thiago Andrade
 * @version 1.0
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // 1) SOMA
        double somaObtida = calculadora.calc(5, 3, "+");
        System.out.println("=== TESTE SOMA ===");
        System.out.println("Entrada utilizada : 5 + 3");
        System.out.println("Resultado esperado: 8.0");
        System.out.println("Resultado obtido  : " + somaObtida);
        System.out.println();

        // 2) SUBTRAÇÃO
        double subtracaoObtida = calculadora.calc(10, 4, "-");
        System.out.println("=== TESTE SUBTRAÇÃO ===");
        System.out.println("Entrada utilizada : 10 - 4");
        System.out.println("Resultado esperado: 6.0");
        System.out.println("Resultado obtido  : " + subtracaoObtida);
        System.out.println();

        // 3) MULTIPLICAÇÃO (Corrigido o 'Calc' para 'calc')
        double multiplicacaoObtida = calculadora.calc(7, 6, "*");
        System.out.println("=== TESTE MULTIPLICAÇÃO ===");
        System.out.println("Entrada utilizada : 7 * 6");
        System.out.println("Resultado esperado: 42.0");
        System.out.println("Resultado obtido  : " + multiplicacaoObtida);
        System.out.println();

        // 4) DIVISÃO
        double divisaoObtida = calculadora.calc(20, 4, "/");
        System.out.println("=== TESTE DIVISÃO ===");
        System.out.println("Entrada utilizada : 20 / 4");
        System.out.println("Resultado esperado: 5.0");
        System.out.println("Resultado obtido  : " + divisaoObtida);
        System.out.println();

        // 5) DIVISÃO POR ZERO
        System.out.println("=== TESTE DIVISÃO POR ZERO ===");
        System.out.println("Entrada utilizada : 10 / 0");
        System.out.println("Resultado esperado: ArithmeticException");
        try {
            double resultado = calculadora.calc(10, 0, "/");
            System.out.println("Resultado obtido  : " + resultado + " (nenhuma exceção lançada)");
        } catch (ArithmeticException e) {
            System.out.println("Resultado obtido  : ArithmeticException -> " + e.getMessage());
        }
        System.out.println();

        // 6) OPERAÇÃO INVÁLIDA
        System.out.println("=== TESTE OPERAÇÃO INVÁLIDA ===");
        System.out.println("Entrada utilizada : 5 % 3");
        System.out.println("Resultado esperado: IllegalArgumentException");
        try {
            double resultado = calculadora.calc(5, 3, "%");
            System.out.println("Resultado obtido  : " + resultado + " (nenhuma exceção lançada)");
        } catch (IllegalArgumentException e) {
            System.out.println("Resultado obtido  : IllegalArgumentException -> " + e.getMessage());
        }
    }
}