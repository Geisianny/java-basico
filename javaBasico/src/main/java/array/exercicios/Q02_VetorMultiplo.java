
package array.exercicios;


/**Lista 4
 * Questap 2
 * @author VAIO
 */
public class Q02_VetorMultiplo {

    public static void main(String[] args) {
        
        int[] vetA = new int[5];
        int [] vetB = new int[5];
        
        vetA[0] = 3;
        vetA[1] = 2;
        vetA[2] = 45;
        vetA[3] = 5;
        vetA[4] = 7;

        for(int i = 0;i< 5; i++){
            
            vetB[i] = 2* vetA[i];
        }
        
        System.out.println("Vetor A: ");
        for(int i = 0; i< 5; i++){
            System.out.print(vetA[i] + " ");
        }
        
        System.out.println("\nVetor b: ");
        for(int i = 0; i< 5; i++){
            System.out.print(vetB[i] + " ");
        }
        
    }
    
}
