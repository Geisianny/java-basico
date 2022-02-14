
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 30
 * @author VAIO
 */
public class Q30_ParesEImparesEmVetores {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetA = new int[20];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];
        
        for(int i=0;i<vetA.length;i++){
            System.out.println("Digite o elemento da posiçao " + i);
            vetA[i] = scan.nextInt();
            
        }
          
        int posB = 0;
        int posC = 0;
        
        for(int i = 0; i< vetA.length;i++){
            if(vetA[i] % 2 == 0){
                vetB[posB] = vetA[i];
                posB++;
            }else{
                vetC[posC] = vetA[i];
                posC++;
            }
        }
        
        System.out.print("Vetor A: ");
        for(int i =0; i<vetA.length;i++){
            System.out.print(vetA[i]+", ");
        }
        System.out.println();
   
        System.out.print("Vetor B: ");
        for(int i =0; i<vetA.length;i++){
            System.out.print(vetB[i]+", ");
        }
        System.out.println();
        
        System.out.print("Vetor C: ");
        for(int i =0; i<vetA.length;i++){
            System.out.print(vetC[i]+", ");
        }
        System.out.println();
    }
    
    
 }
    
