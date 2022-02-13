
package array.exercicios;

/** Lista 4
 *  Questao 25
 * @author VAIO
 */
public class Q25_FormacaoDeUmVetor {

    public static void main(String[] args) {
        
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        
        for(int i = 0; i<10;i++){
            vetA[i] = i ;
        }
        
        for(int i = 0; i<10;i++){
            if(vetA[i] % 2 == 0){
                vetB[i] = 1;
            }else{
                vetB[i] = 0;
            }
        }
        
        System.out.println("Vetor B: ");
        for(int i=0;i<10;i++){
            System.out.print(vetB[i] + ", ");
        }
    }
    
}
