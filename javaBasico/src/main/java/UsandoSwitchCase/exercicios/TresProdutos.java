 
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 8
 * @author VAIO
 */
public class TresProdutos {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o preço dos tres produtos: ");
        float preco1 = scan.nextFloat();
        float preco2 = scan.nextFloat();
        float preco3 = scan.nextFloat();
        
        float menor = 0;
        
        if(preco1 < preco2 && preco1 < preco3){
            menor = preco1;
        }else if(preco2 < preco1 && preco2 < preco3){
            menor = preco2;
        }else{
            menor = preco3;
        }
        
        System.out.printf("Dado os preços %.2f, %.2f, %.2f a melhor escolher para um "
                + "produto mais barato é: %.2f ", preco1,preco2, preco3, menor );
    }
    
}
