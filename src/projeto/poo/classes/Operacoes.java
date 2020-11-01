


    // CRIADOR: Luiz Ângelo Martins.



// PACOTE:
package projeto.poo.classes;



// MÉTODO PRINCIPAL DA CLASSE DE IMPLEMENTAÇÃO:
public interface Operacoes {

    
    
	// Mínimo múltiplo Comum:
	abstract int mmc(int denominador1, int denominador2); 
        
	// Soma:
	abstract int somaFracao(int numerador1, int numerador2, int denominador1); 
        
	// Subtração:
	abstract int subtraiFracao(int numerador1, int numerador2, int denominador1);
        
	// Multiplicação:
	abstract int multiplicaFracao(int numerador1, int numerador2, int denominador1, int denominador2);
        
	// Divisão:
	abstract int divideFracao(int numerador1, int numerador2, int denominador1, int denominador2);
	
	// Índice de massa corporal:
	abstract double imc(double altura, double massa);
	
	// Converter - Celsius para Kelvin:
	abstract double celsiusToKelvin(double celcius);
	
	// Converter - Celsius para Fahrenheit:
	abstract double celsiusToFahrenheit(double celcius);
	
	// Converter - Kelvin para Celsius:
	abstract double kelvinToCelcius(double kelvin);
	
	// Converter - Kelvin para Fahrenheit:
	abstract double kelvinToFahrenheit(double kelvin);
	
	// Converter - Fahrenheit para Celsius:
	abstract double fahrenheitToCelcius(double fahrenheit);
	
	// Converter - Fahrenheit para Kelvin:
	abstract double fahrenheitToKelvin(double fahrenheit);
	
        
        
}




