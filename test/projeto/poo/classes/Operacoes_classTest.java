


    // CRIADOR: Luiz Ângelo Martins.



// PACOTE:
package projeto.poo.classes;



// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;



// MÉTODO PRINCIPAL DA CLASSE DE IMPLEMENTAÇÃO:
public class Operacoes_classTest {
    
    
    
    // DECLARAÇÃO DO OBJETO PRINCIPAL DE CALCULO:
    Operacoes_class calc = new Operacoes_class();
    
    
    
    public Operacoes_classTest() {
    }

    
    
    
    /**
     * TESTE DO METODO MMC, DA CLASSE "Operacoes_class":
     */
    @Test
    public void testMmc() {
        
        int valor;
        valor = calc.mmc(8, 12);
        assertEquals(24, valor);
        
    }

    
    
    
    /**
     * TESTE DO METODO "somaFracao", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testSomaFracao() {
        
        int denominador = 2;
        int numerador1 = 3;
        int numerador2 = 5;
        int resultado = calc.somaFracao(denominador, numerador1, numerador2);
        assertEquals(4, resultado);
        
    }

    
    
    /**
     * TESTE DO METODO "subtraiFracao", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testSubtraiFracao() {
        
        int denominador = 6;
        int numerador1 = 24;
        int numerador2 = 12;
        int resultado = calc.subtraiFracao(denominador, numerador1, numerador2);
        assertEquals(2, resultado);
        
    }

    
    
    /**
     * TESTE DO METODO "multiplicaFracao", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testMultiplicaFracao() {
        
        int denominador1 = 5;
        int denominador2 = 2;
        int numerador1 = 5;
        int numerador2 = 4;
        int resultado = calc.multiplicaFracao(numerador1, numerador2, denominador1, denominador2);
        
        assertEquals(2, resultado);
        
    }

    
    
    /**
     * TESTE DO METODO "divideFracao", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testDivideFracao() {
        
        int denominador1 = 1;
        int denominador2 = 9;
        int numerador1 = 4;
        int numerador2 = 9;
        int resultado = calc.multiplicaFracao(numerador1, numerador2, denominador1, denominador2);
        
        assertEquals(4, resultado);
        
    }

    
    
    
    
    
    
    
    
    
    
    /**
     * Test of imc method, of class Operacoes_class.
     */
    @Test
    public void testImc() {
    }

    /**
     * Test of celsiusToKelvin method, of class Operacoes_class.
     */
    @Test
    public void testCelsiusToKelvin() {
    }

    /**
     * Test of celsiusToFahrenheit method, of class Operacoes_class.
     */
    @Test
    public void testCelsiusToFahrenheit() {
    }

    /**
     * Test of kelvinToCelcius method, of class Operacoes_class.
     */
    @Test
    public void testKelvinToCelcius() {
    }

    /**
     * Test of kelvinToFahrenheit method, of class Operacoes_class.
     */
    @Test
    public void testKelvinToFahrenheit() {
    }

    /**
     * Test of fahrenheitToCelcius method, of class Operacoes_class.
     */
    @Test
    public void testFahrenheitToCelcius() {
    }

    /**
     * Test of fahrenheitToKelvin method, of class Operacoes_class.
     */
    @Test
    public void testFahrenheitToKelvin() {
    }

    /**
     * Test of mdc method, of class Operacoes_class.
     */
    @Test
    public void testMdc() {
    }
    
}




