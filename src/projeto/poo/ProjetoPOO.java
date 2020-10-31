


    // CRIADOR: Luiz Ângelo Martins.



// PACOTE:
package projeto.poo;



// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Scanner;
import projeto.poo.classes.Operacoes_class;



public class ProjetoPOO {

    
    
    // MÉTODO PRINCIPAL DA CLASSE DE IMPLEMENTAÇÃO:
    public static void main (String[] args) {
        
        
        
        // DECLARAÇÃO DO OBJETO PRINCIPAL DE CALCULO:
        Operacoes_class operar = new Operacoes_class();
        
        
        
        // BLOCO QUE SE TRATA DO MMC:
        int denominador1;
        int denominador2;
        Scanner mmc = new Scanner(System.in);
        
        System.out.printf("Digite o primeiro MMC: "); 
        denominador1 = mmc.nextInt(); 
        System.out.printf("Digite o segundo MMC: "); 
        denominador2 = mmc.nextInt(); 
        System.err.println("O MMC DE " + denominador1 + " E " + denominador2 + " E: " + operar.mmc(denominador1, denominador2));
       
        
        
    }
    
    
    
}




