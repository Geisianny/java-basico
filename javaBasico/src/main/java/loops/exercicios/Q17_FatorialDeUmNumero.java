
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 17
 * @author VAIO
 */
public class Q17_FatorialDeUmNumero {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        int fatorial = 1;
        for(int i = num; i> 0; i--){
            fatorial *= i;
        }
        
        System.out.println("Faatorial de " + num + " é: " + fatorial);
        
    }
    
}
