
package array.exercicios;



/** lista 4
 *  Questao 4
 * @author VAIO
 */
public class Q04_VetorDeRaizQuadrada {

    public static void main(String[] args) {
        
        int[] vetA = new int[15];
        double[] vetB = new double[15];
        
        for(int i = 0; i<15;i++){
            vetA[i] = i + 4;
        }
        
        for(int i = 0; i<15;i++){
            vetB[i] = Math.sqrt(vetA[i]);
        }
        
        System.out.println("Vetor A: ");
        for(int i = 0; i<15;i++){
            System.out.print(vetA[i] + ", ");
        }
        
        System.out.println("\nVetor B: ");
        for(int i = 0; i<15;i++){
            System.out.printf("%.2f ; ",vetB[i]);
        }
    }
    
}
