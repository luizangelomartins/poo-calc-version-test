


    // CRIADOR: Luiz Ângelo Martins.



// PACOTE:
package projeto.poo;



// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Scanner;
import projeto.poo.classes.Operacoes_class;



public class ProjetoPOO {

    
    
    // MÉTODO PRINCIPAL DA CLASSE DE IMPLEMENTAÇÃO:
    public static void main (String[] args) {
        
        
        
        // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
        int escolha_usuario = 1;
        Operacoes_class operar = new Operacoes_class();
        
        
        
        // "FILTRAGEM DE ESCOLHAS":
        while ( escolha_usuario != 0 ) {
            
            
            
            // MENU:
            Scanner escolha = new Scanner(System.in);
            System.out.println("");
            System.out.println("0 = SAIR.");
            System.out.println("1 = FAZER MMC.");
            System.out.println("2 = SOMAR FRAÇÃO.");
            System.out.println("3 = SUBTRAIR FRAÇÃO.");
            System.out.println("");
            System.err.printf("DIGITE SUA ESCOLHA: ");
            escolha_usuario = escolha.nextInt(); 
            System.out.println("");
            
            
            
        switch ( escolha_usuario ) {
        
            
            
            // BLOCO QUE SE TRATA DO ENCERRAMENTO DO PROGRAMA:
            case 0:
                
                escolha_usuario = 0;
                
                break;
            
                
                
            // BLOCO QUE SE TRATA DO MMC:
            case 1:
                
                int denominador1;
                int denominador2;
                Scanner mmc = new Scanner(System.in);
        
                System.out.printf("Digite o primeiro MMC: "); 
                denominador1 = mmc.nextInt(); 
                System.out.printf("Digite o segundo MMC: "); 
                denominador2 = mmc.nextInt(); 
                System.err.println("O MMC DE " + denominador1 + " E " + denominador2 + " E: " + operar.mmc(denominador1, denominador2));
            
                    break;
            
            
            
            // BLOCO QUE SE TRATA DA SOMA DE FRAÇÕES:
            case 2:
                
                int denominador_soma = 0;
                int numerador1_soma = 0;
                int numerador2_soma = 0;
                
                while ( denominador_soma == 0 ) {
                    
                Scanner soma = new Scanner(System.in);
        
                System.out.printf("Digite o denominador: "); 
                denominador_soma = soma.nextInt(); 
                System.out.printf("Digite o primeiro numerador: "); 
                numerador1_soma = soma.nextInt(); 
                System.out.printf("Digite o segundo numerador: "); 
                numerador2_soma = soma.nextInt(); 
                
                    if ( denominador_soma == 0 ) { System.err.println("O DENOMINADOR NÃO PODE SER ZERO!"); }
                
                }
        
                System.err.println("O RESULTADO E: " + operar.somaFracao(denominador_soma, numerador1_soma, numerador2_soma));
        
                    break;
                    
                    
                    
            // BLOCO QUE SE TRATA DA SUBTRAÇÃO DE FRAÇÕES:
            case 3:
                
                int denominador_subtrair = 0;
                int numerador1_subtrair = 0;
                int numerador2_subtrair = 0;
                
                while ( denominador_subtrair == 0 ) {
                    
                Scanner subtrair = new Scanner(System.in);
        
                System.out.printf("Digite o denominador: "); 
                denominador_subtrair = subtrair.nextInt(); 
                System.out.printf("Digite o primeiro numerador: "); 
                numerador1_subtrair = subtrair.nextInt(); 
                System.out.printf("Digite o segundo numerador: "); 
                numerador2_subtrair = subtrair.nextInt(); 
                
                    if ( denominador_subtrair == 0 ) { System.err.println("O DENOMINADOR NÃO PODE SER ZERO!"); }
                
                }
        
                System.err.println("A APROXIMAÇÃO DEU: " + operar.somaFracao(denominador_subtrair, numerador1_subtrair, numerador2_subtrair));
        
                    break;        
              
                    
                    
            // VALORES INVALIDOS:        
            default:
                
                System.err.println("POR FAVOR ESCOLHA UMA OPÇÃO VALIDA!");
                
                
                
        }
    
        
        
    }
    
    
    
    }
    
    
    
}




