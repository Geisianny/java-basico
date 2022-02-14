
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 29
 * @author VAIO
 */
public class Q29_JuncaoDeDoisVetores {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[vetA.length + vetB.length];
        
        for(int i =0; i< vetA.length;i++){
            System.out.println("Digite o elemento da posicao "+i);
            vetA[i] = scan.nextInt();
            
            vetC[i] = vetA[i];
            
        }
        
        for(int i = 0; i< vetB.length; i++){
            System.out.println("Digite o elemento da posicao "+i);
            vetB[i] = scan.nextInt();
            
            vetC[i+10] = vetB[i];
        }
        
        System.out.print("Vetor A: ");
        for(int i = 0;i<10;i++){
            System.out.print(vetA[i]+", ");
        }
        System.out.println();
        
        System.out.print("Vetor B: ");
        for(int i =0; i<10;i++){
            System.out.print(vetB[i] + ", ");
        }
        System.out.println();
        
        System.out.print("Vetor C: ");
        for(int i =0; i<vetC.length;i++){
            System.out.print(vetC[i] + ", ");
        }
        System.out.println();
        
        
    }
    
}
