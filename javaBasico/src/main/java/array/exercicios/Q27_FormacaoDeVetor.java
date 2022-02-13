
package array.exercicios;

/** Lista 4
 *  Questao 27
 * @author VAIO
 */
public class Q27_FormacaoDeVetor {

    public static void main(String[] args) {
        
        int[] vetA = {1,25,0,8,6,4,13,5,7,8};
        char[] vetB = new char[10];
        
        for(int i = 0; i< 10; i++){
            if(vetA[i] < 7){
                vetB[i] = 'a';
            }else if(vetA[i] == 7){
                vetB[i] = 'b';
            }else if(vetA[i] > 7 && vetA[i] < 10) {
                vetB[i] = 'c';
            }else if(vetA[i] == 10){
                vetB[i] = 'd';
            }else{
                vetB[i] = 'e';
            }
        }
        
        System.out.print("Vetor c: ");
        for(int i = 0; i< 10;i++){
            System.out.print(vetB[i] + ", ");
        }
    }
    
}
