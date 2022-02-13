
package array.exercicios;

/** Lista 4
 *  Questao 26
 * @author VAIO
 */
public class Q26_FormacaoDeVetor2 {

    public static void main(String[] args) {
        
        int[] vetA = {8,9,1,2,3,5,78,5,2,3};
        int[] vetB = {8,8,1,2,4,4,80,3,5,1};
        int[] vetC = new int[10];
        
        
        
        for(int i=0;i<10;i++){
            if(vetA[i] > vetB[i]){
                vetC[i] = 1;
            }else if(vetA[i] == vetB[i]){
                vetC[i] = 0;
            }else{
                vetC[i] = -1;
            }
        }
        
        System.out.println("Vetor C: ");
        for(int i =0; i< 10; i++){
            System.out.print(vetC[i]+", ");
        }
    }
    
}
