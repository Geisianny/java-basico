
package array.exercicios;

import java.util.Scanner;

/** lista 4
 *  Questao 12
 * @author VAIO
 */
public class Q12_SomaDeElementosDeUmVetor {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int [10];
        int soma = 0;
        
        for(int i = 0; i< 10 ; i++){
            System.out.printf("Digite o %dº elemento do vetor: \n ",(i+1));
            numeros[i] = scan.nextInt();
            
            soma += numeros[i];
            
        }
        
        System.out.print("Vetor A: ");
        for(int i =0; i< 10; i++){
            System.out.print(numeros[i]+", ");
        }
        
        System.out.println("\nA soma dos elementos dos vetores é: " + soma);
    }
    
}
