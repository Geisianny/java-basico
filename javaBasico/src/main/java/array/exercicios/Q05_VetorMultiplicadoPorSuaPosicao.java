
package array.exercicios;

/** Lista 4
 *  Questao 5
 * @author VAIO
 */
public class Q05_VetorMultiplicadoPorSuaPosicao {

    public static void main(String[] args) {
        
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        
        for(int i =0; i< 10;i++){
            vetA[i] = (i+1) *5 ;
        }
        
        for(int i = 0; i<10; i++){
            vetB[i] = vetA[i] * i;
        }
        
        System.out.println("Vetor A: ");
        for(int i = 0; i<10;i++){
            System.out.print(vetA[i]+", ");
        }
        
        System.out.println("\nVetor B: ");
        for(int i = 0; i<10;i++){
            System.out.print(vetB[i]+", ");
        }
    }
    
}
