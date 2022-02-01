
package loops.exercicios;

/** Lista 3
 * Questao 16
 * @author VAIO
 */
public class Q16_SerieDeFibonacciMaiorQue500 {

    public static void main(String[] args) {
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        System.out.print(primeiro + " ," + segundo);
        
        while(proximo <= 500){
            
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.print(", " + proximo);
            
        }
        System.out.print(".");
    }
    
}
