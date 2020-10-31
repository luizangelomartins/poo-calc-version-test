


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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int divideFracao(int numerador, int denominador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double imc(double altura, double massa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double celsiusToKelvin(double celcius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double celsiusToFahrenheit(double celcius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double kelvinToCelcius(double kelvin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double fahrenheitToCelcius(double fahrenheit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}




