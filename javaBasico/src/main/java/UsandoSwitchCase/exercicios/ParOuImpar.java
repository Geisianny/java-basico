
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 18
 * @author VAIO
 */
public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();   
        
        if(num % 2 == 0){
            System.out.println(num + " é par!");
        }else{
            System.out.println(num + " é impar!");
        }
        
    }
    
}
