
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 * Questao 13
 * @author VAIO
 */
public class Q13_SomaDeMultiplosDe5DeUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        
        for(int i = 0; i< 10; i++){
            System.out.printf("Digite o %dº elemento do vetor:\n",(i+1));
            numeros[i] = scan.nextInt();
            
            if(numeros[i] % 5 == 0){
                soma += numeros[i];
            }
        }
        
        System.out.println("A soma dos multiplos de 5 digitados é: " + soma);
    }
    
}
