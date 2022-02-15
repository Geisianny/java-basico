
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 * Questao 37
 * @author VAIO
 */
public class Q37_FatoriaisDoVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetA = new int[15];
        int[] vetB = new int[15];
        
        for(int i = 0; i< 15; i++){
            System.out.println("Digite o valor da posicão " + i);
            vetA[i] = scan.nextInt();
        }
        
        for(int i = 0; i<vetA.length; i++){
            vetB[i] = 1;
            for(int j = 1; j<= vetA[i];j++){
                vetB[i] *= j;
            }
        }
        
        System.out.print("Vetor A: ");
        for(int i = 0; i<15;i++){
            System.out.print(vetA[i]+", ");
        }
        System.out.println();
        
        System.out.print("Veto B: ");
        for(int i = 0; i<15;i++){
            System.out.print(vetB[i]+", ");
        }
        
    }
    
}
