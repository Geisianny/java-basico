
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 13
 * @author VAIO
 */
public class Q13_BaseExpoente {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite dois numeros: ");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        
        int i = 1;
        int res= num;
        while(i < num2){
            res *= num;
            i++;
        }
        
        System.out.println("Potencia de " + num + " ao " + num2 + " é: "+ res);
    }
    
}
