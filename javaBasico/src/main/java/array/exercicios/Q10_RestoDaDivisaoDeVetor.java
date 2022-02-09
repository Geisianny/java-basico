
package array.exercicios;

/** Lista 4
 *  Questao 10
 * @author VAIO
 */
public class Q10_RestoDaDivisaoDeVetor {

    public static void main(String[] args) {
        
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        
        for(int i =0;i<10;i++){
            vetA[i] = i;
           
        } 
        
        for(int i = 0;i<10;i++){
            vetB[i] = vetA[i] % 2;
        }
        
        String a = "Vetor A: " ;
        String b = "Vetor B: ";
        
        for(int i = 0;i<10;i++){
            a += vetA[i] + ", ";
            b += vetB[i] + ", ";
            
        }
        
        System.out.println(a + "\n" + b + "\n");
    }
    
}
