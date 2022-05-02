package br.com.letscode.raminelli.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Testes {

    static Calculadora calculadora;

    @BeforeAll
    static void init() {
        calculadora = new Calculadora();
    }

    @Test
    void testeSomar() {
        double resultado = calculadora.somar(10, 15);
        Assertions.assertEquals(25, resultado);
    }

    @Test
    @Disabled
    void testeSubtrair() {
        double resultado = calculadora.subtrair(10, 5);
        Assertions.assertEquals(5, resultado);
    }

    @Test
    void testeDividir() {
        double resultado = calculadora.dividir(10, 2);
        Assertions.assertEquals(5, resultado);
    }


}
