 
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 2
 * @author VAIO
 */
public class ValorPositivoOuNegativo {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int valor = scan.nextInt();
        
        if(valor > 0){
            System.out.println("O valor " + valor + " é positivo!");
        }else{
            System.out.println("O valor "  + valor + " é negativo!");
        }
    }
    
    
}
