/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package projeto.poo;

import projeto.poo.classes.Operacoes;
import projeto.poo.classes.Operacoes_class;

/**
 *
 * @author Luiz Ângelo Martins
 */
public class ProjetoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        
        /**Método para calculo do valor da bonificação baseada na
 * seguinte faixa de valores: Para vendas menores de
 * 25.000,00, o percentual de comissão aplicado será de 5%, e * para valores iguais ou maiores de 25.000,00, o percentual
 * será de 10%
 * @author Manoel Pimentel
 * @param valorVendas - Valor total das vendas do mês
 * @return Double - Valor do resultado do cálculo conforme a faixa de comissões.
 */
        
        Operacoes_class operar = new Operacoes_class();
        
        operar.somaFracao(5, 5);
       // ProjetoPOO
        
        // TODO code application logic here
    }
    
}
