


    // CRIADOR: Luiz Ângelo Martins.



// PACOTE:
package projeto.poo.classes;



// MÉTODO PRINCIPAL DA CLASSE DE IMPLEMENTAÇÃO:
public class Operacoes_class implements Operacoes {


    
    // MÉTODO DE CALCULO "MMC":
    public int mmc ( int denominador1, int denominador2 ) {

        int a = denominador1;
        int b = denominador2;
        
        while ( b != 0 ) {
        
            int r = a % b;
            a = b;
            b = r;
            
        }
        
        return denominador1 * (denominador2 / a );
        
    }
        
    
    
    // MÉTODO PARA SOMA DE FRAÇÕES:
    @Override
    public int somaFracao(int denominador1, int numerador1, int numerador2) {
      
        int result1;
        double result2;
        
        result1 = numerador1 + numerador2;
        result2 = result1 / denominador1;
        
        return (int)result2;
        
    }

    
    
    // MÉTODO PARA SUBTRAÇÃO DE FRAÇÕES:
    @Override
    public int subtraiFracao(int denominador1, int numerador1, int numerador2) {
     
        int result1;
        double result2;
        
        result1 = numerador1 - numerador2;
        result2 = result1 / denominador1;
        
        return (int) result2;
        
    }

    
    
    // MÉTODO PARA MULTIPLICAÇÃO DE FRAÇÕES:
    @Override
    public int multiplicaFracao(int numerador1, int numerador2, int denominador1, int denominador2) {
        
        int numerador;
        int denominador;
        double result;
        
        numerador = numerador1 * numerador2;
        denominador = denominador1 * denominador2;
        result = numerador / denominador;
        
        return (int) result;
        
    }

    
    
    // MÉTODO PARA DIVISÃO DE FRAÇÕES:
    @Override
    public int divideFracao(int numerador1, int numerador2, int denominador1, int denominador2) {
        
        int numerador;
        int denominador;
        double result;
        
        numerador = numerador1 * denominador2;
        denominador = denominador1 * numerador2;
        result = numerador / denominador;
        
        return (int) result;
        
    }

    
    
    // MÉTODO PARA O CÁLCULO DE IMC ( ÍNDICE DE MASSA CORPORAL ):
    @Override
    public double imc(double peso, double altura) {
        
        double resultado;
        resultado = peso / ( altura * altura );
        
        return resultado;
        
    }

    
    
    // MÉTODO PARA O CÁLCULO DE TEMPERATURA:
    // CELSIUS PARA KELVIN:
    @Override
    public double celsiusToKelvin(double celcius) {
        
        double k;
        k = celcius + 273.15;
        return  k;
        
    }

    
    
    // MÉTODO PARA O CÁLCULO DE TEMPERATURA:
    // CELSIUS PARA FAHRENHEIT:
    @Override
    public double celsiusToFahrenheit(double celcius) {

        double f;
        double aux;
        //aux = 9 / 5;
        f = ( celcius * 9/5 ) + 32;
        return f;
        
    }

    
    
    // MÉTODO PARA O CÁLCULO DE TEMPERATURA:
    // KELVIN PARA CELSIUS:
    @Override
    public double kelvinToCelcius(double kelvin) {

        double celcius;
        celcius = kelvin - 273.15;
        return  celcius;
    
    }

    
    
    // MÉTODO PARA O CÁLCULO DE TEMPERATURA:
    // KELVIN PARA FAHRENHEIT:
    @Override
    public double kelvinToFahrenheit(double kelvin) {
        
        double Fahrenheit;
        Fahrenheit = ( kelvin - 273.15 ) * 9/5 + 32;
        return Fahrenheit;
        
    }

    
    
    // MÉTODO PARA O CÁLCULO DE TEMPERATURA:
    // FAHRENHEIT PARA CELSIUS:
    @Override
    public double fahrenheitToCelcius(double fahrenheit) {

        double celcius;
        celcius = ( fahrenheit - 32 ) * 5/9;
        return celcius;
        
    }


    
    // MÉTODO PARA O CÁLCULO DE TEMPERATURA:
    // FAHRENHEIT PARA KELVIN:
    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        
        double kelvin;
        kelvin = ( fahrenheit - 32 ) * 5/9 + 273.15;
        return kelvin;
                
    }
    
    
    
}




