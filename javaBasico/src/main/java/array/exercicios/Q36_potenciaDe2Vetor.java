

package array.exercicios;

/** Lista 4
 *  Questao 36
 * @author VAIO
 */
public class Q36_potenciaDe2Vetor {

    public static void main(String[] args) {
        
       double[] numeros = new double[11];
       
       for(int i = 0; i< 11; i++){
           
           numeros[i] = Math.pow(2,i);
       }
       
        System.out.print("Vetor numeros: ");
        for(int i = 0;i<11;i++){
            System.out.print(numeros[i]+" , ");
        }
        
        
    }
    
}
