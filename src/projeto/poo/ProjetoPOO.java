


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
            System.out.println("1 = CALCULO DE MMC.");
            System.out.println("2 = SOMAR FRAÇÃO.");
            System.out.println("3 = SUBTRAIR FRAÇÃO.");
            System.out.println("4 = MULTIPLICAR FRAÇÃO.");
            System.out.println("5 = DIVIDIR FRAÇÃO.");
            System.out.println("6 = CALCULO DE IMC.");
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
        
                System.err.println("SUA FRAÇÃO: " + (numerador1_soma+numerador2_soma) +" / "+ denominador_soma);
                System.err.println("A APROXIMAÇÃO DEU: " + operar.somaFracao(denominador_soma, numerador1_soma, numerador2_soma));
        
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
        
                System.err.println("SUA FRAÇÃO: " + (numerador1_subtrair-numerador2_subtrair) +" / "+ denominador_subtrair);
                System.err.println("A APROXIMAÇÃO DEU: " + operar.somaFracao(denominador_subtrair, numerador1_subtrair, numerador2_subtrair));
        
                    break;        
              
                    
                    
            // BLOCO QUE SE TRATA DA MULTIPLICAÇÃO DE FRAÇÕES:        
            case 4:
                
                int denominador1_multiplicar = 0;
                int denominador2_multiplicar = 0;
                int numerador1_multiplicar = 0;
                int numerador2_multiplicar = 0;
                
                while ( denominador1_multiplicar == 0 || denominador1_multiplicar == 1 || 
                        denominador2_multiplicar == 0 || denominador2_multiplicar == 1 ) {
                    
                Scanner multiplicar = new Scanner(System.in);
        
                System.out.printf("Digite o primeiro denominador: "); 
                denominador1_multiplicar = multiplicar.nextInt(); 
                System.out.printf("Digite o segundo denominador: "); 
                denominador2_multiplicar = multiplicar.nextInt(); 
                
                System.out.printf("Digite o primeiro numerador: "); 
                numerador1_multiplicar = multiplicar.nextInt(); 
                System.out.printf("Digite o segundo numerador: "); 
                numerador2_multiplicar = multiplicar.nextInt(); 
                
                    if ( denominador1_multiplicar == 0 ) { System.err.println("DENOMINADOR 1 - NÃO HÁ SUPORTE PARA ESTE DENOMINADOR!"); }
                    if ( denominador2_multiplicar == 0 ) { System.err.println("DENOMINADOR 2 - NÃO HÁ SUPORTE PARA ESTE DENOMINADOR!"); }
                    if ( denominador1_multiplicar == 1 ) { System.err.println("DENOMINADOR 1 - NÃO HÁ SUPORTE PARA ESTE DENOMINADOR!"); }
                    if ( denominador2_multiplicar == 1 ) { System.err.println("DENOMINADOR 2 - NÃO HÁ SUPORTE PARA ESTE DENOMINADOR!"); }
                    
                } 
        
                System.err.println("SUA FRAÇÃO: " + (numerador1_multiplicar*numerador2_multiplicar) +" / "+ (denominador1_multiplicar*denominador2_multiplicar));
                System.err.println("A APROXIMAÇÃO DEU: " + operar.multiplicaFracao(numerador1_multiplicar, numerador2_multiplicar, denominador1_multiplicar, denominador2_multiplicar));
                
            break;
            
            
            
            // BLOCO QUE SE TRATA DA DIVISÃO DE FRAÇÕES:    
            case 5:
                
                int denominador1_dividir = 0;
                int denominador2_dividir = 0;
                int numerador1_dividir = 0;
                int numerador2_dividir = 0;
                
                while ( denominador1_dividir == 0 || denominador2_dividir == 0 ) {
                    
                Scanner dividir = new Scanner(System.in);
        
                System.out.printf("Digite o primeiro numerador: "); 
                numerador1_dividir = dividir.nextInt(); 
                System.out.printf("Digite o segundo numerador: "); 
                numerador2_dividir = dividir.nextInt(); 
                
                System.out.printf("Digite o primeiro denominador: "); 
                denominador1_dividir = dividir.nextInt(); 
                System.out.printf("Digite o segundo denominador: "); 
                denominador2_dividir = dividir.nextInt(); 
                
                    if ( denominador1_dividir == 0 ) { System.err.println("DENOMINADOR 1 - NÃO HÁ SUPORTE PARA ESTE DENOMINADOR!"); }
                    if ( denominador2_dividir == 0 ) { System.err.println("DENOMINADOR 2 - NÃO HÁ SUPORTE PARA ESTE DENOMINADOR!"); }
                    
                } 
        
                System.err.println("SUA FRAÇÃO: " + (numerador1_dividir*denominador2_dividir) +" / "+ (denominador1_dividir*numerador2_dividir));
                System.err.println("A APROXIMAÇÃO DEU: " + operar.multiplicaFracao(numerador1_dividir, numerador2_dividir, denominador1_dividir, denominador2_dividir));
                
            break;
            
            
            
            // BLOCO QUE TRATA SOBRE O IMC:
            case 6:
                
                double peso;
                double altura;
                double result;
                Scanner imc = new Scanner(System.in);
                
                System.out.printf("Digite o valor do peso corporal: "); 
                peso = imc.nextDouble(); 
                System.out.printf("Digite o valor da altura: "); 
                altura = imc.nextDouble(); 
                
                result = operar.imc(peso, altura);
                if ( result < 18 ) { System.err.println("A PESSOA ESTÁ ABAIXO DO PESO!"); }
                if ( result > 18 && result < 25 ) { System.err.println("A PESSOA ESTÁ COM O PESO NORMAL!"); }
                if ( result > 25 && result < 30 ) { System.err.println("A PESSOA ESTÁ COM SOBRE PESO!"); }
                if ( result > 30 && result < 35 ) { System.err.println("A PESSOA ESTÁ COM OBESIDADE GRAU I!"); }
                if ( result > 35 && result < 40 ) { System.err.println("A PESSOA ESTÁ COM OBESIDADE GRAU II!"); }
                if ( result > 40 ) { System.err.println("A PESSOA ESTÁ COM OBESIDADE GRAU III!"); }
                
            break;
                
                
            
            // VALORES INVALIDOS:        
            default:
                
                System.err.println("POR FAVOR ESCOLHA UMA OPÇÃO VALIDA!");
                
                
                
        }
    
        
        
    }
    
    
    
    }
    
    
    
}




