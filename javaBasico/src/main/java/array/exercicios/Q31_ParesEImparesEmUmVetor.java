
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 31
 * @author VAIO
 */
public class Q31_ParesEImparesEmUmVetor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetA = new int[20];
        int[] vetB = new int[vetA.length];
        
        for(int i = 0; i <20;i++){
            System.out.println("Digite o elemento da posição "+i);
            vetA[i] = scan.nextInt();
        }
        
        int posPar = 0;
        int posImpar = 10;
        
        for(int i = 0; i< 20; i++){
            if(vetA[i] % 2 == 0){
                vetB[posPar] = vetA[i];
                posPar++;
            }else{
                vetB[posImpar] = vetA[i];
                posImpar++;
            }
        }
        
        System.out.print("Vetor A: ");
        for(int i = 0; i<20;i++){
            System.out.print(vetA[i]+", ");
        }
        System.out.println();
    
        System.out.print("Vetor B: ");
        for(int i = 0; i<20;i++){
            System.out.print(vetB[i]+", ");
        }
        System.out.println();
    }
    
    
}
