 
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 15
 * @author VAIO
 */
public class Q15_SerieFibonacci {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o n-esimo termo da serie: ");
        int n = scan.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        
        System.out.print(primeiro + " ," + segundo);
        
        for(int i = 3; i<= n; i++){
            
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.print(", " +proximo);
        }
        
        System.out.print(".");
    }
    
}
