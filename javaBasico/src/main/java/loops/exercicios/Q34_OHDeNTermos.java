
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questao 34
 * @author VAIO
 */
public class Q34_OHDeNTermos {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();
        
        double soma = 0;
        
        for(int i= 1; i<=n;i++){
                System.out.println(1+"/" + i + " + ");
                soma += 1/i;
           
        }
        
        System.out.println("H = " + soma);
    }
    
}
