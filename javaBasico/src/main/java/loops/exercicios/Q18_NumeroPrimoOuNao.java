
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 18
 * @author VAIO
 */
public class Q18_NumeroPrimoOuNao {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        int contPrimo = 0;
        int contNaoEhPrimo = 0;
        
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                contPrimo++;
            }else{
                contNaoEhPrimo++;
            }
        }
        
        if(contPrimo == 2){
            System.out.println("o numero "+ num + " eh primo!");
            
        }else{
            System.out.println("O numero " + num + " nao eh primo!");
        }
    }
    
}
