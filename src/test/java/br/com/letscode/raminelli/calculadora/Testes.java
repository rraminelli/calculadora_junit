package br.com.letscode.raminelli.calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Testes {

    static Calculadora calculadora;

    @BeforeAll
    static void init() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste somar - Calculadora")
    void testeSomar() {
        double resultado = calculadora.somar(10, 15);
        assertEquals(25, resultado);
    }

    @Test
    @DisplayName("Teste subtrair - Calculadora")
    void testeSubtrair() {
        double resultado = calculadora.subtrair(10, 5);
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste dividir - Calculadora")
    void testeDividir() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Teste multiplicar - Calculadora")
    void testeMultiplicar() {
        double resultado = calculadora.multiplicar(5, 2);
        assertEquals(10, resultado);
    }

    @Test
    void testeDividirErroDivisaoPorZero() {
        try {
            double resultado = calculadora.dividir(10, 0);
            fail("Falha teste Divisao por zero");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals("Valor2 nao pode ser zero",
                    e.getMessage());
        }
    }

    @Test
    void testeDividirErroDivisaoPorZero2() {
        assertThrows(IllegalArgumentException.class,
                () -> calculadora.dividir(5, 0));
    }

}
