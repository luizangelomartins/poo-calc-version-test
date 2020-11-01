


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
        int resultado = calc.divideFracao(numerador1, numerador2, denominador1, denominador2);
        
        assertEquals(4, resultado);
        
    }

    
    
    /**
     * TESTE DO METODO "imc", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testImc() {
        
        double peso = 80;
        double altura = 1.80;
        double result = calc.imc(peso, altura);
        
        assertEquals(24.69, result, 1);
        
    }

    
    
    /**
     * TESTE DO METODO "celsiusToKelvin", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testCelsiusToKelvin() {
        
        double celsius = 37.0;
        double kelvin;
        kelvin = calc.celsiusToKelvin(celsius);
        assertEquals(310.15, kelvin, 1);
        
    }

    
    
    /**
     * TESTE DO METODO "celsiusToFahrenheit", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testCelsiusToFahrenheit() {
        
        double CelsiusFahrenheit = 200;
        double Fahrenheit;
        Fahrenheit = calc.celsiusToFahrenheit(CelsiusFahrenheit);
        assertEquals(392, Fahrenheit, 1);
        
    }

    
    
    /**
     * TESTE DO METODO "kelvinToCelcius", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testKelvinToCelcius() {
        
        double kelvin = 310.15;
        double celsius;
        kelvin = calc.kelvinToCelcius(kelvin);
        assertEquals(37.0, kelvin, 1);
        
    }

    
    
    /**
     * TESTE DO METODO "kelvinToFahrenheit", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testKelvinToFahrenheit() {
        
        double kelvin = 50;
        double Fahrenheit;
        Fahrenheit = calc.kelvinToFahrenheit(kelvin);
        assertEquals(-369.67, Fahrenheit, 1);
        
    }

    
    
    /**
     * TESTE DO METODO "fahrenheitToCelcius", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testFahrenheitToCelcius() {
        
        double Fahrenheit = 50;
        double Celcius;
        Celcius = calc.fahrenheitToCelcius(Fahrenheit);
        assertEquals(10, Celcius, 1);
        
    }

    
    
    /**
     * TESTE DO METODO "fahrenheitToKelvin", DA CLASSE "Operacoes_class":
     */
    @Test
    public void testFahrenheitToKelvin() {
        
        double Fahrenheit = 50.0;
        double Kelvin;
        Kelvin = calc.fahrenheitToKelvin(Fahrenheit);
        assertEquals(283.15, Kelvin, 1);
        
    }


    
}




