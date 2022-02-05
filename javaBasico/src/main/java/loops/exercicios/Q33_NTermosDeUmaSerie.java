
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questoa 33
 * @author VAIO
 */
public class Q33_NTermosDeUmaSerie {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();
        double soma = 0;
        
        for(int i =1, j= 1; i<=n; i++ ,j+=2){
            
            System.out.print(i + "/" + j + " + ");
            soma += i/j;
        }
        
        System.out.println("\nSoma = " + soma);
        
    }
    
}
