


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
        
        
    
    
    
    
    @Override
    public int somaFracao(int numerador, int denominador) {
        
        
        
        int resul;
        
        resul = numerador + denominador;
        
        return resul;
        
    }

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    @Override
    public int subtraiFracao(int numerador, int denominador) {
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int multiplicaFracao(int numerador, int denominador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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




