
package array.exercicios;

/** lista 4
 *  Questao 1
 * @author VAIO
 */
public class Q01_CopiaDeVetores {

    public static void main(String[] args) {
        
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        
        vetA[0] = 1;
        vetA[1] = 2;
        vetA[2] = 9;
        vetA[3] = 36;
        vetA[4] = 54;
        
        for(int i = 0; i<5; i++){
            vetB[i] = vetA[i];
        }
        
        System.out.print("vetor A: " );
        for(int i=0;i<5;i++){
            System.out.print(vetA[i] + ", ");
        }
        
        System.out.print("\nvetor B: " );
        for(int i=0;i<5;i++){
            System.out.print( vetB[i] + ", ");
        }
        
    }
    
}
