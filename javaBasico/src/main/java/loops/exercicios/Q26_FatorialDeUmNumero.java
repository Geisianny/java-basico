
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 * Questao 26
 * @author VAIO
 */
public class Q26_FatorialDeUmNumero {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println("Fatorial de : " + num);
        System.out.printf("%d! = ", num);
        
        int fatorial = 1;
        for (int i=num; i>1; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }
        
        System.out.print(" 1 = " + fatorial);
    }
    
}
