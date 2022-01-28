package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeiroTeste {
    Calculadora calculadora;

    @Before
    public void antesDoteste (){
    calculadora = new Calculadora(); // Antes da execução de cada método, será executado esse.
    }

    @Test
    public void somarTeste(){
        double numero1 = 0, numero2 = 2; // Atributos

        double resultado = calculadora.somar(numero1, numero2); // Chamada do método passando os atributos por parametro

        // compara o valor da variavel resultado com o valor que dever retornar no método somar
        Assert.assertEquals(2, resultado, 0);
    }

    @Test
    public void subtrairTeste(){
        double numero1 = 2, numero2 = 2;

        double resultado = calculadora.subtrair(numero1, numero2);
        Assert.assertEquals(0, resultado, 0);
    }

    @Test
    public void dividirTeste(){
        double numero1 = 2, numero2 = 2;

        double resultado = calculadora.dividir(numero1, numero2);
        Assert.assertEquals(1, resultado, 0);
    }

@Test
    public void multiplicarTeste(){
        double numero1 = 0, numero2 = 2;

        double resultado = calculadora.multiplicar(numero1, numero2);
        Assert.assertEquals(0, resultado, 0);
    }
}
