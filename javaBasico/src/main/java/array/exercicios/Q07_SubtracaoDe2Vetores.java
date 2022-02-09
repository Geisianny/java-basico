
package array.exercicios;

/** Lista 4
 *  Questao 7
 * @author VAIO
 */
public class Q07_SubtracaoDe2Vetores {

    public static void main(String[] args) {
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[10];
        
        for(int i =0;i<10;i++){
            vetB[i] = i + 2;
            vetA[i] = i*3 -1;
        } 
        
        for(int i = 0;i<10;i++){
            vetC[i] = vetA[i] - vetB[i];
        }
        
        String a = "Vetor A: " ;
        String b = "Vetor B: ";
        String c = "Vetor C: ";
        for(int i = 0;i<10;i++){
            a += vetA[i] + ", ";
            b += vetB[i] + ", ";
            c += vetC[i] + ", ";
        }
        
        System.out.println(a + "\n" + b + "\n" + c);
        
    }
    
}
