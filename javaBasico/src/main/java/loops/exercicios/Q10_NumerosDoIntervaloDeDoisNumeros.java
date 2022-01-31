
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 10
 * @author VAIO
 */
public class Q10_NumerosDoIntervaloDeDoisNumeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 2 numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        for(int i = num1;i <= num2; i++){
            System.out.println(i);
        }
    }
    
}
