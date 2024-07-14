package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
    	System.out.println("Soma: " + calc.somar(5, 3));
        assertEquals(8, calc.somar(5, 3), 0);
    }

    @Test
    public void testSubtrair() {
    	System.out.println("Subtração: " + calc.subtrair(5, 3));
        assertEquals(2, calc.subtrair(5, 3), 0);
    }

    @Test
    public void testMultiplicar() {
    	System.out.println("Multiplicação: " + calc.multiplicar(5, 3));
        assertEquals(15, calc.multiplicar(5, 3), 0);
    }

    @Test
    public void testDividir() {
    	System.out.println("Divisão: " + calc.dividir(5, 3));
        assertEquals(1.6667, calc.dividir(5, 3), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorZero() {
        calc.dividir(5, 0);
    }
}
