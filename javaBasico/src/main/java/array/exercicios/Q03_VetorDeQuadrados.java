
package array.exercicios;

/** Lista 4
 *  Questao 3
 * @author VAIO
 */
public class Q03_VetorDeQuadrados {

    public static void main(String[] args) {
        
        int[] vetA = new int[15];
        int[] vetB = new int[15];
        
        //atribuindo valores ao vetor A
        for(int i = 0; i< 15; i++){
            vetA[i] = i + 2*i;
        }
        
        for(int i =0;i<15;i++){
            vetB[i] = vetA[i] * vetA[i];
        }
        
        System.out.println("Vetor A: ");
        for(int i=0;i<15;i++){
            System.out.print(vetA[i] +", ");
        }
        
        System.out.println("\nVetor B: ");
        for(int i=0;i<15;i++){
            System.out.print(vetB[i] +", ");
        }
    }
    
}
