
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 28
 * @author VAIO
 */
public class Q28_VetorInvertido {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        
        for(int i =0;i<vetA.length;i++){
            System.out.println("Digite o valor da posição " + i);
            vetA[i] = scan.nextInt();
            
            vetB[vetA.length - i - 1] = vetA[i];
        }
        
        System.out.print("Vetor A: ");
        for(int i = 0;i<10;i++){
            System.out.print(vetA[i]+", ");
        }
        System.out.println();
        
        System.out.print("Vetor B: ");
        for(int i = 0;i<10;i++){
            System.out.print(vetB[i]+", ");
        }
    }
    
}
