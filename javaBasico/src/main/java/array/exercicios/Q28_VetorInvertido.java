
package array.exercicios;

/** Lista 4
 *  Questao 28
 * @author VAIO
 */
public class Q28_VetorInvertido {

    public static void main(String[] args) {
       
        int[] vetA = {2,3,4,7,89,0,1,-3,4,-7};
        int[] vetB = new int[10];
        
        for(int i = 9; i >= 0; i--){
           for(int j = 0; j < 10; j++){
               vetB[j] = vetA[i]; 
           }
        }
        
        System.out.println("Vetor A: ");
        for(int i = 0;i<10;i++){
            System.out.print(vetA[i]+", ");
        }
        
        System.out.println("Vetor B: ");
        for(int i = 0;i<10;i++){
            System.out.print(vetB[i]+", ");
        }
    }
    
}
