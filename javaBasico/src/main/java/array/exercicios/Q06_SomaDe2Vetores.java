
package array.exercicios;

/** Lista 7
 *  Questao 6
 * @author VAIO
 */
public class Q06_SomaDe2Vetores {

    public static void main(String[] args) {
        
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[10];
        
        for(int i =0;i<10;i++){
            vetA[i] = i + 3;
            vetB[i] = i*2 + 5;
        } 
        
        for(int i = 0;i<10;i++){
            vetC[i] = vetA[i] + vetB[i];
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
