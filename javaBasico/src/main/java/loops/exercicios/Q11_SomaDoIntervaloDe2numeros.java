
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 11
 * @author VAIO
 */
public class Q11_SomaDoIntervaloDe2numeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite 2 numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int soma = 0;
        
        for(int i = num1;i <= num2; i++){
            System.out.println(i);
            
            soma += i;
        }
        
        System.out.println("A soma do intervalo é:  "+soma);
    }
    
}
