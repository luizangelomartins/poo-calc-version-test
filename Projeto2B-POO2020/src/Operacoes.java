public interface Operacoes {

	/*
	 *  Calculadora de Frações
	 */
	
	// Mínimo múltiplo Comum
	abstract int mmc();
	// Soma
	abstract int somaFracao(int numerador, int denominador);
	// Subtração
	abstract int subtraiFracao(int numerador, int denominador);
	// Multiplicação
	abstract int multiplicaFracao(int numerador, int denominador);
	// Divisão
	abstract int divideFracao(int numerador, int denominador);

	
	/*
	 *  Calculadora de IMC
	 */
	
	abstract double imc(double altura, double massa);
	
	/*
	 *  Calculadora de Conversão de Escalas Termométricas
	 */
	
	abstract double celsiusToKelvin(double celcius);
	
	abstract double celsiusToFahrenheit(double celcius);
	
	abstract double kelvinToCelcius(double kelvin);
	
	abstract double kelvinToFahrenheit(double kelvin);
	
	abstract double fahrenheitToCelcius(double fahrenheit);
	
	abstract double fahrenheitToKelvin(double fahrenheit);
	
}